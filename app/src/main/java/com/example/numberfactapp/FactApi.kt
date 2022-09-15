package com.example.numberfactapp

import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Path

interface FactApi {
    @GET("{number}")
    suspend fun getFact(@Path("number") number:String): Response<String>
}