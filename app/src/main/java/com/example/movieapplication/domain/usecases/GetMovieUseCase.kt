package com.example.movieapplication.domain.usecases

import com.example.movieapplication.domain.repositories.Repository

class GetMovieUseCase(private val repository: Repository) {
    suspend fun execute(movieId:Int, language:String) = repository.getMovie(movieId, language)
}