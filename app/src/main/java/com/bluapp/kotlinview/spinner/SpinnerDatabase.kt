package com.bluapp.kotlinview.spinner

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase

@Database(entities = arrayOf(Spinner14::class), version = 1, exportSchema = false)
abstract class SpinnerDatabase : RoomDatabase() {
    abstract fun spinnerDAO(): SpinnerDAO

    companion object {
        private var instance: SpinnerDatabase? = null

        fun getInstance(context: Context): SpinnerDatabase {
            if (instance == null) {
                instance =
                    Room.databaseBuilder(context, SpinnerDatabase::class.java, "spinnerdb")
                        .fallbackToDestructiveMigration()
                        .allowMainThreadQueries()
                        .build()
            }
            return instance as SpinnerDatabase
        }

        fun destroyInstance() {
            instance = null
        }
    }
}