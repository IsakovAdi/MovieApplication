package com.example.movieapplication.data

import com.example.movieapplication.domain.models.Results
import com.example.movieapplication.domain.repositories.Repository
import retrofit2.Response

object RepositoryImpl : Repository {
    override suspend fun getPopular(
        apiKey: String,
        language: String,
        page: Int
    ): Response<Results> {
        return RetrofitInstance.api.getPopular(apiKey, language, page)
    }

    override suspend fun getTopRated(
        apiKey: String,
        language: String,
        page: Int
    ): Response<Results> {
        return RetrofitInstance.api.getTops(apiKey, language, page)
    }

    override suspend fun getUpComing(
        apiKey: String,
        language: String,
        page: Int
    ): Response<Results> {
        return RetrofitInstance.api.getUpcoming(apiKey, language, page)
    }

    override suspend fun getNowPlaying(
        apiKey: String,
        language: String,
        page: Int
    ): Response<Results> {
        return RetrofitInstance.api.getNowPlaying(apiKey, language, page)
    }

    override suspend fun searchMovie(
        apiKey: String,
        language: String,
        query: String
    ): Response<Results> {
        TODO("Not yet implemented")
    }
}