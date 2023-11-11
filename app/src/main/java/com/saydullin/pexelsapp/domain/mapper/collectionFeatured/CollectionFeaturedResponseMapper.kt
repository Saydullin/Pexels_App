package com.saydullin.pexelsapp.domain.mapper.collectionFeatured

import com.saydullin.pexelsapp.data.model.collectionFeatured.CollectionFeaturedItemResponse
import com.saydullin.pexelsapp.data.model.collectionFeatured.CollectionFeaturedResponse
import com.saydullin.pexelsapp.domain.mapper.Mapper
import com.saydullin.pexelsapp.domain.model.collectionFeatured.CollectionFeatured
import com.saydullin.pexelsapp.domain.model.collectionFeatured.CollectionFeaturedItem
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

