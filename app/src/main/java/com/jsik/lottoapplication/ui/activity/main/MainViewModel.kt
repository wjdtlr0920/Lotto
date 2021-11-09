package com.jsik.lottoapplication.ui.activity.main

import androidx.lifecycle.ViewModel
import com.jsik.lottoapplication.base.viewmodel.BaseViewModel
import com.jsik.lottoapplication.data.entity.LottoResultModel
import com.jsik.lottoapplication.db.dao.LottoDao
import com.jsik.lottoapplication.net.NetworkClient
import com.orhanobut.logger.Logger
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class MainViewModel(private val networkClient: NetworkClient, private val lottoDao: LottoDao) : ViewModel() {

  fun getLottoResult(){
    CoroutineScope(Dispatchers.IO).launch {
      for (drwNo in 1..10){
        val lottoResultModel = LottoResultModel().apply {
          val data = networkClient.getLottoResult(drwNo)
          drwtNo1 = data.drwtNo1
          drwtNo2 = data.drwtNo2
          drwtNo3 = data.drwtNo3
          drwtNo4 = data.drwtNo4
          drwtNo5 = data.drwtNo5
          drwtNo6 = data.drwtNo6
          bnusNo = data.bnusNo
          drwNoDate = data.drwNoDate
          firstAccumamnt = data.firstAccumamnt
          firstPrzwnerCo = data.firstPrzwnerCo
          firstWinamnt = data.firstWinamnt
          returnValue = data.returnValue
          totSellamnt = data.totSellamnt
        }
        lottoDao.insertLottoResult(lottoResultModel)
        Logger.e(lottoDao.getAll().toString())
      }
    }
  }
}