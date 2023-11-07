package com.saydullin.pexelsapp.api.services

import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface GetFeaturedCollections {

    @GET("curated")
    suspend fun getFeaturedCollections(
        @Query("page") page: Int,
        @Query("per_page") perPage: Int,
    ): Response<Int>

}


