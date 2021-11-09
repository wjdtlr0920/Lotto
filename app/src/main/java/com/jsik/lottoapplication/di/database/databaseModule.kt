package com.jsik.lottoapplication.di.database

import androidx.room.Room
import androidx.room.RoomDatabase
import androidx.sqlite.db.SupportSQLiteDatabase
import com.jsik.lottoapplication.db.LottoDatabase
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers.IO
import kotlinx.coroutines.launch
import org.koin.dsl.module

val databaseModule = module {
  single {
    Room.databaseBuilder(get(), LottoDatabase::class.java, "database")
      .fallbackToDestructiveMigration()
//      .addCallback( object : RoomDatabase.Callback(){
//        override fun onCreate(db: SupportSQLiteDatabase) {
//          super.onCreate(db)
//        }
//      })
      .build()
  }

  single { get<LottoDatabase>().lottoDao() }

}