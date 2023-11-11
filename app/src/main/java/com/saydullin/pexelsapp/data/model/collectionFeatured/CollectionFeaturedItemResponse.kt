package com.saydullin.pexelsapp.data.model.collectionFeatured

import com.google.gson.annotations.SerializedName

data class CollectionFeaturedItemResponse(
    val id: String,
    val title: String,
    val description: String,
    val private: String,
    @SerializedName("media_count")
    val mediaCount: Int,
)


