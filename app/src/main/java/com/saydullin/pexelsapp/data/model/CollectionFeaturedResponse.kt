package com.saydullin.pexelsapp.data.model

import com.google.gson.annotations.SerializedName

data class CollectionFeaturedResponse(
    val page: Int,
    @SerializedName("per_page")
    val perPage: Int,
    val collections: List<CollectionFeaturedItemResponse>,
    @SerializedName("total_results")
    val totalResults: Int,
    @SerializedName("next_page")
    val nextPage: String,
)


