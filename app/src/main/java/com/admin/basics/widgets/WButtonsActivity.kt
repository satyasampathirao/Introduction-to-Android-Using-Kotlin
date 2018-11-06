package com.admin.basics.widgets

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast
import com.admin.basics.R
import kotlinx.android.synthetic.main.activity_wbuttons.view.*

class WButtonsActivity : AppCompatActivity(), View.OnClickListener {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_wbuttons)

        var bhi= findViewById(R.id.bhi) as Button;
        var bby= findViewById(R.id.bby) as Button

        bhi.setOnClickListener(this);
        bby.setOnClickListener(this)

    }

    override fun onClick(view: View?) {
   //     TODO("not implemented") //To change body of created functions use File | Settings | File Templates.

        when (view?.id) {
            R.id.bhi -> {
                Toast.makeText(this, "button HI", Toast.LENGTH_SHORT).show()
            }
            R.id.bby -> {
                Toast.makeText(this, "button BY", Toast.LENGTH_SHORT).show()
            }
            else -> {}
        }



    }

}
