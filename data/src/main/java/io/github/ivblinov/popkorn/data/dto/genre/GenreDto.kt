package io.github.ivblinov.popkorn.data.dto.genre

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class GenreDto(
    @param:Json(name = "genre") val genre: String
)