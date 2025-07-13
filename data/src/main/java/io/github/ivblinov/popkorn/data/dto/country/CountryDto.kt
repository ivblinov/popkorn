package io.github.ivblinov.popkorn.data.dto.country

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class CountryDto(
    @param:Json(name = "country") val country: String
)