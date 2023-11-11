package com.saydullin.pexelsapp.domain.mapper.curatedImages

import com.saydullin.pexelsapp.data.db.entities.curatedImages.CuratedImagesEntity
import com.saydullin.pexelsapp.data.db.entities.curatedImages.CuratedImagesItemEntity
import com.saydullin.pexelsapp.domain.mapper.Mapper
import com.saydullin.pexelsapp.domain.model.curatedImages.CuratedImages
import com.saydullin.pexelsapp.domain.model.curatedImages.CuratedImagesItem
import javax.inject.Inject

class CuratedImagesEntityMapper @Inject constructor(
    private val curatedImagesItemEntityMapper:
        Mapper<CuratedImagesItemEntity, CuratedImagesItem>
): Mapper<CuratedImagesEntity, CuratedImages>() {

    override fun map(from: CuratedImagesEntity): CuratedImages {
        return CuratedImages(
            page = from.page,
            perPage = from.perPage,
            photos = from.photos.map { curatedImagesItemEntityMapper.map(it) },
            totalResults = from.totalResults,
            nextPage = from.nextPage,
        )
    }

}


