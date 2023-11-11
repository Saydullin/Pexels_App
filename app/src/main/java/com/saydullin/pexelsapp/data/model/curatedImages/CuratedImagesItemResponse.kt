package com.saydullin.pexelsapp.data.model.curatedImages

import com.google.gson.annotations.SerializedName

data class CuratedImagesItemResponse(
    val id: Int,
    val width: Int,
    val height: Int,
    val url: String,
    val photographer: String,
    val photographer_url: String,
    val photographer_id: Int,
    @SerializedName("avg_color")
    val avgColor: String,
    val src: CuratedImagesItemSrcResponse,
    val liked: Boolean,
    val alt: String
)


