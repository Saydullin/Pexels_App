package com.saydullin.pexelsapp.domain.mapper

import com.saydullin.pexelsapp.data.model.CollectionFeaturedItemResponse
import com.saydullin.pexelsapp.data.model.CollectionFeaturedResponse
import com.saydullin.pexelsapp.domain.model.CollectionFeatured
import com.saydullin.pexelsapp.domain.model.CollectionFeaturedItem
import javax.inject.Inject

class CollectionFeaturedResponseMapper @Inject constructor(
    private val collectionItemResponseMapper:
            Mapper<CollectionFeaturedItemResponse, CollectionFeaturedItem>
): Mapper<CollectionFeaturedResponse, CollectionFeatured>() {

    override fun map(from: CollectionFeaturedResponse): CollectionFeatured {
        return CollectionFeatured(
            page = from.page,
            perPage = from.perPage,
            collections = from.collections.map { collectionItemResponseMapper.map(it) },
            totalResults = from.totalResults,
            nextPage = from.nextPage,
        )
    }

}

