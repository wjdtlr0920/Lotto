package com.jsik.lottoapplication.ui.dialog

import android.os.Bundle
import android.view.WindowManager
import com.jsik.lottoapplication.R
import com.jsik.lottoapplication.base.ui.dialog.BaseFragmentDialog
import com.jsik.lottoapplication.databinding.DialogTestFragmentBinding

class TestFragmentDialog : BaseFragmentDialog<DialogTestFragmentBinding>(R.layout.dialog_test_fragment) {

    override fun onResume() {
        super.onResume()

        dialog?.window?.attributes = WindowManager.LayoutParams().apply {
//            width = WindowManager.LayoutParams.MATCH_PARENT
//            height = WindowManager.LayoutParams.MATCH_PARENT

            width = 200
            height = 200
        }

    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

}