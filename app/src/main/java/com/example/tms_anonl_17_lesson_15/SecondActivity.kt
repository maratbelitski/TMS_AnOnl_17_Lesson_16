package com.example.tms_anonl_17_lesson_15

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class SecondActivity : AppCompatActivity(), Sleep {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        val buttonThird: Button = findViewById(R.id.btn_to3)
        val buttonFourth: Button = findViewById(R.id.btn_to4)

        buttonFourth.setOnClickListener {
            sleep()
            startActivity(FourthActivity().launchIntent(this))
        }

        buttonThird.setOnClickListener {
            sleep()
            startActivity(ThirdActivity().launchIntent(this))
        }
    }


    fun launchIntent(context: Context): Intent {
        return Intent(context, SecondActivity::class.java)
    }

    override fun sleep() {
        val thread = Thread {
            Thread.sleep(3000)
        }
        thread.start()
        thread.join()
    }
}