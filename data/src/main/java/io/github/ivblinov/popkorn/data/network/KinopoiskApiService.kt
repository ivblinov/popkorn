package io.github.ivblinov.popkorn.data.network

import io.github.ivblinov.popkorn.data.dto.movie_feed.MovieFeedResponseDto
import retrofit2.http.GET
import retrofit2.http.Query

interface KinopoiskApiService {

    @GET("/api/v2.2/films/collections")
    suspend fun getTop250Movies(
        @Query("type") type: String = "TOP_250_MOVIES",
        @Query("page") page: Int = 1
    ): MovieFeedResponseDto
}