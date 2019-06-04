package com.admin.basics.mymenus

import android.graphics.Color
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.ContextMenu
import android.view.MenuItem
import android.view.View
import android.widget.Button
import android.widget.LinearLayout
import com.admin.basics.R

class MyContextMenuActivity : AppCompatActivity() {

    lateinit var btcontext : Button

    lateinit var llcontext: LinearLayout



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_my_context_menu)

        btcontext = findViewById(R.id.btcontext) as Button
        registerForContextMenu(btcontext)


        llcontext = findViewById(R.id.llcontext) as LinearLayout

    }


    override fun onCreateContextMenu(menu: ContextMenu?, v: View?, menuInfo: ContextMenu.ContextMenuInfo?) {

       menuInflater.inflate(R.menu.menu1, menu)

       return  super.onCreateContextMenu(menu, v, menuInfo)

    }


    override fun onContextItemSelected(item: MenuItem?): Boolean {

        when(item?.itemId){
            R.id.item1 -> llcontext.setBackgroundColor(Color.parseColor("#FF0000"))

            R.id.item2 -> llcontext.setBackgroundColor(resources.getColor(R.color.colorAccent))

            R.id.item3 -> llcontext.setBackgroundColor(resources.getColor(R.color.colorPrimaryDark))
        }

        return super.onContextItemSelected(item)
    }





}
