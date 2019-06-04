package com.admin.basics.apps

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import com.admin.basics.R

class LoginActivity : AppCompatActivity(), View.OnClickListener {


    lateinit var et_user_name : EditText
    lateinit var et_password : EditText

    lateinit var btn_reset:Button
    lateinit var btn_submit:Button


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        et_user_name = findViewById(R.id.et_user_name) as EditText
        et_password =  findViewById(R.id.et_password) as EditText

        btn_reset = findViewById(R.id.btn_reset) as Button
        btn_submit =  findViewById(R.id.btn_submit) as Button


        btn_submit.setOnClickListener(this)
        btn_reset.setOnClickListener(this)

    }

    override fun onClick(v: View?) {
        /*TODO("not implemented") //To change body of created functions use File | Settings | File Templates.*/

        when(v?.id){

            R.id.btn_submit->{

                var a= et_user_name.text;
                var b= et_password.text
                Toast.makeText(this,  "$a $b", Toast.LENGTH_SHORT).show()
                Toast.makeText(this,  a.toString()+b.toString(), Toast.LENGTH_SHORT).show()

            }

            R.id.btn_reset->{

                et_user_name.setText("")
                et_password.setText("")
            }

        }



    }




}
