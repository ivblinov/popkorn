package io.github.ivblinov.popkorn.features.movie_feed.ui.screen

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.hilt.navigation.compose.hiltViewModel
import io.github.ivblinov.popkorn.features.movie_feed.ui.screen.MovieFeedViewModel

@Composable
fun MovieFeedScreen(
    viewModel: MovieFeedViewModel = hiltViewModel()
) {
    Text(text = "Лента фильмов")
}