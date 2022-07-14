package com.example.movieapplication.presentation

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.movieapplication.data.RepositoryImpl
import com.example.movieapplication.domain.models.Movie
import com.example.movieapplication.domain.usecases.GetMovieUseCase
import kotlinx.coroutines.launch

class DetailsVewModel:ViewModel() {

    private val repository = RepositoryImpl

    private val getMovieUseCase = GetMovieUseCase(repository)

    private val _movie:MutableLiveData<Movie> = MutableLiveData()
    val movie:LiveData<Movie> get() = _movie

    fun getMovieDetails(movieId:Int, language:String){
        viewModelScope.launch {
            val response = getMovieUseCase.execute(movieId, language)
            if (response.isSuccessful){
                _movie.value = response.body()
            }
        }
    }
}