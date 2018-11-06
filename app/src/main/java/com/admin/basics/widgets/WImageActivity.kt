package com.admin.basics.widgets

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.Toast
import com.admin.basics.R

class WImageActivity : AppCompatActivity() {


    private lateinit var imgQuote: ImageView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_wimage)


        imgQuote= findViewById(R.id.imgQuote) as ImageView;

        imgQuote.setOnClickListener{

            Toast.makeText(this,"Image Clicked", Toast.LENGTH_SHORT).show()

        }

        //imgQuote



    }



}
