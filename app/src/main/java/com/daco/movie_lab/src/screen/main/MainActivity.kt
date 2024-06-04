package com.daco.movie_lab.src.screen.main

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent

import androidx.compose.runtime.Composable

import androidx.compose.ui.tooling.preview.Preview
import com.daco.movie_lab.model.Movie
import com.daco.movie_lab.src.navigation.ScreenNavigation
import com.daco.movie_lab.src.screen.MovieScreen
import com.daco.movie_lab.ui.theme.Movie_LabTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ScreenNavigation()
        }
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    Movie_LabTheme {
    }
}