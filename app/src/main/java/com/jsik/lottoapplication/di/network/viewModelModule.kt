package com.jsik.lottoapplication.di.network

import com.jsik.lottoapplication.ui.activity.main.MainViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val viewModelModule = module {
  viewModel { MainViewModel() }
}