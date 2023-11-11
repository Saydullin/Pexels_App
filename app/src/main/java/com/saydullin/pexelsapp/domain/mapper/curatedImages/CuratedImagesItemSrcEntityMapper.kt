package com.saydullin.pexelsapp.domain.mapper.curatedImages

import com.saydullin.pexelsapp.data.db.entities.curatedImages.CuratedImagesItemSrcEntity
import com.saydullin.pexelsapp.domain.mapper.Mapper
import com.saydullin.pexelsapp.domain.model.curatedImages.CuratedImagesItemSrc
import javax.inject.Inject

class CuratedImagesItemSrcEntityMapper @Inject constructor():
    Mapper<CuratedImagesItemSrcEntity, CuratedImagesItemSrc>() {

    override fun map(from: CuratedImagesItemSrcEntity): CuratedImagesItemSrc {
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


