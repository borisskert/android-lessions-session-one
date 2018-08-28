package de.adorsys.android.sessionone

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class SecondActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        val myTextFromEditView = intent.getStringExtra(Constants.MY_TEXT_FROM_TEXT_VIEW)

        val textView = findViewById<TextView>(R.id.mySecondTextView)
        textView.text = myTextFromEditView
    }
}
