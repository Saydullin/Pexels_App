package com.saydullin.pexelsapp.presentation.models

data class CuratedImagesItemUI(
    val id: Int,
    val width: Int,
    val height: Int,
    val url: String,
    val photographer: String,
    val src: CuratedImagesItemSrcUI,
    val photographerUrl: String,
    val alt: String,
)


