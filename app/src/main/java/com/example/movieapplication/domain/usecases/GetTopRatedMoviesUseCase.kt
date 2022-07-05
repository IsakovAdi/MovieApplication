package com.example.movieapplication.domain.usecases

import com.example.movieapplication.domain.models.Results
import com.example.movieapplication.domain.repositories.Repository
import retrofit2.Response

class GetTopRatedMoviesUseCase(private val repository: Repository) {
    suspend fun execute(
        language: String,
        page: Int
    ): Response<Results> {
        return repository.getTopRated(language, page)
    }
}