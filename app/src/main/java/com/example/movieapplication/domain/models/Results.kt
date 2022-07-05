package com.example.movieapplication.domain.models

import com.example.movieapplication.domain.models.Movie
import com.google.gson.annotations.SerializedName

data class Results(
    val page: Int,
    @SerializedName("results")
    var movies: List<Movie>,
    @SerializedName("total_page")
    val totalPage: Int
)