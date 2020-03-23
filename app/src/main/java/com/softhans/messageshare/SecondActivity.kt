package com.softhans.messageshare

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_second.*

class SecondActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        val bundle : Bundle? = intent.extras
        val msg = bundle!!.get("user_message")


      Toast.makeText(this, msg.toString(), Toast.LENGTH_SHORT).show()

        tvUserMessage.text = msg.toString()

    }
}
