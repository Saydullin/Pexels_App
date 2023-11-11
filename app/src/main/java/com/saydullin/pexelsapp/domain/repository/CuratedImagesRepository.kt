package com.saydullin.pexelsapp.domain.repository

import com.saydullin.pexelsapp.api.service.GetCuratedImagesService
import com.saydullin.pexelsapp.data.db.dao.CuratedImagesDao
import com.saydullin.pexelsapp.domain.mapper.curatedImages.CuratedImagesEntityMapper
import com.saydullin.pexelsapp.domain.mapper.curatedImages.CuratedImagesResponseMapper
import com.saydullin.pexelsapp.domain.model.curatedImages.CuratedImages
import com.saydullin.pexelsapp.domain.utils.Resource

interface CuratedImagesRepository {

    val curatedImagesDao: CuratedImagesDao
    val getCuratedImagesService: GetCuratedImagesService
    val curatedImagesResponseMapper: CuratedImagesResponseMapper
    val curatedImagesEntityMapper: CuratedImagesEntityMapper

    suspend fun getCuratedImagesAPI(): Resource<CuratedImages>

    suspend fun saveCuratedImages(curatedImages: CuratedImages): Resource<Unit>

    suspend fun getCuratedImagesDB(): Resource<CuratedImages>

}


