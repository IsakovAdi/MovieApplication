package com.example.movieapplication.domain.repositories

import com.example.movieapplication.domain.models.Results
import retrofit2.Response

interface Repository {
    suspend fun getPopular(apiKey: String, language: String, page: Int): Response<Results>
    suspend fun getTopRated(apiKey: String, language: String, page: Int): Response<Results>
    suspend fun getUpComing(apiKey: String, language: String, page: Int): Response<Results>
    suspend fun getNowPlaying(apiKey: String, language: String, page: Int): Response<Results>
    suspend fun searchMovie(apiKey: String, language: String, query: String): Response<Results>
//        return RetrofitInstance.api.search(apiKey, language, query)

}