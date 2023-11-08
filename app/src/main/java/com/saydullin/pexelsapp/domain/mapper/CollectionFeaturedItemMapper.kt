package com.saydullin.pexelsapp.domain.mapper

import com.saydullin.pexelsapp.domain.model.CollectionFeaturedItem
import com.saydullin.pexelsapp.presentation.models.CollectionFeaturedItemUI
import javax.inject.Inject

class CollectionFeaturedItemMapper @Inject constructor():
    Mapper<CollectionFeaturedItem, CollectionFeaturedItemUI>() {

    override fun map(from: CollectionFeaturedItem): CollectionFeaturedItemUI {
        return CollectionFeaturedItemUI(
            id = from.id,
            title = from.title,
            description = from.description,
            private = from.private,
            mediaCount = from.mediaCount,
        )
    }

}


