package com.example.tms_anonl_17_lesson_16

import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.example.tms_anonl_17_lesson_15.R

class FirstActivity : AppCompatActivity() {
companion object{
    const val SLEEP = 3000L
}
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_first)

        val button: Button = findViewById(R.id.btn_to)

        button.setOnClickListener {
            it.postDelayed({
                startActivity(SecondActivity().launchIntent(this))
            }, SLEEP)
        }
    }
}