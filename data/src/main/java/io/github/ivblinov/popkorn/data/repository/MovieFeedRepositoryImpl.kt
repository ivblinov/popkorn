package io.github.ivblinov.popkorn.data.repository

import io.github.ivblinov.popkorn.data.mapper.toDomain
import io.github.ivblinov.popkorn.data.network.KinopoiskApiService
import io.github.ivblinov.popkorn.domain.model.movie_feed.MovieFeedItemCollection
import io.github.ivblinov.popkorn.domain.repository.MovieFeedRepository
import javax.inject.Inject

class MovieFeedRepositoryImpl @Inject constructor(
    private val apiService: KinopoiskApiService
) : MovieFeedRepository {

    override suspend fun getTop250Movies(page: Int): MovieFeedItemCollection {
        val responseDto = apiService.getTop250Movies(page = page)
        return responseDto.toDomain()
    }
}