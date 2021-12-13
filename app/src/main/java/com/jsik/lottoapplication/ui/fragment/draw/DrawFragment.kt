package com.jsik.lottoapplication.ui.fragment.draw

import androidx.appcompat.widget.AppCompatTextView
import androidx.core.content.ContextCompat
import com.jsik.lottoapplication.R
import com.jsik.lottoapplication.base.ui.fragment.BaseFragment
import com.jsik.lottoapplication.databinding.FragmentDrawBinding
import org.koin.androidx.viewmodel.ext.android.viewModel


class DrawFragment : BaseFragment<FragmentDrawBinding, DrawViewModel>(R.layout.fragment_draw) {

  private val drawViewModel: DrawViewModel by viewModel()

  override fun getViewModel() = drawViewModel

  override fun initView() {
    drawViewModel.setLottoList()

    binding.view = this@DrawFragment

    binding.autoCreateNumber.setOnClickListener {
      drawViewModel.setLottoList()
    }

//    drawViewModel.setData()
    drawViewModel.getData()

  }

  override fun initObserver() {
    drawViewModel.myLottoList.observe(viewLifecycleOwner) {
      drawLottoNumber()
    }
  }

  /**
   * 로또 번호 뷰에 그리기
   * */
  private fun drawLottoNumber() {

    val textViewList = arrayListOf<AppCompatTextView>().apply {
      add(binding.lottoNumber1)
      add(binding.lottoNumber2)
      add(binding.lottoNumber3)
      add(binding.lottoNumber4)
      add(binding.lottoNumber5)
      add(binding.lottoNumber6)
      add(binding.lottoBonusNumber)
    }
    textViewList.forEach {
      when(it.text.toString().toInt()){
        in 1..10 -> it.background = ContextCompat.getDrawable(requireContext(), R.drawable.lotto_ball_yellow)
        in 11..20 -> it.background = ContextCompat.getDrawable(requireContext(), R.drawable.lotto_ball_red)
        in 21..30 -> it.background = ContextCompat.getDrawable(requireContext(), R.drawable.lotto_ball_blue)
        in 31..40 -> it.background = ContextCompat.getDrawable(requireContext(), R.drawable.lotto_ball_green)
        else -> it.background = ContextCompat.getDrawable(requireContext(), R.drawable.lotto_ball_gray)
      }
    }
  }
}