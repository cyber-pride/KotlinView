package com.bluapp.kotlinview.spinner

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy.REPLACE
import androidx.room.Query

@Dao
interface SpinnerDAO {

    @Query("select * from spinner")
    fun allSpinner(): List<Spinner14>

    @Insert(onConflict = REPLACE)
    fun insert(spinner14: Spinner14)
}