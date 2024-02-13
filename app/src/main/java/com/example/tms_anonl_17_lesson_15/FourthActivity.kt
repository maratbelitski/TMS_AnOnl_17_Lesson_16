package com.example.tms_anonl_17_lesson_15

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class FourthActivity : AppCompatActivity(), Sleep {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fourth)

        val buttonFifth: Button = findViewById(R.id.btn_to5)

        buttonFifth.setOnClickListener {
            sleep()
            startActivity(FifthActivity().launchIntent(this, resources.getString(R.string.from_fourth)))
        }
    }

    fun launchIntent(context: Context): Intent {
        return Intent(context, FourthActivity::class.java)
    }

    override fun sleep() {
        val thread = Thread {
            Thread.sleep(3000)
        }
        thread.start()
        thread.join()
    }
}