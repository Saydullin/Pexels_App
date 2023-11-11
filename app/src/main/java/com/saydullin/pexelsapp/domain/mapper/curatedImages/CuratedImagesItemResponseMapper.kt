package com.saydullin.pexelsapp.domain.mapper.curatedImages

import com.saydullin.pexelsapp.data.model.curatedImages.CuratedImagesItemResponse
import com.saydullin.pexelsapp.data.model.curatedImages.CuratedImagesItemSrcResponse
import com.saydullin.pexelsapp.domain.mapper.Mapper
import com.saydullin.pexelsapp.domain.model.curatedImages.CuratedImagesItem
import com.saydullin.pexelsapp.domain.model.curatedImages.CuratedImagesItemSrc
import javax.inject.Inject

class CuratedImagesItemResponseMapper @Inject constructor(
    private val curatedImagesItemSrcResponse:
        Mapper<CuratedImagesItemSrcResponse, CuratedImagesItemSrc>
): Mapper<CuratedImagesItemResponse, CuratedImagesItem>() {

    override fun map(from: CuratedImagesItemResponse): CuratedImagesItem {
        return CuratedImagesItem(
            id = from.id,
            width = from.width,
            height = from.height,
            url = from.url,
            photographer = from.photographer,
            photographer_url = from.photographer_url,
            photographer_id = from.photographer_id,
            avgColor = from.avgColor,
            src = curatedImagesItemSrcResponse.map(from.src),
            liked = from.liked,
            alt = from.alt
        )
    }

}


