package com.saydullin.pexelsapp.data.db.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import com.saydullin.pexelsapp.data.db.entities.collectionFeatured.CollectionFeaturedEntity

@Dao
interface FeaturedCollectionsDao {

    @Query("SELECT * FROM CollectionFeaturedEntity")
    fun getCollection(): List<CollectionFeaturedEntity>

    @Insert(CollectionFeaturedEntity::class)
    fun saveCollection(collectionFeaturedEntity: CollectionFeaturedEntity)

}