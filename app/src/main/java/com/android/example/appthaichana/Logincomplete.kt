package com.android.example.appthaichana

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_logincomplete.*

class Logincomplete : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_logincomplete)

        //---เป็นการรับค่า intent จากอีกหน้า โดยมี key คือ scantext
        var value = intent.getStringExtra("scantext")

//        thaichanalogin.text = value
//
//        buttonnext.setOnClickListener{
//            val intent = Intent(this, MainActivity::class.java)
//            startActivity(intent)
//        }


        //---พิมพ์ขึ้นเพื่อให้เราสามารถทำรายการต่างๆ เมื่อเปิดเว็ปเบ้าเซอร์ได้
        webView.loadUrl(value)
            webView.settings.javaScriptEnabled=true
            webView.settings.allowContentAccess=true
            webView.settings.domStorageEnabled=true
            webView.settings.useWideViewPort=true
            webView.settings.setAppCacheEnabled(true)

    }



}