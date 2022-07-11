package com.example.movieapplication.domain.usecases

import com.example.movieapplication.domain.repositories.Repository

class GetNowPlayingMoviesUseCase(private val repository: Repository) {
    suspend fun execute(language: String, page: Int) = repository.getNowPlaying(language, page)
}