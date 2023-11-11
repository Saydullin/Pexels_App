package com.saydullin.pexelsapp.api.service

import com.saydullin.pexelsapp.data.model.curatedImages.CuratedImagesResponse
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface GetCuratedImagesService {

    @GET("curated")
    suspend fun getCuratedImages(
        @Query("page") page: Int,
        @Query("per_page") perPage: Int,
    ): Response<CuratedImagesResponse>

}


