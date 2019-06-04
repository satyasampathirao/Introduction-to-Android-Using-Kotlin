package com.admin.basics.widgets

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.Gravity
import android.widget.Toast
import com.admin.basics.R
import kotlinx.android.synthetic.main.activity_wtoast.*

class WToastActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_wtoast)


        btToast1.setOnClickListener(){

            Toast.makeText(applicationContext, "Toast 1", Toast.LENGTH_SHORT).show()
        }

        btToast2.setOnClickListener(){

            val toast = Toast.makeText(applicationContext, "Toast 2", Toast.LENGTH_SHORT)
            toast.show()
        }

        btToast3.setOnClickListener(){

            val myToast = Toast.makeText(applicationContext,"toast message with gravity",Toast.LENGTH_SHORT)
            myToast.setGravity(Gravity.LEFT,200,200)
            myToast.show()
        }


    }
}
