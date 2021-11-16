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
   * 로또 번호 세팅하기 마지막에 하나 따로 더하는 건 보너스 번호는 소팅 안되게 하기 위함
   * */
  fun setLottoList() {
    randomLottoList.shuffle()
    myLottoList.value = arrayListOf<Int>().apply {
      addAll(randomLottoList.subList(0,6))
      sort()
      add(randomLottoList[6])
    }
  }
}