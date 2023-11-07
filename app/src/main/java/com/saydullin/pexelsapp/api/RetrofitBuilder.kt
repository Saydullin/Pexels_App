package com.saydullin.pexelsapp.api

import com.saydullin.pexelsapp.BuildConfig
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object RetrofitBuilder {

    private const val baseUrl = "https://api.pexels.com/v1/"

    fun getInstance(): Retrofit {
        val okkHttpClient = OkHttpClient.Builder()
            .addInterceptor {
                val request = it.request().newBuilder()
                val url = request.addHeader("Authorization", BuildConfig.API_KEY)
                url.build()

                it.proceed(request.build())
            }
            .build()

        return Retrofit.Builder().baseUrl(baseUrl)
            .addConverterFactory(GsonConverterFactory.create())
            .client(okkHttpClient)
            .build()
    }

}