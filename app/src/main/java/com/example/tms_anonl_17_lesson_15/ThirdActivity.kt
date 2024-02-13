package com.example.tms_anonl_17_lesson_15

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.widget.Button

class ThirdActivity : AppCompatActivity(), Sleep {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_third)

        val buttonFifth: Button = findViewById(R.id.btn_to5)

        buttonFifth.setOnClickListener {
            sleepAndGo(FifthActivity().launchIntent(this,
                resources.getString(R.string.from_third)))
        }
    }

    fun launchIntent(context: Context): Intent {
        return Intent(context, ThirdActivity::class.java)
    }

    override fun sleepAndGo(intent: Intent) {
        val looper = requireNotNull(Looper.myLooper())
        val handler = Handler(looper)
        handler.postDelayed({
            startActivity(intent)
        }, Sleep.SLEEP_TIME)
    }
}