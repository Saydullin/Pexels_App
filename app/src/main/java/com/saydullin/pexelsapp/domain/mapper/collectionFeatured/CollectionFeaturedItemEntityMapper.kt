package com.saydullin.pexelsapp.domain.mapper.collectionFeatured

import com.saydullin.pexelsapp.data.db.entities.collectionFeatured.CollectionFeaturedItemEntity
import com.saydullin.pexelsapp.domain.mapper.Mapper
import com.saydullin.pexelsapp.domain.model.collectionFeatured.CollectionFeaturedItem
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


