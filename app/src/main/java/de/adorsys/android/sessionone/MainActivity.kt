package de.adorsys.android.sessionone

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setupTexts()
        setupButtonClickListener()
    }

    private fun setupButtonClickListener() {
        val button = findViewById<Button>(R.id.myButton)

        button.setOnClickListener {
            val intent = Intent(this, SecondActivity::class.java)
            startActivity(intent)
        }
    }

    private fun setupTexts() {
        val textView = findViewById<TextView>(R.id.myTextView)
        textView.text = "irgendwas neues 🙈"

        val button = findViewById<Button>(R.id.myButton)
        button.text = "Click me 🐶"
    }
}
