package com.android.example.appthaichana.data

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase

@Database(entities = [DatabaseQR::class], version = 1)
abstract class AppDatabase : RoomDatabase() {

    companion object {
        private var INSTANCE: AppDatabase? = null

        fun getInstance(context: Context): AppDatabase{
            if (INSTANCE == null){
                synchronized(AppDatabase::class){
                    INSTANCE = Room.databaseBuilder(context.applicationContext, AppDatabase::class.java, "db_app").build()
                }
            }
            return  INSTANCE!!
        }
//        fun getAppDatabase(context: Context): AppDatabase =
//            Room.databaseBuilder(context.applicationContext, AppDatabase::class.java, "dbapp").build()
    }

    abstract fun databaseQRDao(): DatabaseQRDao
}