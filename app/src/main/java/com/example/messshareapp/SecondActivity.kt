package com.example.messshareapp

import android.os.Bundle
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class SecondActivity : AppCompatActivity() {
    private lateinit var txtmess:TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_second)
// form here will recieve the parameter but we don't have he setter and getter fun to do that
        val bundle : Bundle? = intent.extras // will extract the value form the key that we passed
        val string: String? = bundle!!.getString("user_message") // must match the same key in the first activity
        Toast.makeText(this, string, Toast.LENGTH_LONG)
            .show() // we didn't see the mess because of the .show() fun
    txtmess.text=string
    }

}