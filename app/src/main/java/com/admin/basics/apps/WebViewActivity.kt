package com.admin.basics.apps

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView
import com.admin.basics.R

class WebViewActivity : AppCompatActivity() {

    lateinit var mywebview:WebView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_web_view)

        mywebview = findViewById(R.id.mywebview) as WebView
        mywebview.loadUrl("https://www.google.com/")



    }


    
}
