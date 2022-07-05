package com.example.movieapplication.domain.models

import com.google.gson.annotations.SerializedName

data class TrailersResult(
    @SerializedName("id")
    val id: Int,
    @SerializedName("results")
    val trailerList: List<Trailer>
)