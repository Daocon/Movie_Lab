package com.daco.movie_lab.src.screen.main

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.daco.movie_lab.model.Movie
import com.daco.movie_lab.src.remote.MovieResponse
import com.daco.movie_lab.src.remote.data.RetrofitService
import kotlinx.coroutines.launch

fun MovieResponse.toMovie(): Movie {
    return Movie(
        filmId = filmId,
        title = title,
        poster = poster,
        synopsis = synopsis,
        cast = cast,
        director = director,
        duration = duration,
        releaseDate = releaseDate,
        rating = rating,
        genre = genre
    )
}

class MovieViewModel : ViewModel() {
    private val _movies = MutableLiveData<List<Movie>>()
    val movies: LiveData<List<Movie>> = _movies
    init {
        getMovies()
    }
    fun getMovies() {
        viewModelScope.launch {
            try {
                val response = RetrofitService().movieService.getListFilms()
                if (response.isSuccessful) {
                    _movies.postValue(response.body()?.map { it.toMovie() })
                } else {
                    _movies.postValue(emptyList())
                }
            } catch (e: Exception) {
                Log.e("TAG", "getMovies: " + e.message)
                _movies.postValue(emptyList())
            }
        }
    }
}