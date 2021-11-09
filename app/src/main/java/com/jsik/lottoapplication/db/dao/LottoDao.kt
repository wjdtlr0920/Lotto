package com.jsik.lottoapplication.db.dao

import androidx.room.*
import com.jsik.lottoapplication.data.entity.LottoResultModel

@Dao
interface LottoDao {

  @Query("select * from LottoResultModel")
  fun getAll() : List<LottoResultModel>

  @Insert
  fun insertLottoResult(lottoResultModel: LottoResultModel)

  @Update
  fun updateLottoResult(lottoResultModel: LottoResultModel)

  @Delete
  fun deleteLottoResult(lottoResultModel: LottoResultModel)

}