package com.saydullin.pexelsapp.di

import android.content.Context
import androidx.room.Room
import com.saydullin.pexelsapp.api.RetrofitBuilder
import com.saydullin.pexelsapp.api.service.GetFeaturedCollectionsService
import com.saydullin.pexelsapp.data.db.AppDatabase
import com.saydullin.pexelsapp.data.db.converters.CollectionsFeaturedConverter
import com.saydullin.pexelsapp.data.db.dao.FeaturedCollectionsDao
import com.saydullin.pexelsapp.data.repository.FeaturedCollectionsRepositoryImpl
import com.saydullin.pexelsapp.domain.mapper.CollectionFeaturedEntityMapper
import com.saydullin.pexelsapp.domain.mapper.CollectionFeaturedResponseMapper
import com.saydullin.pexelsapp.domain.repository.FeaturedCollectionsRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class DataModule {

    @Provides
    @Singleton
    fun provideAppDatabase(@ApplicationContext context: Context): AppDatabase {
        return Room.databaseBuilder(
            context,
            AppDatabase::class.java,
            "PexelsDatabase"
        )
            .allowMainThreadQueries()
            .addTypeConverter(
                CollectionsFeaturedConverter()
            )
            .build()
    }

    @Provides
    @Singleton
    fun provideRetrofit() = RetrofitBuilder.getInstance()

    @Provides
    @Singleton
    fun provideFeaturedCollectionsDao(appDatabase: AppDatabase): FeaturedCollectionsDao {
        return appDatabase.featuredCollectionsDao()
    }

    @Provides
    @Singleton
    fun provideFeaturedCollectionsService(retrofit: Retrofit): GetFeaturedCollectionsService {
        return retrofit.create(GetFeaturedCollectionsService::class.java)
    }

    @Provides
    @Singleton
    fun provideFeaturedCollectionsRepository(
        featuredCollectionsDao: FeaturedCollectionsDao,
        getFeaturedCollectionsService: GetFeaturedCollectionsService,
        collectionFeaturedEntityMapper: CollectionFeaturedEntityMapper,
        collectionFeaturedResponseMapper: CollectionFeaturedResponseMapper,
    ): FeaturedCollectionsRepository {
        return FeaturedCollectionsRepositoryImpl(
            featuredCollectionsDao = featuredCollectionsDao,
            getFeaturedCollectionsService = getFeaturedCollectionsService,
            collectionFeaturedResponseMapper = collectionFeaturedResponseMapper,
            collectionFeaturedEntityMapper = collectionFeaturedEntityMapper,
        )
    }

}


