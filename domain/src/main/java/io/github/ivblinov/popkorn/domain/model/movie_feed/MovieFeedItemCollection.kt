package io.github.ivblinov.popkorn.domain.model.movie_feed

data class MovieFeedItemCollection(
    val total: Int,
    val totalPages: Int,
    val items: List<MovieFeedItem>
)