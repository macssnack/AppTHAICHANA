package com.android.example.appthaichana

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_logoutcomplete.*

class Logoutcomplete : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_logoutcomplete)

        buttongotoscan.setOnClickListener{
            val intent = Intent(this, Welcomepage::class.java)
            startActivity(intent)
        }

    }
}