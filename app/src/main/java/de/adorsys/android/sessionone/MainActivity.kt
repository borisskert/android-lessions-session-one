package de.adorsys.android.sessionone

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        showToastMessage("onCreate")

        setContentView(R.layout.activity_main)

        setupTexts()
        setupButtonClickListener()
    }

    override fun onStart() {
        super.onStart()
        showToastMessage("onStart")
    }

    override fun onPause() {
        showToastMessage("onPause")
        super.onPause()
    }

    override fun onRestart() {
        super.onRestart()
        showToastMessage("onRestart")
    }

    override fun onResume() {
        super.onResume()
        showToastMessage("onResume")
    }

    override fun onStop() {
        showToastMessage("onStop")
        super.onStop()
    }

    private fun showToastMessage(text: String) {
        Toast.makeText(this, "MainActivity: $text", Toast.LENGTH_LONG).show()
    }

    private fun setupButtonClickListener() {
        val button = findViewById<Button>(R.id.myButton)

        button.setOnClickListener {
            val intent = Intent(Constants.CAM_INTEND_ID)
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
