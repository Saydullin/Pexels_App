package com.saydullin.pexelsapp.di

import com.saydullin.pexelsapp.data.db.entities.CollectionFeaturedEntity
import com.saydullin.pexelsapp.data.db.entities.CollectionFeaturedItemEntity
import com.saydullin.pexelsapp.data.model.CollectionFeaturedItemResponse
import com.saydullin.pexelsapp.data.model.CollectionFeaturedResponse
import com.saydullin.pexelsapp.domain.mapper.CollectionFeaturedEntityMapper
import com.saydullin.pexelsapp.domain.mapper.CollectionFeaturedItemEntityMapper
import com.saydullin.pexelsapp.domain.mapper.CollectionFeaturedItemMapper
import com.saydullin.pexelsapp.domain.mapper.CollectionFeaturedItemResponseMapper
import com.saydullin.pexelsapp.domain.mapper.CollectionFeaturedMapper
import com.saydullin.pexelsapp.domain.mapper.CollectionFeaturedResponseMapper
import com.saydullin.pexelsapp.domain.mapper.Mapper
import com.saydullin.pexelsapp.domain.model.CollectionFeatured
import com.saydullin.pexelsapp.domain.model.CollectionFeaturedItem
import com.saydullin.pexelsapp.presentation.models.CollectionFeaturedItemUI
import com.saydullin.pexelsapp.presentation.models.CollectionFeaturedUI
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
abstract class MapperModule {

    @Binds
    abstract fun bindCollectionFeaturedEntityMapper(
        mapper: CollectionFeaturedEntityMapper
    ): Mapper<CollectionFeaturedEntity, CollectionFeatured>

    @Binds
    abstract fun bindCollectionFeaturedItemEntityMapper(
        mapper: CollectionFeaturedItemEntityMapper
    ): Mapper<CollectionFeaturedItemEntity, CollectionFeaturedItem>

    @Binds
    abstract fun bindCollectionFeaturedMapper(
        mapper: CollectionFeaturedMapper
    ): Mapper<CollectionFeatured, CollectionFeaturedUI>

    @Binds
    abstract fun bindCollectionFeaturedItemMapper(
        mapper: CollectionFeaturedItemMapper
    ): Mapper<CollectionFeaturedItem, CollectionFeaturedItemUI>

    @Binds
    abstract fun bindCollectionFeaturedResponseMapper(
        mapper: CollectionFeaturedResponseMapper
    ): Mapper<CollectionFeaturedResponse, CollectionFeatured>

    @Binds
    abstract fun bindCollectionFeaturedItemResponseMapper(
        mapper: CollectionFeaturedItemResponseMapper
    ): Mapper<CollectionFeaturedItemResponse, CollectionFeaturedItem>

}