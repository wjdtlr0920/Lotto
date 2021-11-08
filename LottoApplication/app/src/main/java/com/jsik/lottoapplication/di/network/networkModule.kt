package com.jsik.lottoapplication.di.network

import com.jsik.lottoapplication.BuildConfig
import com.jsik.lottoapplication.net.api.LottoApi
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import org.koin.dsl.module
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory


val networkModule = module {

  single {
    OkHttpClient.Builder().apply {
      addInterceptor(HttpLoggingInterceptor().apply {
        level = if (BuildConfig.DEBUG) HttpLoggingInterceptor.Level.BODY else HttpLoggingInterceptor.Level.NONE
      })
    }.build()
  }

  single {
    Retrofit.Builder().apply {
      client(get())
      baseUrl(BuildConfig.BASE_URL)
      addConverterFactory(GsonConverterFactory.create())
    }.build()
  }

  single { LottoApi::class.java }


}