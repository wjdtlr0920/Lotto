package com.jsik.lottoapplication.ui.dialog

import android.os.Bundle
import android.util.TypedValue
import android.view.WindowManager
import com.jsik.lottoapplication.R
import com.jsik.lottoapplication.base.ui.dialog.BaseFragmentDialog
import com.jsik.lottoapplication.databinding.DialogTestFragmentBinding
import com.orhanobut.logger.Logger

class TestFragmentDialog : BaseFragmentDialog<DialogTestFragmentBinding>(R.layout.dialog_test_fragment) {

  override fun onResume() {
    super.onResume()

    dialog?.window?.attributes = WindowManager.LayoutParams().apply {
//            width = WindowManager.LayoutParams.MATCH_PARENT
//            height = WindowManager.LayoutParams.MATCH_PARENT

      val widthDP = TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, 200F, resources.displayMetrics)
      val heightDP = TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, 200F, resources.displayMetrics)

      Logger.d(widthDP)
      Logger.d(heightDP)

      width = 200
      height = 200

      Logger.d(width)
      Logger.d(height)

    }
  }

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
  }

}