package com.saydullin.pexelsapp.domain.mapper.curatedImages

import com.saydullin.pexelsapp.domain.mapper.Mapper
import com.saydullin.pexelsapp.domain.model.curatedImages.CuratedImagesItem
import com.saydullin.pexelsapp.domain.model.curatedImages.CuratedImagesItemSrc
import com.saydullin.pexelsapp.presentation.models.CuratedImagesItemUI
import com.saydullin.pexelsapp.presentation.models.CuratedImagesItemSrcUI
import javax.inject.Inject

class CuratedImagesItemMapper @Inject constructor(
    private val curatedImagesItemSrcMapper:
        Mapper<CuratedImagesItemSrc, CuratedImagesItemSrcUI>
): Mapper<CuratedImagesItem, CuratedImagesItemUI>() {

    override fun map(from: CuratedImagesItem): CuratedImagesItemUI {
        return CuratedImagesItemUI(
            id = from.id,
            width = from.width,
            height = from.height,
            url = from.url,
            photographer = from.photographer,
            src = curatedImagesItemSrcMapper.map(from.src),
            photographerUrl = from.photographer_url,
            alt = from.alt,
        )
    }

}


