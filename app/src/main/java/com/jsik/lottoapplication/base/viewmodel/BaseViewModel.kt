package com.jsik.lottoapplication.base.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

abstract class BaseViewModel : ViewModel() {

  val isLoading = MutableLiveData(false)

}