package com.example.granddiva_aps.data.api

import com.example.granddiva_aps.data.model.PhotoModel
import retrofit2.http.GET

import retrofit2.http.Query

interface PhotoApiService {
    @GET("list")
    suspend fun getPhotos(@Query("limit") limit: Int = 100): List<PhotoModel>
}
