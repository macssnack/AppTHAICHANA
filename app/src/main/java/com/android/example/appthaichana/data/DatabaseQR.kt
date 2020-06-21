package com.android.example.appthaichana.data

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey


@Entity(tableName = "merchant")
data class DatabaseQR(@PrimaryKey(autoGenerate = true) var id: Int? = null,

                      @ColumnInfo(name="uid") var uid: String? = null,
                      @ColumnInfo(name="name") var name: String? = null,
                      @ColumnInfo(name="phone_number") var phonenumber: String? = null,
                      @ColumnInfo(name="locations") var locations: String? = null

)
