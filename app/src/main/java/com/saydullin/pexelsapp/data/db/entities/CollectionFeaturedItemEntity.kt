package com.saydullin.pexelsapp.data.db.entities

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class CollectionFeaturedItemEntity(
    @PrimaryKey val id: String,
    val title: String,
    val description: String,
    val privates: String,
    val mediaCount: Int,
)