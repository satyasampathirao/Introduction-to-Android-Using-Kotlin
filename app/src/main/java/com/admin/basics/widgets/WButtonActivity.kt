package com.admin.basics.widgets

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.design.widget.Snackbar
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.Toast
import com.admin.basics.R
import kotlinx.android.synthetic.main.activity_wbutton.*

class WButtonActivity : AppCompatActivity() {


    //Reference for most of the concepts in this project:    https://www.tutorialkart.com/kotlin-android-tutorial/



    // Marking a property lateinit allows you to make it non nullable,
    // but not assign it a value at the time that your Activity's constructor is called.
    private lateinit var b1: Button


    val button4_Id: Int = 1111

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





        //-----------------------------
        /*val button4 = Button(this)
        button4.setLayoutParams(ViewGroup.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT))
        button4.setId(button4_Id)
        button4.x = 250f
        button4.y = 500f
        button4.setOnClickListener(this)
        constraintLayout.addView(button4)*/




    }


    public fun hello(){

        b1.setText("bolo")
    }





    fun  chello(view : View){


    }





}
