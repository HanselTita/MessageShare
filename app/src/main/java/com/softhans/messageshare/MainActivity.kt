package com.softhans.messageshare

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnShowToast.setOnClickListener {
            Log.i("MainActivity", "button was Clicked!")
            //i= information
            Toast.makeText(this, "Button was Clicked !", Toast.LENGTH_SHORT).show()
        }

        sendBtn.setOnClickListener {
            val message: String = etUserMessage.text.toString()
            Toast.makeText(this, "message send!", Toast.LENGTH_SHORT).show()
            val intent = Intent (this, SecondActivity:: class.java)
            intent.putExtra("user_message", message)
            startActivity(intent)
            /**
             * Explicit Intent is when you know your target activity. When you don't know your
             * target activity, it is called Implicit intent.
             */
        }
    }
}
