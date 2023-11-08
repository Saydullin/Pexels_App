package com.saydullin.pexelsapp.api.service

import com.saydullin.pexelsapp.data.model.CollectionFeaturedResponse
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface GetFeaturedCollectionsService {

    @GET("collections/featured")
    suspend fun getFeaturedCollections(
        @Query("per_page") perPage: Int,
    ): Response<CollectionFeaturedResponse>

}


