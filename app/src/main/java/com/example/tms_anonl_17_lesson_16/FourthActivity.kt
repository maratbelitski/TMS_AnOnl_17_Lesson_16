package com.example.tms_anonl_17_lesson_16

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.widget.Button
import com.example.tms_anonl_17_lesson_15.R

class FourthActivity : AppCompatActivity(), Sleep {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fourth)

        val buttonFifth: Button = findViewById(R.id.btn_to5)

        buttonFifth.setOnClickListener {
            sleepAndGo(FifthActivity().launchIntent(this,
                resources.getString(R.string.from_fourth)))
        }
    }

    fun launchIntent(context: Context): Intent {
        return Intent(context, FourthActivity::class.java)
    }

    override fun sleepAndGo(intent: Intent) {
        val looper = requireNotNull(Looper.myLooper())
        val handler = Handler(looper)
        handler.postDelayed({
            startActivity(intent)
        }, Sleep.SLEEP_TIME)
    }
}