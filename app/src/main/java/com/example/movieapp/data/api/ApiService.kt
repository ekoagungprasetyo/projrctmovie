package com.example.movieapp.data.api

import com.example.movieapp.data.model.ListResponse
import com.example.movieapp.data.model.MovieResponse
import com.example.movieapp.data.model.TvShowResponse
import com.example.movieapp.utils.API_KEY
import retrofit2.Call
import retrofit2.http.GET

interface ApiService {

    @GET("movie/now_playing?api_key=$API_KEY")
    fun getMovies(): Call<ListResponse<MovieResponse>>

    @GET("tv/airing_today?api_key=$API_KEY")
    fun getTvShow(): Call<ListResponse<TvShowResponse>>

}