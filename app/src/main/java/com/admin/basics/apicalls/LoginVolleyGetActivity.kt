package com.admin.basics.apicalls

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.text.TextUtils
import android.util.Log
import android.view.View
import android.widget.EditText
import android.widget.ProgressBar
import android.widget.TextView
import android.widget.Toast
import com.admin.basics.R
import com.android.volley.AuthFailureError
import com.android.volley.Request
import com.android.volley.Response
import com.android.volley.toolbox.StringRequest
import com.na.kotlin.URLs
import com.na.kotlin.VolleySingleton
import kotlinx.android.synthetic.main.activity_login_volley_get.*
import org.json.JSONException
import org.json.JSONObject
import android.R.attr.data

import java.io.UnsupportedEncodingException


class LoginVolleyGetActivity : AppCompatActivity() {

    //reference:    https://www.javatpoint.com/kotlin-android-web-service

    //working sample. tested.     just change the Request url and body

    // more: also see the below link for okhttp get listview
    //https://www.javatpoint.com/kotlin-android-json-parsing-using-url

    internal lateinit var etName: EditText
    internal lateinit var etPassword: EditText
    internal lateinit var progressBar: ProgressBar
    internal lateinit var tvResponse: TextView

    internal lateinit var finalUrl: String


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login_volley_get)

        progressBar = findViewById(R.id.progressBar);
        etName = findViewById(R.id.etUserName);
        etPassword = findViewById(R.id.etUserPassword);
        tvResponse = findViewById(R.id.tvResponse)

        /*etName.setText("asfsa2095vds434899")
        etPassword.setText("asfa209vasv5434899")*/

        btnLogin.setOnClickListener(View.OnClickListener {
            userLogin()
        })

    }


    private fun userLogin() {


        val username = etName.text.toString();
        val password = etPassword.text.toString()

        if (TextUtils.isEmpty(username)) {
            etName.error = "Please enter your username"
            etName.requestFocus()
            return
        }

        if (TextUtils.isEmpty(password)) {
            etPassword.error = "Please enter your password"
            etPassword.requestFocus()
            return
        }



        finalUrl = URLs.ROOT_URL + username + "&password=" + password;

        progressBar.visibility = View.VISIBLE

        //if everything is fine
        val stringRequest = object : StringRequest(
                Request.Method.GET, finalUrl,
                Response.Listener { response ->
                    progressBar.visibility = View.GONE

                    try {
                        //converting response to json object
                        val obj = JSONObject(response)

                        Log.d("Login:", obj.toString());

                        //if no error in response
                        if (!obj.has("error")) {
                            tvResponse.setText(obj.toString())

                            //  Toast.makeText(applicationContext, obj.getString("message"), Toast.LENGTH_SHORT).show()
                            //finish()
                            startActivity(Intent(applicationContext, SuccessActivity::class.java))

                        } else {
                            tvResponse.setText(obj.toString())

                        }





                    } catch (e: JSONException) {
                        e.printStackTrace()
                    }
                },
                Response.ErrorListener { error -> Toast.makeText(applicationContext, error.message, Toast.LENGTH_SHORT).show()
                    progressBar.visibility = View.GONE
                 //   tvResponse.setText(response.toString())
                    var body : String =""
                    if (error.networkResponse.data != null) {
                        try {
                            body = String(error.networkResponse.data)
                        } catch (e: UnsupportedEncodingException) {
                            e.printStackTrace()
                        }

                    }

                    tvResponse.setText(body)

                }) {
            @Throws(AuthFailureError::class)


            //(optional)    add body if any for POST/PUT/DELETE
            /* override fun getParams(): Map<String, String> {
                 val params = HashMap<String, String>()
                 params["username"] = username
                 params["password"] = password
                 return params
             }*/


            //(optional)    add headers if any
            override fun getHeaders(): MutableMap<String, String> {
                val headers = HashMap<String, String>()
                headers["Authorization"] = "Basic dW06VlhCMFlXdGxMVWx5YjI0aA=="
                return headers
            }




        }

        VolleySingleton.getInstance(this).addToRequestQueue(stringRequest)


    }


}
