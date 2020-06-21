package com.android.example.appthaichana.data

import android.telephony.PhoneNumberUtils
import androidx.lifecycle.LiveData
import androidx.room.*


@Dao
interface DatabaseQRDao {

    @Insert
    fun insertmerchant(vararg DatabaseQR : DatabaseQR)

    @Update
    fun updatemerchant(DatabaseQR : DatabaseQR)

    @Query("SELECT * FROM merchant")
    fun getmerchantall(): List<DatabaseQR>

    @Query("SELECT * FROM merchant WHERE merchant.uid IN(:userIds)")
    fun loadAllByIds(userIds:IntArray):List<DatabaseQR>?

    @Query("SELECT * FROM merchant WHERE merchant.name IN(:userName)")
    fun getUserByName(userName:String):List<DatabaseQR>?

    @Query("SELECT * FROM merchant WHERE merchant.phone_number IN(:userPhoneNumber)")
    fun getUserByPhoneNumber(userPhoneNumber:String):List<DatabaseQR>?

    @Query("SELECT * FROM merchant WHERE merchant.locations IN(:userLocation)")
    fun getUserByLocation(userLocation:String):List<DatabaseQR>?

    @Delete
    fun deletemerchant(DatabaseQR: DatabaseQR)

}