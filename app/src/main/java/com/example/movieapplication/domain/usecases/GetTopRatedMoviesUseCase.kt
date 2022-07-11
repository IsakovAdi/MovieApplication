package com.example.movieapplication.domain.usecases

import com.example.movieapplication.domain.repositories.Repository

class GetTopRatedMoviesUseCase(private val repository: Repository) {
    suspend fun execute(language: String, page: Int) = repository.getTopRated(language, page)

}