package com.saydullin.pexelsapp.presentation.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.res.stringResource
import androidx.hilt.navigation.compose.hiltViewModel
import com.saydullin.pexelsapp.R
import com.saydullin.pexelsapp.presentation.components.FeaturedList
import com.saydullin.pexelsapp.presentation.components.ImagesList
import com.saydullin.pexelsapp.presentation.components.SearchBar
import com.saydullin.pexelsapp.presentation.viewmodel.CuratedImagesViewModel
import com.saydullin.pexelsapp.presentation.viewmodel.FeaturedCollectionsViewModel

@Composable
fun HomeScreen(
    featuredCollectionVM: FeaturedCollectionsViewModel = hiltViewModel(),
    curatedImagesVM: CuratedImagesViewModel = hiltViewModel(),
) {

    LaunchedEffect(Unit) {
        featuredCollectionVM.execute()
        curatedImagesVM.execute()
    }

    Surface {
        Column {
            SearchBar(
                searchPlaceholder = stringResource(R.string.search),
            )
            FeaturedList()
            ImagesList()
        }
    }

}


