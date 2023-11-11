package com.saydullin.pexelsapp.domain.mapper.curatedImages

import com.saydullin.pexelsapp.data.model.curatedImages.CuratedImagesItemResponse
import com.saydullin.pexelsapp.data.model.curatedImages.CuratedImagesResponse
import com.saydullin.pexelsapp.domain.mapper.Mapper
import com.saydullin.pexelsapp.domain.model.curatedImages.CuratedImages
import com.saydullin.pexelsapp.domain.model.curatedImages.CuratedImagesItem
import javax.inject.Inject

class CuratedImagesResponseMapper @Inject constructor(
    private val curatedImagesItemResponseMapper:
        Mapper<CuratedImagesItemResponse, CuratedImagesItem>
): Mapper<CuratedImagesResponse, CuratedImages>() {

    override fun map(from: CuratedImagesResponse): CuratedImages {
        return CuratedImages(
            page = from.page,
            perPage = from.perPage,
            photos = from.photos.map { curatedImagesItemResponseMapper.map(it) },
            totalResults = from.totalResults,
            nextPage = from.nextPage,
        )
    }

}


