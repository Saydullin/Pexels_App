package com.saydullin.pexelsapp.data.db.converters

import androidx.room.ProvidedTypeConverter
import androidx.room.TypeConverter
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken
import com.saydullin.pexelsapp.data.db.entities.CollectionFeaturedItemEntity

@ProvidedTypeConverter
class CollectionsFeaturedConverter {

    @TypeConverter
    fun fromCollectionToString(collections: List<CollectionFeaturedItemEntity>?): String? {
        return Gson().toJson(collections)
    }

    @TypeConverter
    fun fromStringToCollection(collections: String): List<CollectionFeaturedItemEntity>? {
        val listType = object: TypeToken<List<CollectionFeaturedItemEntity>>(){}.type
        return Gson().fromJson(collections, listType)
    }

}