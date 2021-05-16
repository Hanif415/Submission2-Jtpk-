package com.koshka.submission2.data

import androidx.lifecycle.LiveData
import com.koshka.submission2.data.local.MovieEntity

class MovieRepository private constructor(private val remoteDataSource: RemoteDataSource) : MovieDataSource {

    companion object {
        @Volatile
        private var instance: MovieRepository? = null

        fun getInstance(remoteData: RemoteDataSource): MovieRepository =
                instance ?: synchronized(this) {
                    MovieRepository(remoteData).apply { instance == this }
                }

    }

    override fun getAllMovie(): LiveData<List<MovieEntity>> {
        TODO("Not yet implemented")
    }

    override fun getMovie(): LiveData<MovieEntity> {
        TODO("Not yet implemented")
    }
}