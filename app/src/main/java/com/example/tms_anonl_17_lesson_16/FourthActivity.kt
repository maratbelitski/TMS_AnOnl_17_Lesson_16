package com.example.tms_anonl_17_lesson_16

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.example.tms_anonl_17_lesson_15.R

class FourthActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fourth)

        val buttonFifth: Button = findViewById(R.id.btn_to5)

        buttonFifth.setOnClickListener {
            it.postDelayed({
                startActivity(
                    FifthActivity().launchIntent(
                        this,
                        resources.getString(R.string.from_fourth)
                    )
                )
            }, FirstActivity.SLEEP)
        }
    }

    fun launchIntent(context: Context): Intent {
        return Intent(context, FourthActivity::class.java)
    }
}