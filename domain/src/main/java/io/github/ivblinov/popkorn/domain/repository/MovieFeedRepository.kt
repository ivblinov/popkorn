package io.github.ivblinov.popkorn.domain.repository

import io.github.ivblinov.popkorn.domain.model.movie_feed.MovieFeedItemCollection

interface MovieFeedRepository {
    suspend fun getTop250Movies(page: Int): MovieFeedItemCollection
}