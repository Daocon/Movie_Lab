package com.daco.movie_lab.src.components

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import coil.compose.AsyncImage
import com.daco.movie_lab.model.Movie

@Composable
fun MovieColumnItem(movie: Movie, listType: ListType) {
    Card(
        colors = CardDefaults.cardColors(containerColor =
        Color.White),
        elevation = CardDefaults.cardElevation(defaultElevation =
        6.dp),
    ) {
        Row(
            modifier = Modifier.fillMaxWidth()
        ) {
            AsyncImage(
                model = movie.poster,
                contentDescription = null,
                contentScale = ContentScale.FillWidth,
                modifier = Modifier
                    .then(getItemSizeModifier(listType))
                    .wrapContentHeight()
            )

            Column(
                modifier = Modifier.padding(8.dp)
            ) {
                Text(
                    text = movie.title,
                    style = MaterialTheme.typography.titleSmall,
                    maxLines = 2,
                    overflow = TextOverflow.Ellipsis
                )
                BoldValueText(label = "Ngày phát hành: ", value =
                movie.releaseDate)
                BoldValueText(label = "Thể loại: ", value =
                movie.genre)
                BoldValueText(label = "Ngày phát hành: ", value =
                movie.director)
                BoldValueText(label = "Ngày phát hành: ", value =
                movie.synopsis)
                BoldValueText(label = "Thời lượng: ", value =
                movie.duration.toString())
                BoldValueText(label = "Ngày phát hành: ", value =
                movie.rating.toString())
                BoldValueText(label = "Ngày phát hành: ", value =
                movie.castToString())
            }
        }
    }
}