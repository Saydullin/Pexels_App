package com.saydullin.pexelsapp.domain.mapper.curatedImages

import com.saydullin.pexelsapp.domain.mapper.Mapper
import com.saydullin.pexelsapp.domain.model.curatedImages.CuratedImages
import com.saydullin.pexelsapp.domain.model.curatedImages.CuratedImagesItem
import com.saydullin.pexelsapp.presentation.models.CuratedImagesItemUI
import com.saydullin.pexelsapp.presentation.models.CuratedImagesUI
import javax.inject.Inject

class CuratedImagesMapper @Inject constructor(
    private val curatedImagesItemMapper:
        Mapper<CuratedImagesItem, CuratedImagesItemUI>
): Mapper<CuratedImages, CuratedImagesUI>() {

    override fun map(from: CuratedImages): CuratedImagesUI {
        return CuratedImagesUI(
            page = from.page,
            perPage = from.perPage,
            photos = from.photos.map { curatedImagesItemMapper.map(it) },
            totalResults = from.totalResults,
            nextPage = from.nextPage,
        )
    }

}


