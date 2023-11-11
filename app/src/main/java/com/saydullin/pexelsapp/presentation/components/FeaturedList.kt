package com.saydullin.pexelsapp.presentation.components

import android.widget.Toast
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme.colorScheme
import androidx.compose.material3.MaterialTheme.typography
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import com.saydullin.pexelsapp.R
import com.saydullin.pexelsapp.presentation.viewmodel.FeaturedCollectionsViewModel

@Composable
fun FeaturedList(
    viewModel: FeaturedCollectionsViewModel = hiltViewModel()
) {

    val cornerRadius = dimensionResource(R.dimen.corner_radius)
    val featuredList = viewModel.collectionFeatured.value ?: listOf()
    val context = LocalContext.current

    LazyRow(
        horizontalArrangement = Arrangement.spacedBy(10.dp)
    ) {
        items(featuredList) { featured ->
            val isActive = featured == featuredList.firstOrNull()

            Container(
                isActive = isActive,
                modifier = Modifier
                    .clip(RoundedCornerShape(cornerRadius))
                    .clickable {
                        Toast.makeText(context, featured.title, Toast.LENGTH_SHORT).show()
                    },
                innerPadding = PaddingValues(
                    start = if (featured == featuredList.firstOrNull())
                        dimensionResource(R.dimen.side_margins) else 0.dp,
                    end = if (featured == featuredList.lastOrNull())
                        dimensionResource(R.dimen.side_margins) else 0.dp
                ),
            ) {
                Text(
                    text = featured.title,
                    style = if (isActive)
                        typography.titleMedium
                    else
                        typography.labelMedium,
                    color = if (isActive)
                        colorScheme.onPrimary
                    else
                        colorScheme.onSecondary,
                )
            }
        }
    }

}


