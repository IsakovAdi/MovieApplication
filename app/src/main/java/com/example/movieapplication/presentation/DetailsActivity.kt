package com.example.movieapplication.presentation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.ViewModelProvider
import com.example.movieapplication.R
import com.example.movieapplication.databinding.ActivityDetailsBinding
import com.example.movieapplication.domain.Utils
import com.example.movieapplication.domain.models.Movie
import com.squareup.picasso.Picasso

class DetailsActivity : AppCompatActivity() {
    private val binding:ActivityDetailsBinding by lazy {
        ActivityDetailsBinding.inflate(layoutInflater)
    }
    private val viewModel: DetailsVewModel by lazy {
        ViewModelProvider(
            this,
            ViewModelProvider.AndroidViewModelFactory.getInstance(this.application)
        )[DetailsVewModel::class.java]
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)


        val movieID:Int = intent.getIntExtra("movieID", 0)
        viewModel.getMovieDetails(movieID, "ru")
        viewModel.movie.observe(this){
            init(it)
        }
    }

    private fun init(movie:Movie){
        Picasso.get().load(Utils.POSTER_PATH_URL+movie.backdropPath).into(binding.detailsMovieImg)
    }
}