package com.example.movieapplication.presentation.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.ListAdapter
import com.example.movieapplication.R
import com.example.movieapplication.databinding.MovieBinding
import com.example.movieapplication.domain.models.Movie
import com.example.movieapplication.presentation.callbacks.MovieDiffCallback
import com.example.movieapplication.presentation.viewholders.MovieViewHolder

class MovieAdapter:ListAdapter<Movie, MovieViewHolder>(MovieDiffCallback()) {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MovieViewHolder  =
        MovieViewHolder(
            MovieBinding.bind(
                LayoutInflater.from(parent.context).inflate(R.layout.movie, parent, false)
            )
        )

    override fun onBindViewHolder(holder: MovieViewHolder, position: Int) {
        holder.bind(getItem(position))
    }
}