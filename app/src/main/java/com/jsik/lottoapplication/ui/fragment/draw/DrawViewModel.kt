package com.jsik.lottoapplication.ui.fragment.draw

import androidx.lifecycle.MutableLiveData
import com.jsik.lottoapplication.base.viewmodel.BaseViewModel

class DrawViewModel : BaseViewModel() {

  val myLottoList = MutableLiveData<ArrayList<Int>>()
  private val randomLottoList = ArrayList<Int>().apply {
    for (i in 1..45)
      add(i)
  }



  /**
   * 로또 번호 섞어서 6개만 꺼내기
   * */
  fun getLottoList() {
    myLottoList.value = randomLottoList.apply {
      shuffle()
      subList(0,7)
    }
  }

}