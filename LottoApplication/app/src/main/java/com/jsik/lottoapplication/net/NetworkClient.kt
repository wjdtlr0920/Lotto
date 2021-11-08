package com.jsik.lottoapplication.net

import com.jsik.lottoapplication.net.api.LottoApi

class NetworkClient(val lottoApi: LottoApi) {

  suspend fun getLottoResult(){
    lottoApi.getLottoResult(1)
  }

}