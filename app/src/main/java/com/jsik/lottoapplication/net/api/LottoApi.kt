package com.jsik.lottoapplication.net.api

import com.jsik.lottoapplication.net.response.LottoResponse
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.Path


interface LottoApi {
   companion object {
     const val LOTTO_RESULT = "common.do?method=getLottoNumber&drwNo={drwNo}"
   }

  @GET(LOTTO_RESULT)
  suspend fun getLottoResult(@Path("drwNo") drwNo: Int): LottoResponse

}