package com.jsik.lottoapplication.base.ui.dialog

import android.app.Dialog
import android.content.Context
import android.os.Bundle


abstract class BaseDialog(context: Context) : Dialog(context) {

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)

    initView()
  }

  abstract fun initView()



  override fun show() {
    super.show()
  }

  override fun dismiss() {
    super.dismiss()
  }

}