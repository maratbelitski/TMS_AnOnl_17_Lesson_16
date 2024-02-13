package com.example.tms_anonl_17_lesson_15

import android.content.Intent

/**
 * @author Belitski Marat
 * @date  13.02.2024
 * @project TMS_AnOnl_17_Lesson_15
 */
interface Sleep {
    companion object{
        const val SLEEP_TIME = 3000L
    }
    fun sleepAndGo(intent: Intent)
}