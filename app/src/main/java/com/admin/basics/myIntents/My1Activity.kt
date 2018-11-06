package com.admin.basics.myIntents

import android.content.Intent
import android.net.Uri
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import com.admin.basics.R




class My1Activity : AppCompatActivity() {

    lateinit var bi1 : Button
    lateinit var bi3 : Button

//    private var bi1: Button?=null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_my1)

        bi1= findViewById(R.id.bi1) as Button
        bi3= findViewById(R.id.bi3) as Button


        //moving from one activity 2 another activity
        bi1.setOnClickListener{

            val intent = Intent(this, My2Activity::class.java)
            // start your next activity
            startActivity(intent)

        }



        //move to browser on button click
        bi3.setOnClickListener{

            val openURL = Intent(android.content.Intent.ACTION_VIEW)
            openURL.data = Uri.parse("https://www.google.com/")
            startActivity(openURL)

        }



    }



}