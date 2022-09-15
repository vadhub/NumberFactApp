package com.example.numberfactapp

import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.scalars.ScalarsConverterFactory
import java.util.concurrent.TimeUnit

object RetrofitService {

    fun interceptor(): HttpLoggingInterceptor =
        HttpLoggingInterceptor().setLevel(HttpLoggingInterceptor.Level.BODY)

    fun okHttpClient(): OkHttpClient = OkHttpClient.Builder().connectTimeout(15, TimeUnit.SECONDS)
        .readTimeout(15, TimeUnit.SECONDS).addInterceptor(
        interceptor()
    ).build()

    fun retrofitInstance(): Retrofit =
        Retrofit.Builder(). addConverterFactory(ScalarsConverterFactory.create())
            .client(okHttpClient())
            .baseUrl("http://numbersapi.com/").build()

    fun getApi(): FactApi = retrofitInstance().create(FactApi::class.java)
}