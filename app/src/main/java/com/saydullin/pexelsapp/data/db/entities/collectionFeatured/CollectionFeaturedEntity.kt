package com.saydullin.pexelsapp.data.db.entities.collectionFeatured

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class CollectionFeaturedEntity(
    @PrimaryKey val id: Int,
    val page: Int,
    val perPage: Int,
    val collections: List<CollectionFeaturedItemEntity>,
    val totalResults: Int,
    val nextPage: String,
)


