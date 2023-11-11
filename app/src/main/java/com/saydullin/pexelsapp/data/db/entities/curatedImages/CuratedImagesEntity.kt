package com.saydullin.pexelsapp.data.db.entities.curatedImages

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class CuratedImagesEntity(
    @PrimaryKey val id: Int,
    val page: Int,
    val perPage: Int,
    val photos: List<CuratedImagesItemEntity>,
    val totalResults: Int,
    val nextPage: String,
)


