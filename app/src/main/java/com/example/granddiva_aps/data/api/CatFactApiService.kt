package com.example.granddiva_aps.data.api

import com.example.granddiva_aps.data.model.CatFactModel
import retrofit2.http.GET

interface CatFactApiService {
    @GET("fact")
    suspend fun getCatFact(): CatFactModel
}
