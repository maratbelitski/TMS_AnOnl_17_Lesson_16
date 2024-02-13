package com.example.tms_anonl_17_lesson_15

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class FirstActivity : AppCompatActivity(), Sleep {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_first)

        val button: Button = findViewById(R.id.btn_to)


        button.setOnClickListener {
           sleepAndGo(SecondActivity().launchIntent(this))
        }
    }

    override fun sleepAndGo(intent: Intent) {
        val looper = requireNotNull(Looper.myLooper())
        val handler = Handler(looper)
        handler.postDelayed({
            startActivity(intent)
        }, 3000)
    }
}