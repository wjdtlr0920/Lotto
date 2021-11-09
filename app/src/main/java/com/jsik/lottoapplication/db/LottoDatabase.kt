package com.jsik.lottoapplication.db

import androidx.room.Database
import androidx.room.RoomDatabase
import com.jsik.lottoapplication.data.entity.LottoResultModel
import com.jsik.lottoapplication.db.dao.LottoDao

@Database(entities = [LottoResultModel::class], version = 1, exportSchema = false)
abstract class LottoDatabase : RoomDatabase() {
  abstract fun lottoDao() : LottoDao
}