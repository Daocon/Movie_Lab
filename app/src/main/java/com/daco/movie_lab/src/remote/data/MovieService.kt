package com.daco.movie_lab.src.remote.data

import com.daco.movie_lab.src.remote.MovieResponse
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.POST

interface MovieService {
    @GET("movies")
    suspend fun getListFilms(): Response<List<MovieResponse>>
}