package com.koshka.submission2.data.local

data class MovieEntity(
        var id: String,
        var title: String,
        var date_release: String,
        var overview: String,
        var user_score: String,
        var director: String
)