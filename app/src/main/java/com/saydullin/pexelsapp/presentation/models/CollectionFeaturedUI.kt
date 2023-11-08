package com.saydullin.pexelsapp.presentation.models

data class CollectionFeaturedUI(
    val page: Int,
    val perPage: Int,
    val collections: List<CollectionFeaturedItemUI>,
    val totalResults: Int,
    val nextPage: String,
)


