package com.saydullin.pexelsapp.presentation.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.IntrinsicSize
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.staggeredgrid.LazyVerticalStaggeredGrid
import androidx.compose.foundation.lazy.staggeredgrid.StaggeredGridCells
import androidx.compose.foundation.lazy.staggeredgrid.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalDensity
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import coil.compose.rememberAsyncImagePainter
import com.saydullin.pexelsapp.R
import com.saydullin.pexelsapp.presentation.viewmodel.CuratedImagesViewModel

@Composable
fun ImagesList(viewModel: CuratedImagesViewModel = hiltViewModel()) {

    val cornerRadius = dimensionResource(R.dimen.images_radius)
    val curatedImages = viewModel.curatedImages.value ?: listOf()
    val density = LocalDensity.current

    LazyVerticalStaggeredGrid(
        columns = StaggeredGridCells.Adaptive(minSize = 120.dp),
        modifier = Modifier
            .padding(horizontal = 20.dp),
        horizontalArrangement = Arrangement.spacedBy(20.dp),
        verticalItemSpacing = 20.dp,
    ) {
        items(curatedImages) { image ->
            val imageHeight = with(density) { image.height.toDp() }
            val imageWidth = with(density) { image.width.toDp() }
            val aspectRatio = imageHeight / imageWidth

            Box(
                modifier = Modifier
                    .clip(RoundedCornerShape(cornerRadius))
                    .fillMaxSize()
                    .width(IntrinsicSize.Max)
                    .aspectRatio(aspectRatio)
                    .background(Color.Gray)
            ) {
//                if (image == curatedImages.firstOrNull()
//                    || image == curatedImages.getOrNull(1)) {
//                    Log.e("sady", "first or second")
//                    Spacer(modifier = Modifier.padding(top = 20.dp))
//                }
                Image(
                    painter = rememberAsyncImagePainter(image.src.original),
                    contentDescription = image.alt,
                    contentScale = ContentScale.FillWidth,
                    modifier = Modifier
                        .height(200.dp)
                        .fillMaxSize()
                )
//                if (image == curatedImages.lastOrNull() ||
//                    image == curatedImages.getOrNull(curatedImages.size - 2)
//                ) {
//                    Log.e("sady", "last or prelast")
//                    Spacer(modifier = Modifier.padding(20.dp))
//                }
            }
        }
    }

}


