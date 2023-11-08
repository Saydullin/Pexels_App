package com.saydullin.pexelsapp.domain.mapper

import com.saydullin.pexelsapp.data.db.entities.CollectionFeaturedItemEntity
import com.saydullin.pexelsapp.domain.model.CollectionFeaturedItem
import javax.inject.Inject

class CollectionFeaturedItemEntityMapper @Inject constructor():
    Mapper<CollectionFeaturedItemEntity, CollectionFeaturedItem>() {

    override fun map(from: CollectionFeaturedItemEntity): CollectionFeaturedItem {
        return CollectionFeaturedItem(
            id = from.id,
            title = from.title,
            description = from.description,
            private = from.privates,
            mediaCount = from.mediaCount,
        )
    }

}


