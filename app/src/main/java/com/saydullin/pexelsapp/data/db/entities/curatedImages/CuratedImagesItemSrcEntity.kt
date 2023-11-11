package com.saydullin.pexelsapp.data.db.entities.curatedImages

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class CuratedImagesItemSrcEntity(
    @PrimaryKey val id: Int,
    val original: String,
    val large2x: String,
    val large: String,
    val medium: String,
    val small: String,
    val portrait: String,
    val landscape: String,
    val tiny: String
)


