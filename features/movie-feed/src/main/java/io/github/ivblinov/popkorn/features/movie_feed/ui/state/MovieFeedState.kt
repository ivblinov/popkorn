package io.github.ivblinov.popkorn.features.movie_feed.ui.state

import io.github.ivblinov.popkorn.domain.model.movie_feed.MovieFeedItemCollection

sealed interface MovieFeedState {
    data object Loading : MovieFeedState
    data class Success(val movies: MovieFeedItemCollection) : MovieFeedState
    data class Error(val message: String) : MovieFeedState
}