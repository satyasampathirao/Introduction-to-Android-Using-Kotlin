package com.admin.basics.mymenus

import android.graphics.Color
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuInflater
import android.view.MenuItem
import android.widget.LinearLayout
import com.admin.basics.R


//this ex is for optionsMenu
class MyOptionsMenuActivity : AppCompatActivity() {

    lateinit var background :LinearLayout

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_my_options_menu)

        background = findViewById(R.id.llmenu) as LinearLayout

    }


    override fun onCreateOptionsMenu(menu: Menu?): Boolean {

        menuInflater.inflate(R.menu.menu1, menu)

        return super.onCreateOptionsMenu(menu)

    }


    override fun onOptionsItemSelected(item: MenuItem?): Boolean {

        when(item?.itemId){
            R.id.item1 -> background.setBackgroundColor(Color.parseColor("#FF0000"))

            R.id.item2 -> background.setBackgroundColor(resources.getColor(R.color.colorAccent))

            R.id.item3 -> background.setBackgroundColor(resources.getColor(R.color.colorPrimaryDark))
        }


        return super.onOptionsItemSelected(item)
    }




}
