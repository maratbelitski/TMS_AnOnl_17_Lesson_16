package com.example.tms_anonl_17_lesson_16

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.example.tms_anonl_17_lesson_15.R

class SecondActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        val buttonThird: Button = findViewById(R.id.btn_to3)
        val buttonFourth: Button = findViewById(R.id.btn_to4)

        buttonFourth.setOnClickListener {
            it.postDelayed({
                startActivity(FourthActivity().launchIntent(this))
            }, FirstActivity.SLEEP)
        }

        buttonThird.setOnClickListener {
            it.postDelayed({
                startActivity(ThirdActivity().launchIntent(this))
            }, FirstActivity.SLEEP)
        }
    }

    fun launchIntent(context: Context): Intent {
        return Intent(context, SecondActivity::class.java)
    }
}