package com.daco.movie_lab.model

data class Movie(
    val title: String,
    val year: String,
    val posterUrl: String
) {
    companion object {
        fun getSampleMovies() = listOf(
            Movie("The Shawshank Redemption", "1994", "https://upload.wikimedia.org/wikipedia/en/8/81/ShawshankRedemptionMoviePoster.jpg"),
            Movie("The Godfather", "1972", "https://upload.wikimedia.org/wikipedia/en/1/1c/Godfather_ver1.jpg"),
            Movie("The Dark Knight", "2008", "https://upload.wikimedia.org/wikipedia/en/8/81/ShawshankRedemptionMoviePoster.jpg"),
        )
    }
}
