package com.saydullin.pexelsapp.domain.mapper

import com.saydullin.pexelsapp.data.db.entities.CollectionFeaturedEntity
import com.saydullin.pexelsapp.data.db.entities.CollectionFeaturedItemEntity
import com.saydullin.pexelsapp.domain.model.CollectionFeatured
import com.saydullin.pexelsapp.domain.model.CollectionFeaturedItem
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