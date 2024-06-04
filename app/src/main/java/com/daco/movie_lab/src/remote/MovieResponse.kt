package com.daco.movie_lab.src.remote

import com.google.gson.annotations.SerializedName

data class MovieResponse (
    @SerializedName("filmId") val filmId: String,
    @SerializedName("title") val title: String,
    @SerializedName("poster") val poster: String,
    @SerializedName("synopsis") val synopsis: String,
    @SerializedName("cast") val cast: List<String>,
    @SerializedName("director") val director: String,
    @SerializedName("duration") val duration: Int,
    @SerializedName("releaseDate") val releaseDate: String,
    @SerializedName("rating") val rating: Float,
    @SerializedName("genre") val genre: String
)