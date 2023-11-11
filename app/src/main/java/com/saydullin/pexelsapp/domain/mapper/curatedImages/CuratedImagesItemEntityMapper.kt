package com.saydullin.pexelsapp.domain.mapper.curatedImages

import com.saydullin.pexelsapp.data.db.entities.curatedImages.CuratedImagesItemEntity
import com.saydullin.pexelsapp.data.db.entities.curatedImages.CuratedImagesItemSrcEntity
import com.saydullin.pexelsapp.domain.mapper.Mapper
import com.saydullin.pexelsapp.domain.model.curatedImages.CuratedImagesItem
import com.saydullin.pexelsapp.domain.model.curatedImages.CuratedImagesItemSrc
import javax.inject.Inject

class CuratedImagesItemEntityMapper @Inject constructor(
    private val curatedImagesItemSrcEntityMapper:
        Mapper<CuratedImagesItemSrcEntity, CuratedImagesItemSrc>
): Mapper<CuratedImagesItemEntity, CuratedImagesItem>() {

    override fun map(from: CuratedImagesItemEntity): CuratedImagesItem {
        return CuratedImagesItem(
            id = from.id,
            width = from.width,
            height = from.height,
            url = from.url,
            photographer = from.photographer,
            photographer_url = from.photographer_url,
            photographer_id = from.photographer_id,
            avgColor = from.avgColor,
            src = curatedImagesItemSrcEntityMapper.map(from.src),
            liked = from.liked,
            alt = from.alt
        )
    }

}


