package com.example.movieapplication.domain.repositories

import com.example.movieapplication.domain.models.Movie
import com.example.movieapplication.domain.models.Results
import retrofit2.Response

interface Repository {
    suspend fun getPopular(language: String, page: Int): Response<Results>
    suspend fun getTopRated(language: String, page: Int): Response<Results>
    suspend fun getUpComing(language: String, page: Int): Response<Results>
    suspend fun getNowPlaying(language: String, page: Int): Response<Results>
    suspend fun searchMovie(language: String, query: String): Response<Results>
    suspend fun getMovie(movieId:Int, language:String) :Response<Movie>
}