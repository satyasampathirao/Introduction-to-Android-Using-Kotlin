package com.admin.basics.widgets

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.widget.Toast
import com.admin.basics.R
import kotlinx.android.synthetic.main.activity_wtextview.*

class WTextviewActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_wtextview)



        button.setOnClickListener(){

            val inputValue : String = editText.text.toString()
            if (inputValue == null || inputValue.trim() == ""){

                Toast.makeText(this, "Please input data", Toast.LENGTH_SHORT).show()
            }else{
                textView4.setText(inputValue).toString()
            }

        }

        textView5.setOnClickListener(){
            if (textView4.text.toString() == null || textView4.text.toString().trim()==""){
                Toast.makeText(this,"clicked on reset textView,\n output textView already reset",Toast.LENGTH_LONG).show()
            }else{
                textView4.setText("").toString()
            }
        }

        editText.addTextChangedListener(object : TextWatcher {
            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {
//                TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
                Toast.makeText(applicationContext,"executed before making any change over EditText",Toast.LENGTH_SHORT).show()

            }


            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
  //              TODO("not implemented") //To change body of created functions use File | Settings | File Templates.

                Toast.makeText(applicationContext,"executed while making any change over EditText",Toast.LENGTH_SHORT).show()

            }

            override fun afterTextChanged(s: Editable?) {
//                TODO("not implemented") //To change body of created functions use File | Settings | File Templates.

                Toast.makeText(applicationContext,"executed after change made over EditText",Toast.LENGTH_SHORT).show()

            }



        })






    }



}
