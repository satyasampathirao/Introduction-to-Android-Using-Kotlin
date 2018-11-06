package com.admin.basics.dialouges

import android.app.AlertDialog
import android.content.DialogInterface
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.admin.basics.R

class MyAlertDialougeActivity : AppCompatActivity() {

    lateinit var btnalert:Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_my_alert_dialouge)


        btnalert = findViewById(R.id.btnalert) as Button
        btnalert.setOnClickListener{

            // build alert dialog
            val dialogBuilder = AlertDialog.Builder(this)

                    // set title for alert dialog box
            dialogBuilder.setTitle("AlertDialougeExample")
                    // set message of alert dialog
                    .setMessage("Do you want to close this application ?")
                    // if the dialog is cancelable
                    .setCancelable(false)
                    // positive button text and action
                    .setPositiveButton("Proceed", DialogInterface.OnClickListener {
                        dialog, id -> finish()
                    })
                    // negative button text and action
                    .setNegativeButton("Cancel", DialogInterface.OnClickListener {
                        dialog, id -> dialog.cancel()
                    })

            // create dialog box
            val alert = dialogBuilder.create()

         //   alert.setTitle("AlertDialogExample")
            // show alert dialog
            alert.show()


        }


    }
}
