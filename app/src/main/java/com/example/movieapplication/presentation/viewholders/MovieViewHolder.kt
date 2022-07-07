package com.example.movieapplication.presentation.viewholders

import androidx.recyclerview.widget.RecyclerView
import com.example.movieapplication.R
import com.example.movieapplication.databinding.MovieBinding
import com.example.movieapplication.domain.Utils
import com.example.movieapplication.domain.models.Movie
import com.squareup.picasso.Picasso

class MovieViewHolder(
    val binding: MovieBinding
):RecyclerView.ViewHolder(binding.root) {
    fun bind(movie: Movie) = binding.apply{
//        val voteAverage = movie.rating*10
//        if (voteAverage.toInt()>70){
//            binding.progressView.setProgressColor(R.color.green)
//        }
        Picasso.get().load(Utils.POSTER_PATH_URL+movie.posterPath).into(binding.movieImage)
//        binding.progressView.setProgress(voteAverage.toInt(), true)
    }
}