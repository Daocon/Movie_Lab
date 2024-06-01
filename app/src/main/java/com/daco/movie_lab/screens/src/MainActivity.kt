package com.daco.movie_lab.screens.src

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent

import androidx.compose.runtime.Composable

import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.daco.movie_lab.model.Movie
import com.daco.movie_lab.screens.components.MovieItem
import com.daco.movie_lab.screens.src.CinemaSeatBookingScreen
import com.daco.movie_lab.screens.src.MovieScreen
import com.daco.movie_lab.ui.theme.Movie_LabTheme
import com.daco.movie_lab.utils.createTheaterSeating

class MainActivity : ComponentActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {

//            MovieScreen(moviesState.value)
//            MovieScreen(Movie.getSampleMovies())
//            CinemaSeatBookingScreen(
//                createTheaterSeating(
//                    totalRows = 12,
//                    totalSeatsPerRow = 9,
//                    aislePositionInRow = 4,
//                    aislePositionInColumn = 5
//                ), totalSeatsPerRow = 9
//            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    Movie_LabTheme {
        MovieScreen(Movie.getSampleMovies())
    }
}