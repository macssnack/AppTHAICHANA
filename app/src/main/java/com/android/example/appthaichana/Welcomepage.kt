package com.android.example.appthaichana

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_welcomepage.*

class Welcomepage : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_welcomepage)

        textHistory.setOnClickListener{
            val intent = Intent(this, History::class.java)
            startActivity(intent)
        }

        ButtonQR.setOnClickListener{
            val intent = Intent(this, Scan::class.java)
            startActivity(intent)
        }


    }
}