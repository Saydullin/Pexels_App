package com.saydullin.pexelsapp.presentation.models

data class CuratedImagesUI(
    val page: Int,
    val perPage: Int,
    val photos: List<CuratedImagesItemUI>,
    val totalResults: Int,
    val nextPage: String,
)


