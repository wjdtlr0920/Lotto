package com.jsik.lottoapplication.net

import com.jsik.lottoapplication.net.api.LottoApi
import com.jsik.lottoapplication.data.response.LottoResponse

class NetworkClient(private val lottoApi: LottoApi) {

  suspend fun getLottoResult(drwNo : Int): LottoResponse = lottoApi.getLottoResult("getLottoNumber", drwNo)

}