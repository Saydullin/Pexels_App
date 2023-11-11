package com.saydullin.pexelsapp.data.db.entities.curatedImages

import androidx.room.Embedded
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class CuratedImagesItemEntity(
    @PrimaryKey val id: Int,
    val width: Int,
    val height: Int,
    val url: String,
    val photographer: String,
    val photographer_url: String,
    val photographer_id: Int,
    val avgColor: String,
    @Embedded("image_") val src: CuratedImagesItemSrcEntity,
    val liked: Boolean,
    val alt: String
)


