package com.saydullin.pexelsapp.domain.mapper

import com.saydullin.pexelsapp.domain.model.CollectionFeatured
import com.saydullin.pexelsapp.domain.model.CollectionFeaturedItem
import com.saydullin.pexelsapp.presentation.models.CollectionFeaturedItemUI
import com.saydullin.pexelsapp.presentation.models.CollectionFeaturedUI
import javax.inject.Inject

class CollectionFeaturedMapper @Inject constructor(
    private val featuredItemMapper:
        Mapper<CollectionFeaturedItem, CollectionFeaturedItemUI>
): Mapper<CollectionFeatured, CollectionFeaturedUI>() {

    override fun map(from: CollectionFeatured): CollectionFeaturedUI {
        return CollectionFeaturedUI(
            page = from.page,
            perPage = from.perPage,
            collections = from.collections.map { featuredItemMapper.map(it) },
            totalResults = from.totalResults,
            nextPage = from.nextPage,
        )
    }

}


