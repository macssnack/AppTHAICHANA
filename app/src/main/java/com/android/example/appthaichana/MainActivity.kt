package com.android.example.appthaichana

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.android.example.appthaichana.data.AppDatabase
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)




//วิธีการsetปุ่ม
        Buttonlogout.setOnClickListener{
            val intent = Intent(this, Logoutcomplete::class.java)
            startActivity(intent)
        }

    }
}