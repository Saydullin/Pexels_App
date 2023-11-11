package com.saydullin.pexelsapp.domain.usecase

import com.saydullin.pexelsapp.domain.model.curatedImages.CuratedImages
import com.saydullin.pexelsapp.domain.repository.CuratedImagesRepository
import com.saydullin.pexelsapp.domain.utils.Resource
import javax.inject.Inject

class GetCuratedImagesAPIUseCase @Inject constructor(
    private val curatedImagesRepository: CuratedImagesRepository,
) {

    suspend fun execute(): Resource<CuratedImages> {
        return curatedImagesRepository.getCuratedImagesAPI()
    }

}


