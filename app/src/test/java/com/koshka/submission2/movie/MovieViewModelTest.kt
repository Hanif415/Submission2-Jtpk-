package com.koshka.submission2.movie

import androidx.arch.core.executor.testing.InstantTaskExecutorRule
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.Observer
import com.koshka.submission2.data.MovieRepository
import com.koshka.submission2.data.local.MovieEntity
import com.koshka.submission2.util.DataDummy
import com.nhaarman.mockitokotlin2.verify
import org.junit.Assert.assertEquals
import org.junit.Assert.assertNotNull
import org.junit.Before
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith
import org.mockito.Mock
import org.mockito.Mockito.`when`
import org.mockito.junit.MockitoJUnitRunner

@RunWith(MockitoJUnitRunner::class)
class MovieViewModelTest {

    private lateinit var movieViewModel: MovieViewModel

    @get:Rule
    var instanceExecutorRule = InstantTaskExecutorRule()

    @Mock
    private lateinit var movieRepository: MovieRepository

    @Mock
    private lateinit var observer: Observer<List<MovieEntity>>

    @Before
    fun setUp() {
        movieViewModel = MovieViewModel(movieRepository)
    }

    @Test
    fun testGetMovie() {
        val dummyMovie = DataDummy.generateDummyMovie()
        val movies = MutableLiveData<List<MovieEntity>>()

        movies.value = dummyMovie

        `when`(movieRepository.getAllMovie()).thenReturn(movies)
        val movieEntities = movieViewModel.getMovie().value
        verify(movieRepository).getAllMovie()
        assertNotNull(movieEntities)
        assertEquals(5, movieEntities?.size)

        movieViewModel.getMovie().observeForever(observer)
        verify(observer).onChanged(dummyMovie)
    }
}