package com.saydullin.pexelsapp.domain.mapper.curatedImages

import com.saydullin.pexelsapp.data.model.curatedImages.CuratedImagesItemSrcResponse
import com.saydullin.pexelsapp.domain.mapper.Mapper
import com.saydullin.pexelsapp.domain.model.curatedImages.CuratedImagesItemSrc
import javax.inject.Inject

class CuratedImagesItemSrcResponseMapper @Inject constructor():
    Mapper<CuratedImagesItemSrcResponse, CuratedImagesItemSrc>() {

    override fun map(from: CuratedImagesItemSrcResponse): CuratedImagesItemSrc {
        return CuratedImagesItemSrc(
            original = from.original,
            large2x = from.large2x,
            large = from.large,
            medium = from.medium,
            small = from.small,
            portrait = from.portrait,
            landscape = from.landscape,
            tiny = from.tiny
        )
    }

}


