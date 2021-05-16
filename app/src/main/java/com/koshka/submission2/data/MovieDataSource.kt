package com.koshka.submission2.data

import androidx.lifecycle.LiveData
import com.koshka.submission2.data.local.MovieEntity

interface MovieDataSource {
    fun getAllMovie(): LiveData<List<MovieEntity>>

    fun getMovie(): LiveData<MovieEntity>
}