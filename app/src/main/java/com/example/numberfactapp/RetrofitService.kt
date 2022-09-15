package com.example.numberfactapp

import retrofit2.Retrofit
import retrofit2.converter.scalars.ScalarsConverterFactory

object RetrofitService {

    fun retrofitInstance(): Retrofit = Retrofit.Builder().addConverterFactory(ScalarsConverterFactory.create()).baseUrl("http://numbersapi.com/").build()

    fun getApi(): FactApi = retrofitInstance().create(FactApi::class.java)
}