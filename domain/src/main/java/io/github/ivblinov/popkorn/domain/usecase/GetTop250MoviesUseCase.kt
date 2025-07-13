package io.github.ivblinov.popkorn.domain.usecase

import io.github.ivblinov.popkorn.domain.model.movie_feed.MovieFeedItemCollection
import io.github.ivblinov.popkorn.domain.repository.MovieFeedRepository
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import javax.inject.Inject

class GetTop250MoviesUseCase @Inject constructor(
    private val repository: MovieFeedRepository
) {

    suspend operator fun invoke(page: Int = 1): Result<MovieFeedItemCollection> {
        return try {
            val movies = withContext(Dispatchers.IO) {
                repository.getTop250Movies(page)
            }
            Result.success(movies)
        } catch (e: Exception) {
            // Здесь можно обработать разные типы ошибок (сеть, сервер и т.д.)
            Result.failure(e)
        }
    }
}