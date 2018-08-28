package de.adorsys.android.sessionone

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val textView = findViewById<TextView>(R.id.myTextView)
        textView.text = "irgendwas neues 🙈"

        val button = findViewById<Button>(R.id.myButton)
        button.text = "Click me 🐶"
    }
}
