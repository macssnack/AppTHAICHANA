package com.android.example.appthaichana

import com.android.example.appthaichana.data.DataBaseHandler
import com.android.example.appthaichana.data.User
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.lifecycle.LifecycleOwner
import com.android.example.appthaichana.data.AppDatabase
import com.android.example.appthaichana.data.DatabaseQR
import io.reactivex.Flowable
import io.reactivex.Scheduler
import io.reactivex.schedulers.Schedulers
import kotlinx.android.synthetic.main.activity_register.*

class Register : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)

        //กดเก็บข้อมูลชื่อและเบอร์โทร DATA BASE
//        val context = this

        val appDatabase = AppDatabase.getInstance(this)
        val data = DatabaseQR()
        data.uid = "111"
        data.locations = "sssss"
        data.name = "wwew"
        data.phonenumber = "3334"




        buttonregister.setOnClickListener {
            if(etName.text.toString().isNotEmpty() &&
                etPhone.text.toString().isNotEmpty()
            ){

//                var user = User(etName.text.toString(), etPhone.text.toString().toInt())
//                var db = DataBaseHandler(context)
//                db.insertData(user)
                //คำสั่งไปหน้าต่อไป ใน1คำสั่งปุ่ม คำสั่งแต่ละอันต้องอยู่ในหัวข้อปุ่มเดียวกัน
                val intent = Intent(this, Welcomepage::class.java)
                startActivity(intent)
                //-----------------------------------------------------
            }else{
                Toast.makeText(this,"Please Fill All Data's",Toast.LENGTH_SHORT).show()

            }
        }

    }
}