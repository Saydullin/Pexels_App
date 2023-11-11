package com.saydullin.pexelsapp.data.db

import androidx.room.Database
import androidx.room.RoomDatabase
import androidx.room.TypeConverters
import com.saydullin.pexelsapp.data.db.converters.CollectionsFeaturedConverter
import com.saydullin.pexelsapp.data.db.converters.CuratedImagesConverter
import com.saydullin.pexelsapp.data.db.dao.CuratedImagesDao
import com.saydullin.pexelsapp.data.db.dao.FeaturedCollectionsDao
import com.saydullin.pexelsapp.data.db.entities.collectionFeatured.CollectionFeaturedEntity
import com.saydullin.pexelsapp.data.db.entities.collectionFeatured.CollectionFeaturedItemEntity
import com.saydullin.pexelsapp.data.db.entities.curatedImages.CuratedImagesEntity
import com.saydullin.pexelsapp.data.db.entities.curatedImages.CuratedImagesItemEntity
import com.saydullin.pexelsapp.data.db.entities.curatedImages.CuratedImagesItemSrcEntity

@Database(
    entities = [
        CollectionFeaturedEntity::class,
        CollectionFeaturedItemEntity::class,
        CuratedImagesEntity::class,
        CuratedImagesItemEntity::class,
        CuratedImagesItemSrcEntity::class,
    ],
    version = 1,
    exportSchema = true
)
@TypeConverters(
    CollectionsFeaturedConverter::class,
    CuratedImagesConverter::class
)
abstract class AppDatabase: RoomDatabase() {

    abstract fun featuredCollectionsDao(): FeaturedCollectionsDao

    abstract fun curatedImagesDao(): CuratedImagesDao

}


