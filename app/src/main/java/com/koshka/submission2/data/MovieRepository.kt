package com.koshka.submission2.data

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.koshka.submission2.data.local.MovieEntity
import com.koshka.submission2.data.remote.LoadMovieCallBack
import com.koshka.submission2.data.remote.RemoteDataSource
import com.koshka.submission2.data.remote.response.ResultsItem

class MovieRepository private constructor(private val remoteDataSource: RemoteDataSource) :
    MovieDataSource {

    companion object {
        @Volatile
        private var instance: MovieRepository? = null

        fun getInstance(remoteData: RemoteDataSource): MovieRepository =
            instance ?: synchronized(this) {
                MovieRepository(remoteData).apply { instance = this }
            }

    }

    override fun getAllMovie(): LiveData<List<MovieEntity>> {
        var movieResult = MutableLiveData<List<MovieEntity>>()
        remoteDataSource.getAllMovie(object : LoadMovieCallBack {
            override fun onAllMovieReceived(movieResponse: List<ResultsItem>) {
                val movieList = ArrayList<MovieEntity>()
                for (response in movieResponse) {
                    val movie = MovieEntity(
                        response.id,
                        response.title,
                        response.releaseDate,
                        response.overview,
                        response.voteAverage,
                        response.posterPath
                    )
                    movieList.add(movie)
                }
                movieResult.postValue(movieList)
            }
        })

        return movieResult
    }

    override fun getMovie(): LiveData<MovieEntity> {
        TODO("Not yet implemented")
    }
}