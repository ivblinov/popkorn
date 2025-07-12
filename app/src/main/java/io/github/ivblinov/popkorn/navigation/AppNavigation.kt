package io.github.ivblinov.popkorn.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.rememberNavController
import io.github.ivblinov.popkorn.features.movie_feed.navigation.movieFeedRoute
import io.github.ivblinov.popkorn.features.movie_feed.navigation.movieFeedScreen

@Composable
fun AppNavigation() {
    val navController = rememberNavController()

    NavHost(
        navController = navController,
        startDestination = movieFeedRoute
    ) {
        movieFeedScreen()
    }
}