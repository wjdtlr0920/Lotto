package com.jsik.lottoapplication.net.api

import com.jsik.lottoapplication.data.response.LottoResponse
import retrofit2.http.GET
import retrofit2.http.Query


interface LottoApi {
   companion object {
     const val LOTTO_RESULT = "common.do"
   }

  @GET(LOTTO_RESULT)
  suspend fun getLottoResult(
    @Query("method") method: String,
    @Query("drwNo") drwNo: Int
  ): LottoResponse
}