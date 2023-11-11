package com.saydullin.pexelsapp.data.db.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import com.saydullin.pexelsapp.data.db.entities.curatedImages.CuratedImagesEntity

@Dao
interface CuratedImagesDao {

    @Query("SELECT * FROM CuratedImagesEntity")
    fun getImages(): CuratedImagesEntity

    @Insert(CuratedImagesEntity::class)
    fun saveImages(curatedImages: CuratedImagesEntity)

}