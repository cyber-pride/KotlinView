package com.bluapp.kotlinview.spinner

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "spinner")
data class Spinner14(
    @PrimaryKey
    var id: Long?,
    @ColumnInfo(name = "username")
    var username: String
)