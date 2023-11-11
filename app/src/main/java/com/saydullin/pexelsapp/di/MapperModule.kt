package com.saydullin.pexelsapp.di

import com.saydullin.pexelsapp.data.db.entities.collectionFeatured.CollectionFeaturedEntity
import com.saydullin.pexelsapp.data.db.entities.collectionFeatured.CollectionFeaturedItemEntity
import com.saydullin.pexelsapp.data.db.entities.curatedImages.CuratedImagesEntity
import com.saydullin.pexelsapp.data.db.entities.curatedImages.CuratedImagesItemEntity
import com.saydullin.pexelsapp.data.db.entities.curatedImages.CuratedImagesItemSrcEntity
import com.saydullin.pexelsapp.data.model.collectionFeatured.CollectionFeaturedItemResponse
import com.saydullin.pexelsapp.data.model.collectionFeatured.CollectionFeaturedResponse
import com.saydullin.pexelsapp.data.model.curatedImages.CuratedImagesItemResponse
import com.saydullin.pexelsapp.data.model.curatedImages.CuratedImagesItemSrcResponse
import com.saydullin.pexelsapp.data.model.curatedImages.CuratedImagesResponse
import com.saydullin.pexelsapp.domain.mapper.collectionFeatured.CollectionFeaturedEntityMapper
import com.saydullin.pexelsapp.domain.mapper.collectionFeatured.CollectionFeaturedItemEntityMapper
import com.saydullin.pexelsapp.domain.mapper.collectionFeatured.CollectionFeaturedItemMapper
import com.saydullin.pexelsapp.domain.mapper.collectionFeatured.CollectionFeaturedItemResponseMapper
import com.saydullin.pexelsapp.domain.mapper.collectionFeatured.CollectionFeaturedMapper
import com.saydullin.pexelsapp.domain.mapper.collectionFeatured.CollectionFeaturedResponseMapper
import com.saydullin.pexelsapp.domain.mapper.Mapper
import com.saydullin.pexelsapp.domain.mapper.curatedImages.CuratedImagesEntityMapper
import com.saydullin.pexelsapp.domain.mapper.curatedImages.CuratedImagesItemEntityMapper
import com.saydullin.pexelsapp.domain.mapper.curatedImages.CuratedImagesItemMapper
import com.saydullin.pexelsapp.domain.mapper.curatedImages.CuratedImagesItemResponseMapper
import com.saydullin.pexelsapp.domain.mapper.curatedImages.CuratedImagesItemSrcEntityMapper
import com.saydullin.pexelsapp.domain.mapper.curatedImages.CuratedImagesItemSrcMapper
import com.saydullin.pexelsapp.domain.mapper.curatedImages.CuratedImagesItemSrcResponseMapper
import com.saydullin.pexelsapp.domain.mapper.curatedImages.CuratedImagesMapper
import com.saydullin.pexelsapp.domain.mapper.curatedImages.CuratedImagesResponseMapper
import com.saydullin.pexelsapp.domain.model.collectionFeatured.CollectionFeatured
import com.saydullin.pexelsapp.domain.model.collectionFeatured.CollectionFeaturedItem
import com.saydullin.pexelsapp.domain.model.curatedImages.CuratedImages
import com.saydullin.pexelsapp.domain.model.curatedImages.CuratedImagesItem
import com.saydullin.pexelsapp.domain.model.curatedImages.CuratedImagesItemSrc
import com.saydullin.pexelsapp.presentation.models.CollectionFeaturedItemUI
import com.saydullin.pexelsapp.presentation.models.CollectionFeaturedUI
import com.saydullin.pexelsapp.presentation.models.CuratedImagesItemSrcUI
import com.saydullin.pexelsapp.presentation.models.CuratedImagesItemUI
import com.saydullin.pexelsapp.presentation.models.CuratedImagesUI
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

    @Binds
    abstract fun bindCuratedImagesEntityMapper(
        mapper: CuratedImagesEntityMapper
    ): Mapper<CuratedImagesEntity, CuratedImages>

    @Binds
    abstract fun bindCuratedImagesItemResponseMapper(
        mapper: CuratedImagesItemResponseMapper
    ): Mapper<CuratedImagesItemResponse, CuratedImagesItem>

    @Binds
    abstract fun bindCuratedImagesItemSrcResponseMapper(
        mapper: CuratedImagesItemSrcResponseMapper
    ): Mapper<CuratedImagesItemSrcResponse, CuratedImagesItemSrc>

    @Binds
    abstract fun bindCuratedImagesResponseMapper(
        mapper: CuratedImagesResponseMapper
    ): Mapper<CuratedImagesResponse, CuratedImages>

    @Binds
    abstract fun bindCuratedImagesMapper(
        mapper: CuratedImagesMapper
    ): Mapper<CuratedImages, CuratedImagesUI>

    @Binds
    abstract fun bindCuratedImagesItemMapper(
        mapper: CuratedImagesItemMapper
    ): Mapper<CuratedImagesItem, CuratedImagesItemUI>

    @Binds
    abstract fun bindCuratedImagesItemSrcMapper(
        mapper: CuratedImagesItemSrcMapper
    ): Mapper<CuratedImagesItemSrc, CuratedImagesItemSrcUI>

    @Binds
    abstract fun bindCuratedImagesItemEntityMapper(
        mapper: CuratedImagesItemEntityMapper
    ): Mapper<CuratedImagesItemEntity, CuratedImagesItem>

    @Binds
    abstract fun bindCuratedImagesItemSrcEntity(
        mapper: CuratedImagesItemSrcEntityMapper
    ): Mapper<CuratedImagesItemSrcEntity, CuratedImagesItemSrc>

}