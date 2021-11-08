package com.jsik.lottoapplication.di.network

import com.jsik.lottoapplication.net.api.LottoApi
import org.koin.dsl.module
import retrofit2.Retrofit
import retrofit2.create

val apiModule = module {
  single { LottoApi::class.java }
  single<LottoApi> { get<Retrofit>().create(get()) }
}