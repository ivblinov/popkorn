package io.github.ivblinov.popkorn.data.dto.movie_feed

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class MovieFeedResponseDto(
    @param:Json(name = "total") val total: Int,
    @param:Json(name = "totalPages") val totalPages: Int,
    @param:Json(name = "items") val items: List<MovieFeedItemDto>
)