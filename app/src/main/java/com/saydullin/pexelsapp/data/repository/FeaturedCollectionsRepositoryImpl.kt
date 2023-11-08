package com.saydullin.pexelsapp.data.repository

import com.saydullin.pexelsapp.api.service.GetFeaturedCollectionsService
import com.saydullin.pexelsapp.data.db.dao.FeaturedCollectionsDao
import com.saydullin.pexelsapp.data.model.CollectionFeaturedResponse
import com.saydullin.pexelsapp.domain.mapper.CollectionFeaturedEntityMapper
import com.saydullin.pexelsapp.domain.mapper.CollectionFeaturedResponseMapper
import com.saydullin.pexelsapp.domain.model.CollectionFeatured
import com.saydullin.pexelsapp.domain.repository.FeaturedCollectionsRepository
import com.saydullin.pexelsapp.domain.utils.Resource
import com.saydullin.pexelsapp.domain.utils.StatusType
import javax.inject.Inject

class FeaturedCollectionsRepositoryImpl @Inject constructor(
    override val featuredCollectionsDao: FeaturedCollectionsDao,
    override val getFeaturedCollectionsService: GetFeaturedCollectionsService,
    override val collectionFeaturedResponseMapper: CollectionFeaturedResponseMapper,
    override val collectionFeaturedEntityMapper: CollectionFeaturedEntityMapper,
) : FeaturedCollectionsRepository {

    override suspend fun getFeaturedCollectionsAPI(): Resource<CollectionFeatured> {

        return try {
            val res = getFeaturedCollectionsService.getFeaturedCollections(6)
            if (res.isSuccessful && res.body() != null) {
                val resMapped = collectionFeaturedResponseMapper.map(res.body() as CollectionFeaturedResponse)
                return Resource.Success(resMapped)
            }
            Resource.Error(StatusType.UNKNOWN_ERROR)
        } catch (e: Exception) {
            e.printStackTrace()
            Resource.Error(StatusType.CONNECTION_ERROR)
        }
    }

    override suspend fun saveFeaturedCollections(collectionFeatured: CollectionFeatured): Resource<Unit> {
        TODO("Not yet implemented")
    }

    override suspend fun getFeaturedCollectionsDB(): Resource<CollectionFeatured> {
        TODO("Not yet implemented")
    }

}


