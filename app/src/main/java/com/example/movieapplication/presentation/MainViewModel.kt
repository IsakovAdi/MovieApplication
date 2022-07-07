package com.example.movieapplication.presentation

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.movieapplication.data.RepositoryImpl
import com.example.movieapplication.domain.models.Movie
import com.example.movieapplication.domain.usecases.GetPopularMoviesUseCase
import kotlinx.coroutines.launch
import retrofit2.Response

class MainViewModel:ViewModel() {

    private val repository = RepositoryImpl
    private val getPopularMoviesUseCase = GetPopularMoviesUseCase(repository)

    private val _movies:MutableLiveData<List<Movie>> = MutableLiveData()
    val movies:LiveData<List<Movie>> get() = _movies

    fun getPopularMovies(language:String, page:Int){
        viewModelScope.launch {
            val response =getPopularMoviesUseCase.execute(language, page)
            if (response.isSuccessful){
                _movies.value = response.body()?.movies
            }
        }
    }

}