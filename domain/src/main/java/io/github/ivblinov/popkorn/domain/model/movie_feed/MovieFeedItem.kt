package io.github.ivblinov.popkorn.domain.model.movie_feed

import io.github.ivblinov.popkorn.domain.model.country.Country
import io.github.ivblinov.popkorn.domain.model.genre.Genre

data class MovieFeedItem(
    val kinopoiskId: Int,
    val nameRu: String,
    val nameEn: String,
    val nameOriginal: String,
    val countries: List<Country>,
    val genres: List<Genre>,
    val ratingKinopoisk: Float,
    val ratingImbd: Float,
    val year: String,
    val type: String,
    val posterUrl: String,
    val posterUrlPreview: String,
)