package com.koshka.submission2.movie

import androidx.lifecycle.LiveData
import com.koshka.submission2.data.MovieRepository
import com.koshka.submission2.data.local.MovieEntity

class MovieViewModel(private val movieRepository: MovieRepository) {

    fun getMovie(): LiveData<List<MovieEntity>> = movieRepository.getAllMovie()
}