package com.saydullin.pexelsapp.data.db.converters

import androidx.room.ProvidedTypeConverter
import androidx.room.TypeConverter
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken
import com.saydullin.pexelsapp.data.db.entities.curatedImages.CuratedImagesItemEntity

@ProvidedTypeConverter
class CuratedImagesConverter {

    @TypeConverter
    fun fromImagesToString(images: List<CuratedImagesItemEntity>?): String? {
        return Gson().toJson(images)
    }

    @TypeConverter
    fun fromStringToImages(images: String): List<CuratedImagesItemEntity>? {
        val listType = object: TypeToken<List<CuratedImagesItemEntity>>(){}.type
        return Gson().fromJson(images, listType)
    }

}


