package com.saydullin.pexelsapp.domain.model.curatedImages

data class CuratedImages(
    val page: Int,
    val perPage: Int,
    val photos: List<CuratedImagesItem>,
    val totalResults: Int,
    val nextPage: String,
)


