package com.admin.basics.apps

import android.content.Context
import android.content.SharedPreferences
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.annotation.IntegerRes
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import com.admin.basics.R

class MySharedPredActivity : AppCompatActivity() {



    private val sharedPrefFile = "kotlinsharedpreference"



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_my_shared_pred)



        val inputId = findViewById<EditText>(R.id.editId)
        val inputName = findViewById<EditText>(R.id.editName)
        val outputId = findViewById<TextView>(R.id.textViewShowId)
        val outputName = findViewById<TextView>(R.id.textViewShowName)

        val btnSave = findViewById<Button>(R.id.save)
        val btnView = findViewById<Button>(R.id.view)
        val btnClear = findViewById<Button>(R.id.clear)



        val sharedPreference : SharedPreferences = this.getSharedPreferences(sharedPrefFile, Context.MODE_PRIVATE);
        btnSave.setOnClickListener(View.OnClickListener {


            val id:Int = Integer.parseInt(inputId.text.toString())
            val name : String = inputName.text.toString();
            val editor:SharedPreferences.Editor = sharedPreference.edit()
            editor.putInt("id_key", id)
            editor.putString("name_key", name)
            editor.apply()
            editor.commit()

        })


        btnView.setOnClickListener{

            val sharedIdValue = sharedPreference.getInt("id_key",0);
            val sharedNameValue = sharedPreference.getString("name_key","defaultname")
            if (sharedIdValue.equals(0) && sharedNameValue.equals("defaultname")){

                outputName.setText("default name: ${sharedNameValue}").toString()
                outputId.setText("default id: ${sharedIdValue.toString()}")
            }else{
                outputName.setText(sharedNameValue).toString()
                outputId.setText(sharedIdValue.toString())
            }

        }

        btnClear.setOnClickListener(View.OnClickListener {
            val editor = sharedPreference.edit()
            editor.clear()
            editor.apply()
            outputName.setText("").toString()
            outputId.setText("".toString())
        })



    }



























}
