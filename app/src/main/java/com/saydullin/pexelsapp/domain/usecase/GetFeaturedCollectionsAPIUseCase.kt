package com.saydullin.pexelsapp.domain.usecase

import com.saydullin.pexelsapp.domain.model.collectionFeatured.CollectionFeatured
import com.saydullin.pexelsapp.domain.repository.FeaturedCollectionsRepository
import com.saydullin.pexelsapp.domain.utils.Resource
import javax.inject.Inject

class GetFeaturedCollectionsAPIUseCase @Inject constructor(
    private val featuredCollectionsRepository: FeaturedCollectionsRepository,
) {

    suspend fun execute(): Resource<CollectionFeatured> {
        return featuredCollectionsRepository.getFeaturedCollectionsAPI()
    }

}


