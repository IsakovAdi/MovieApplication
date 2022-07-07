package com.example.movieapplication.presentation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.ViewModelProvider
import com.example.movieapplication.R
import com.example.movieapplication.databinding.ActivityMainBinding
import com.example.movieapplication.presentation.adapters.MovieAdapter

class MainActivity : AppCompatActivity() {
    private val binding:ActivityMainBinding by lazy {
        ActivityMainBinding.inflate(layoutInflater)
    }
    private val movieAdapter:MovieAdapter by lazy {
        MovieAdapter()
    }
    private val viewModel: MainViewModel by lazy {
        ViewModelProvider(
            this,
            ViewModelProvider.AndroidViewModelFactory.getInstance(this.application)
        )[MainViewModel::class.java]
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        binding.mainRv.hasFixedSize()
        viewModel.movies.observe(this){
            movieAdapter.submitList(it)
        }
        binding.mainRv.adapter = movieAdapter
        viewModel.getPopularMovies("ru", 1)
    }
}