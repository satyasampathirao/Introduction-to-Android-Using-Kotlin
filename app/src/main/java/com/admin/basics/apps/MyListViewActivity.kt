package com.admin.basics.apps

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.Toast
import com.admin.basics.R
import kotlinx.android.synthetic.main.activity_my_list_view.*

class MyListViewActivity : AppCompatActivity() {


    var array = arrayOf("Melbourne", "Vienna", "Vancouver", "Toronto", "Calgary", "Adelaide", "Perth",
            "Auckland", "Helsinki", "Hamburg", "Munich", "New York", "Sydney", "Paris", "Cape Town", "Barcelona", "London", "Bangkok")

    //hi

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_my_list_view)

        val adapter = ArrayAdapter(this,
                R.layout.listview_item, array)

   //     val listView: ListView = findViewById(R.id.listview_1)
        listview_1.setAdapter(adapter)




        listview_1.onItemClickListener = object : AdapterView.OnItemClickListener {

            override fun onItemClick(parent: AdapterView<*>, view: View,
                                     position: Int, id: Long) {

                // value of item that is clicked
                val itemValue = listview_1.getItemAtPosition(position) as String

                // Toast the values
                Toast.makeText(applicationContext,
                        "Position :$position\nItem Value : $itemValue", Toast.LENGTH_LONG)
                        .show()
            }
        }











    }
}
