package com.admin.basics.mymenus

import android.graphics.Color
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import android.widget.Button
import android.widget.LinearLayout
import android.widget.PopupMenu
import com.admin.basics.R

class MyPopupActivity : AppCompatActivity() {

    lateinit var btpopup : Button
    lateinit var llpopup : LinearLayout



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_my_popup)


        btpopup = findViewById(R.id.btpopup) as Button
        llpopup = findViewById(R.id.llpopup) as LinearLayout

        btpopup.setOnClickListener {


            val popupmenu = PopupMenu(this, btpopup)
            popupmenu.menuInflater.inflate(R.menu.menu1, popupmenu.menu)

            popupmenu.setOnMenuItemClickListener(object : PopupMenu.OnMenuItemClickListener {

                override fun onMenuItemClick(item: MenuItem?): Boolean {

                    when(item?.itemId){

                        R.id.item1 -> llpopup.setBackgroundColor(Color.parseColor("#FF0000"))

                        R.id.item2 -> llpopup.setBackgroundColor(resources.getColor(R.color.colorAccent))

                        R.id.item3 -> llpopup.setBackgroundColor(resources.getColor(R.color.colorPrimaryDark))


                    }

                    return true
                }


            });

            popupmenu.show()

        }


    }

}


