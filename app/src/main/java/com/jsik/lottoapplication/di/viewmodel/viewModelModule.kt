package com.jsik.lottoapplication.di.viewmodel

import com.jsik.lottoapplication.ui.activity.main.MainViewModel
import com.jsik.lottoapplication.ui.fragment.draw.DrawViewModel
import com.jsik.lottoapplication.ui.fragment.result.ResultViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val viewModelModule = module {
  viewModel { MainViewModel(get(), get()) }
  viewModel { DrawViewModel() }
  viewModel { ResultViewModel() }
}