package com.admin.basics.widgets

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.design.widget.Snackbar
import android.widget.Button
import android.widget.Toast
import com.admin.basics.R
import kotlinx.android.synthetic.main.activity_wbutton.*

class WButtonActivity : AppCompatActivity() {


  //  Marking a property lateinit allows you to make it non nullable,
    // but not assign it a value at the time that your Activity's constructor is called.

    private lateinit var b1: Button


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_wbutton)

        b1= findViewById(R.id.b1) as Button;

        b1.setOnClickListener{
            Toast.makeText(this, "Hello", Toast.LENGTH_SHORT).show()
            hello()


           /* val snack = Snackbar.make(it,"This is a simple Snackbar",Snackbar.LENGTH_LONG)
            snack.show()*/

             Snackbar.make(it, "This is a simple snack bar", Snackbar.LENGTH_SHORT).show()
        }



    }


    public fun hello(){

        b1.setText("bolo")
    }







}
