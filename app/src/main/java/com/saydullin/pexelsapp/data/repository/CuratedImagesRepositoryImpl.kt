package com.saydullin.pexelsapp.data.repository

import com.saydullin.pexelsapp.api.service.GetCuratedImagesService
import com.saydullin.pexelsapp.data.db.dao.CuratedImagesDao
import com.saydullin.pexelsapp.data.model.curatedImages.CuratedImagesResponse
import com.saydullin.pexelsapp.domain.mapper.curatedImages.CuratedImagesEntityMapper
import com.saydullin.pexelsapp.domain.mapper.curatedImages.CuratedImagesResponseMapper
import com.saydullin.pexelsapp.domain.model.curatedImages.CuratedImages
import com.saydullin.pexelsapp.domain.repository.CuratedImagesRepository
import com.saydullin.pexelsapp.domain.utils.Resource
import com.saydullin.pexelsapp.domain.utils.StatusType
import javax.inject.Inject

class CuratedImagesRepositoryImpl @Inject constructor(
    override val curatedImagesDao: CuratedImagesDao,
    override val getCuratedImagesService: GetCuratedImagesService,
    override val curatedImagesResponseMapper: CuratedImagesResponseMapper,
    override val curatedImagesEntityMapper: CuratedImagesEntityMapper,
) : CuratedImagesRepository {

    override suspend fun getCuratedImagesAPI(): Resource<CuratedImages> {

        return try {
            val res = getCuratedImagesService.getCuratedImages(1, 30)
            if (res.isSuccessful && res.body() != null) {
                val resMapped = curatedImagesResponseMapper.map(res.body() as CuratedImagesResponse)
                return Resource.Success(resMapped)
            }
            Resource.Error(StatusType.CONNECTION_ERROR)
        } catch (e: Exception) {
            e.printStackTrace()
            Resource.Error(StatusType.DATA_ERROR)
        }
    }

    override suspend fun saveCuratedImages(curatedImages: CuratedImages): Resource<Unit> {
        TODO("Not yet implemented")
    }

    override suspend fun getCuratedImagesDB(): Resource<CuratedImages> {
        TODO("Not yet implemented")
    }

}


