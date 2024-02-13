package com.example.tms_anonl_17_lesson_15

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class FifthActivity : AppCompatActivity() {
    companion object {
        const val WHERE_FROM = "where from"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fifth)

        val textMessage = findViewById<TextView>(R.id.tv_arrived_message)
        val message = intent.getStringExtra(WHERE_FROM)

        textMessage.text = message
    }

    fun launchIntent(context: Context, message: String): Intent {
        val intent = Intent(context, FifthActivity::class.java)
        intent.putExtra(WHERE_FROM, message)
        return intent
    }
}