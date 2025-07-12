package io.github.ivblinov.popkorn.features.movie_feed.ui

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.hilt.navigation.compose.hiltViewModel

@Composable
fun MovieFeedScreen(
    viewModel: MovieFeedViewModel = hiltViewModel()
) {
    Text(text = "Лента фильмов")
}