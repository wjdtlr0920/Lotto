package com.jsik.lottoapplication.ui.activity.main

import androidx.lifecycle.ViewModel
import com.jsik.lottoapplication.base.viewmodel.BaseViewModel
import com.jsik.lottoapplication.net.NetworkClient
import com.orhanobut.logger.Logger
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class MainViewModel(private val networkClient: NetworkClient) : ViewModel() {

  fun getLottoResult(){
    CoroutineScope(Dispatchers.IO).launch {
      val data = networkClient.lottoApi.getLottoResult(1)
      Logger.e("$data")
    }
  }
}