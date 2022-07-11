package com.example.movieapplication.domain.usecases

import com.example.movieapplication.domain.repositories.Repository
import retrofit2.http.Query

class GetSearchMoviesUseCase(private val repository: Repository) {
    suspend fun execute(language: String, query: String) = repository.searchMovie(language, query)

}