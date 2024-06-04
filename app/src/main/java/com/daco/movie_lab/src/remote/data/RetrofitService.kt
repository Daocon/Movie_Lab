package com.daco.movie_lab.src.remote.data

import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import java.util.concurrent.TimeUnit

open class RetrofitService() {

    private val retrofit: Retrofit = Retrofit.Builder()
        .baseUrl("https://665f55da1e9017dc16f3cf0a.mockapi.io/movies/")
        .addConverterFactory(GsonConverterFactory.create())
        .client(
            OkHttpClient.Builder()
                .connectTimeout(30, TimeUnit.SECONDS)
                .readTimeout(30, TimeUnit.SECONDS)
                .writeTimeout(30, TimeUnit.SECONDS)
                .addInterceptor(HttpLoggingInterceptor().apply {
                    level = HttpLoggingInterceptor.Level.BODY
                }).build()
        )
        .build()
    val movieService: MovieService by lazy {
        retrofit.create(MovieService::class.java)
    }
    
}