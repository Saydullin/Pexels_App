package com.saydullin.pexelsapp.domain.mapper.collectionFeatured

import com.saydullin.pexelsapp.data.model.collectionFeatured.CollectionFeaturedItemResponse
import com.saydullin.pexelsapp.domain.mapper.Mapper
import com.saydullin.pexelsapp.domain.model.collectionFeatured.CollectionFeaturedItem
import javax.inject.Inject

class CollectionFeaturedItemResponseMapper @Inject constructor():
    Mapper<CollectionFeaturedItemResponse, CollectionFeaturedItem>() {

    override fun map(from: CollectionFeaturedItemResponse): CollectionFeaturedItem {
        return CollectionFeaturedItem(
            id = from.id,
            title = from.title,
            description = from.description,
            private = from.private,
            mediaCount = from.mediaCount,
        )
    }

}


