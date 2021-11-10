package com.jsik.lottoapplication.util

import com.jsik.lottoapplication.util.Const.DateFormatPattern.HyphenPattern
import java.text.SimpleDateFormat
import java.util.*

class Util {

  /**
   * Date -> String
   * (yyyy-MM-dd)
   * */
  fun dateToString(pattern: String, date : Date): String = SimpleDateFormat(HyphenPattern).format(date)

  /**
   * String -> Date
   * (yyyy-MM-dd)
   * */
  fun stringToDate(date: String): Date = SimpleDateFormat(HyphenPattern).parse(date)

}