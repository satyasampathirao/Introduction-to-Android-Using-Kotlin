package com.admin.basics.apps

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.speech.tts.TextToSpeech
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import com.admin.basics.R
import java.util.*

class TextToSpeechActivity : AppCompatActivity() , TextToSpeech.OnInitListener {

    lateinit var buttonSpeak:Button

    private var tts: TextToSpeech? = null
    private var editText: EditText?=null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_text_to_speech)


        tts = TextToSpeech(this, this)

        buttonSpeak = findViewById(R.id.bsound) as Button
        buttonSpeak!!.isEnabled=false

        editText = findViewById(R.id.editText) as EditText

        buttonSpeak!!.setOnClickListener { speakOut() }

    }


    override fun onInit(status: Int) {

        if (status == TextToSpeech.SUCCESS) {
            // set US English as language for tts
            val result = tts!!.setLanguage(Locale.US)

            if (result == TextToSpeech.LANG_MISSING_DATA || result == TextToSpeech.LANG_NOT_SUPPORTED) {
                Log.e("TTS","The Language specified is not supported!")
            } else {
                buttonSpeak!!.isEnabled = true
            }

        } else {
            Log.e("TTS", "Initilization Failed!")
        }

    }




    private fun speakOut() {
        Toast.makeText(this, "Button clicked", Toast.LENGTH_SHORT).show()
        val text = editText!!.text.toString()
        tts!!.speak(text, TextToSpeech.QUEUE_FLUSH, null,"")
    }


    public override fun onDestroy() {
        // Shutdown TTS
        if (tts != null) {
            tts!!.stop()
            tts!!.shutdown()
        }
        super.onDestroy()
    }


}
