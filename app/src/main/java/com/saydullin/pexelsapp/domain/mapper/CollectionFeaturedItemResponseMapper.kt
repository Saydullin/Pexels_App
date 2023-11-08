package com.saydullin.pexelsapp.domain.mapper

import com.saydullin.pexelsapp.data.model.CollectionFeaturedItemResponse
import com.saydullin.pexelsapp.data.model.CollectionFeaturedResponse
import com.saydullin.pexelsapp.domain.model.CollectionFeatured
import com.saydullin.pexelsapp.domain.model.CollectionFeaturedItem
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


