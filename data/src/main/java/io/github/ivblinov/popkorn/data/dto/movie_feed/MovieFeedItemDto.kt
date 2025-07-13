package io.github.ivblinov.popkorn.data.dto.movie_feed

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass
import io.github.ivblinov.popkorn.data.dto.country.CountryDto
import io.github.ivblinov.popkorn.data.dto.genre.GenreDto

@JsonClass(generateAdapter = true)
data class MovieFeedItemDto(
    @param:Json(name = "kinopoiskId") val kinopoiskId: Int,
    @param:Json(name = "nameRu") val nameRu: String?,
    @param:Json(name = "nameEn") val nameEn: String?,
    @param:Json(name = "nameOriginal") val nameOriginal: String?,
    @param:Json(name = "countries") val countries: List<CountryDto>,
    @param:Json(name = "genres") val genres: List<GenreDto>,
    @param:Json(name = "ratingKinopoisk") val ratingKinopoisk: Float?,
    @param:Json(name = "ratingImbd") val ratingImbd: Float?,
    @param:Json(name = "year") val year: String?,
    @param:Json(name = "type") val type: String?,
    @param:Json(name = "posterUrl") val posterUrl: String?,
    @param:Json(name = "posterUrlPreview") val posterUrlPreview: String?,
)