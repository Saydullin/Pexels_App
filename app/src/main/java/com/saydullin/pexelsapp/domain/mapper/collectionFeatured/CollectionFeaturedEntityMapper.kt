package com.saydullin.pexelsapp.domain.mapper.collectionFeatured

import com.saydullin.pexelsapp.data.db.entities.collectionFeatured.CollectionFeaturedEntity
import com.saydullin.pexelsapp.data.db.entities.collectionFeatured.CollectionFeaturedItemEntity
import com.saydullin.pexelsapp.domain.mapper.Mapper
import com.saydullin.pexelsapp.domain.model.collectionFeatured.CollectionFeatured
import com.saydullin.pexelsapp.domain.model.collectionFeatured.CollectionFeaturedItem
import javax.inject.Inject

class CollectionFeaturedEntityMapper @Inject constructor(
    private val featuredItemEntityMapper:
    Mapper<CollectionFeaturedItemEntity, CollectionFeaturedItem>
): Mapper<CollectionFeaturedEntity, CollectionFeatured>() {

    override fun map(from: CollectionFeaturedEntity): CollectionFeatured {
        return CollectionFeatured(
            page = from.page,
            perPage = from.perPage,
            collections = from.collections.map {
                featuredItemEntityMapper.map(it)
            },
            totalResults = from.totalResults,
            nextPage = from.nextPage,
        )
    }

}