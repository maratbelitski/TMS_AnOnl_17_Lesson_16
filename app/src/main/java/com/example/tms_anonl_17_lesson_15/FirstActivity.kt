package com.example.tms_anonl_17_lesson_15

import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class FirstActivity : AppCompatActivity(), Sleep {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_first)

        val button: Button = findViewById(R.id.btn_to)

        button.setOnClickListener {
            sleep()
            startActivity(SecondActivity().launchIntent(this))
        }
    }

    override fun sleep() {
        val thread = Thread {
            Thread.sleep(3000)
        }
        thread.start()
        thread.join()
    }
}