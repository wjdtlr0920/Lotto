package com.jsik.lottoapplication.di.network

import com.jsik.lottoapplication.net.NetworkClient
import com.jsik.lottoapplication.net.api.LottoApi
import org.koin.dsl.module
import retrofit2.Retrofit
import retrofit2.create

val apiModule = module {

  single { get<Retrofit>().create(LottoApi::class.java) }
  single { NetworkClient(get()) }

}