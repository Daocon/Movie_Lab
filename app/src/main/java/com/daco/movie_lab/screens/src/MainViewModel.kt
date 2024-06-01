package com.daco.movie_lab.screens.src

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.daco.movie_lab.model.Movie

class MainViewModel: ViewModel(){
    private val _movies = MutableLiveData<List<Movie>>()
    val movies: LiveData<List<Movie>> = _movies

    init {
        _movies.value = Movie.getSampleMovies()
    }
}