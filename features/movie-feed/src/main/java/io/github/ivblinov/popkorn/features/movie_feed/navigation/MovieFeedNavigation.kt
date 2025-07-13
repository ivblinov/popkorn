package io.github.ivblinov.popkorn.features.movie_feed.navigation

import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import io.github.ivblinov.popkorn.features.movie_feed.ui.screen.MovieFeedScreen

const val movieFeedRoute = "movie_feed_route"

fun NavGraphBuilder.movieFeedScreen() {
    composable(route = movieFeedRoute) {
        MovieFeedScreen()
    }
}