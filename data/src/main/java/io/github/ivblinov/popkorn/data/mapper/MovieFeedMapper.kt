package io.github.ivblinov.popkorn.data.mapper

import io.github.ivblinov.popkorn.data.dto.movie_feed.MovieFeedItemDto
import io.github.ivblinov.popkorn.data.dto.movie_feed.MovieFeedResponseDto
import io.github.ivblinov.popkorn.domain.model.country.Country
import io.github.ivblinov.popkorn.domain.model.genre.Genre
import io.github.ivblinov.popkorn.domain.model.movie_feed.MovieFeedItem
import io.github.ivblinov.popkorn.domain.model.movie_feed.MovieFeedItemCollection

fun MovieFeedItemDto.toDomain() = MovieFeedItem(
    kinopoiskId = kinopoiskId,
    nameRu = nameRu ?: nameOriginal ?: "Нет названия",
    nameEn = nameEn ?: "",
    nameOriginal = nameOriginal ?: "",
    countries = countries.map { Country(it.country) },
    genres = genres.map { Genre(it.genre) },
    ratingKinopoisk = ratingKinopoisk ?: 0.0f,
    ratingImbd = ratingImbd ?: 0.0f,
    year = year ?: "н/д",
    type = type ?: "",
    posterUrl = posterUrl ?: "н/д",
    posterUrlPreview = posterUrlPreview ?: "н/д"
)

fun MovieFeedResponseDto.toDomain() = MovieFeedItemCollection(
    total = total,
    totalPages = totalPages,
    items = items.map { movieFeedItemDto ->
        movieFeedItemDto.toDomain()
    }
)