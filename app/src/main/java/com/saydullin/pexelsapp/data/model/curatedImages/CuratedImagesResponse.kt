package com.saydullin.pexelsapp.data.model.curatedImages

import com.google.gson.annotations.SerializedName

data class CuratedImagesResponse(
    val page: Int,
    @SerializedName("per_page")
    val perPage: Int,
    val photos: List<CuratedImagesItemResponse>,
    @SerializedName("total_results")
    val totalResults: Int,
    @SerializedName("next_page")
    val nextPage: String,
)


