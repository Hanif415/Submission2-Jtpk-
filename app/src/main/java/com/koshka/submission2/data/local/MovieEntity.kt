package com.koshka.submission2.data.local

data class MovieEntity(
    var id: Int?,
    var title: String?,
    var release_date: String?,
    var overview: String?,
    var vote_average: Double?,
    var posterPath: String?
)