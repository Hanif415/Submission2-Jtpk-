package com.koshka.submission2.data.remote

import android.os.Handler
import android.os.Looper
import com.koshka.submission2.data.remote.response.ResultsItem
import com.koshka.submission2.service.MovieApi
import com.koshka.submission2.util.EspressoIdlingResource

class RemoteDataSource private constructor() {

    private val handler = Handler(Looper.getMainLooper())

    companion object {
        private const val SERVICE_LATENCY_IN_MILES: Long = 2000

        @Volatile
        private var instance: RemoteDataSource? = null

        fun getInstance(): RemoteDataSource = instance ?: synchronized(this) {
            RemoteDataSource().apply {
                instance = this
            }
        }
    }

    fun getAllMovie(callBack: LoadMovieCallBack) {
        EspressoIdlingResource.increment()
        handler.postDelayed({
            callBack.onAllMovieReceived(MovieApi.movieApiService.getAllMovie())
        }, SERVICE_LATENCY_IN_MILES)
        EspressoIdlingResource.decrement()
    }

}

interface LoadMovieCallBack {
    fun onAllMovieReceived(movieResponse: List<ResultsItem>)
}
