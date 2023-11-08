package com.saydullin.pexelsapp.domain.repository

import com.saydullin.pexelsapp.api.service.GetFeaturedCollectionsService
import com.saydullin.pexelsapp.data.db.dao.FeaturedCollectionsDao
import com.saydullin.pexelsapp.domain.mapper.CollectionFeaturedEntityMapper
import com.saydullin.pexelsapp.domain.mapper.CollectionFeaturedResponseMapper
import com.saydullin.pexelsapp.domain.model.CollectionFeatured
import com.saydullin.pexelsapp.domain.utils.Resource

interface FeaturedCollectionsRepository {

    val featuredCollectionsDao: FeaturedCollectionsDao
    val getFeaturedCollectionsService: GetFeaturedCollectionsService
    val collectionFeaturedResponseMapper: CollectionFeaturedResponseMapper
    val collectionFeaturedEntityMapper: CollectionFeaturedEntityMapper

    suspend fun getFeaturedCollectionsAPI(): Resource<CollectionFeatured>

    suspend fun saveFeaturedCollections(collectionFeatured: CollectionFeatured): Resource<Unit>

    suspend fun getFeaturedCollectionsDB(): Resource<CollectionFeatured>

}


