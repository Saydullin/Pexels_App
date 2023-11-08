package com.saydullin.pexelsapp.data.db

import androidx.room.Database
import androidx.room.RoomDatabase
import androidx.room.TypeConverters
import com.saydullin.pexelsapp.data.db.converters.CollectionsFeaturedConverter
import com.saydullin.pexelsapp.data.db.dao.FeaturedCollectionsDao
import com.saydullin.pexelsapp.data.db.entities.CollectionFeaturedEntity
import com.saydullin.pexelsapp.data.db.entities.CollectionFeaturedItemEntity

@Database(
    entities = [
        CollectionFeaturedEntity::class,
        CollectionFeaturedItemEntity::class,
    ],
    version = 1,
    exportSchema = true
)
@TypeConverters(
    CollectionsFeaturedConverter::class
)
abstract class AppDatabase: RoomDatabase() {

    abstract fun featuredCollectionsDao(): FeaturedCollectionsDao

}


