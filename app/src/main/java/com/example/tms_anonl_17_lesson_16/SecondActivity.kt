package com.example.tms_anonl_17_lesson_16

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.widget.Button
import com.example.tms_anonl_17_lesson_15.R

class SecondActivity : AppCompatActivity(), Sleep {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        val buttonThird: Button = findViewById(R.id.btn_to3)
        val buttonFourth: Button = findViewById(R.id.btn_to4)

        buttonFourth.setOnClickListener {
            sleepAndGo(FourthActivity().launchIntent(this))
        }

        buttonThird.setOnClickListener {
            sleepAndGo(ThirdActivity().launchIntent(this))
        }
    }


    fun launchIntent(context: Context): Intent {
        return Intent(context, SecondActivity::class.java)
    }

    override fun sleepAndGo(intent: Intent) {
        val looper = requireNotNull(Looper.myLooper())
        val handler = Handler(looper)
        handler.postDelayed({
            startActivity(intent)
        }, Sleep.SLEEP_TIME)
    }
}