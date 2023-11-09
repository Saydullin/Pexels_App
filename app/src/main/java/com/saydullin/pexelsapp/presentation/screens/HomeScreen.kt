package com.saydullin.pexelsapp.presentation.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.stringResource
import androidx.hilt.navigation.compose.hiltViewModel
import com.saydullin.pexelsapp.R
import com.saydullin.pexelsapp.presentation.components.FeaturedList
import com.saydullin.pexelsapp.presentation.components.SearchBar
import com.saydullin.pexelsapp.presentation.viewmodel.FeaturedCollectionsViewModel

@Composable
fun HomeScreen(viewModel: FeaturedCollectionsViewModel = hiltViewModel()) {

    val collections = viewModel.collectionFeatured.value
    val statusType = viewModel.statusType.value
    val context = LocalContext.current

    LaunchedEffect(Unit) {
        viewModel.execute()
    }

    Surface {
        Column {
            SearchBar(
                searchPlaceholder = stringResource(R.string.search),
            )
            FeaturedList()
        }
    }

}


