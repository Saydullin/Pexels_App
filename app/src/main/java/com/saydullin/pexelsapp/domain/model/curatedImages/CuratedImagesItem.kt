package com.saydullin.pexelsapp.domain.model.curatedImages

data class CuratedImagesItem(
    val id: Int,
    val width: Int,
    val height: Int,
    val url: String,
    val photographer: String,
    val photographer_url: String,
    val photographer_id: Int,
    val avgColor: String,
    val src: CuratedImagesItemSrc,
    val liked: Boolean,
    val alt: String
)


