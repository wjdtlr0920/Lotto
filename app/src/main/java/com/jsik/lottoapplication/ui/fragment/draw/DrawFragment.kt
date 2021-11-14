package com.jsik.lottoapplication.ui.fragment.draw

import com.jsik.lottoapplication.R
import com.jsik.lottoapplication.base.ui.fragment.BaseFragment
import com.jsik.lottoapplication.databinding.FragmentDrawBinding
import org.koin.androidx.viewmodel.ext.android.viewModel


class DrawFragment : BaseFragment<FragmentDrawBinding, DrawViewModel>(R.layout.fragment_draw) {

  private val drawViewModel : DrawViewModel by viewModel()

  override fun getViewModel() = drawViewModel

  override fun initView() {
    binding.autoCreateNumber.setOnClickListener {
      
    }
  }
}