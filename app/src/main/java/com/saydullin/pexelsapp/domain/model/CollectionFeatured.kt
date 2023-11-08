package com.saydullin.pexelsapp.domain.model

data class CollectionFeatured(
    val page: Int,
    val perPage: Int,
    val collections: List<CollectionFeaturedItem>,
    val totalResults: Int,
    val nextPage: String,
)


