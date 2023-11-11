package com.saydullin.pexelsapp.domain.mapper.curatedImages

import com.saydullin.pexelsapp.domain.mapper.Mapper
import com.saydullin.pexelsapp.domain.model.curatedImages.CuratedImagesItemSrc
import com.saydullin.pexelsapp.presentation.models.CuratedImagesItemSrcUI
import javax.inject.Inject

class CuratedImagesItemSrcMapper @Inject constructor():
    Mapper<CuratedImagesItemSrc, CuratedImagesItemSrcUI>() {

    override fun map(from: CuratedImagesItemSrc): CuratedImagesItemSrcUI {
        return CuratedImagesItemSrcUI(
            original = from.original,
            large2x = from.large2x,
            large = from.large,
            medium = from.medium,
            small = from.small,
            landscape = from.landscape,
            portrait = from.portrait,
            tiny = from.tiny
        )
    }

}


