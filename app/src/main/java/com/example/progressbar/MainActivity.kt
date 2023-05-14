package com.example.progressbar

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.LinearLayout
import android.widget.ProgressBar

class MainActivity : AppCompatActivity() {
    @SuppressLint("CutPaseId", "SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<Button>(R.id.sort).setOnClickListener {
            findViewById<ProgressBar>(R.id.progressBar).progress = 0
            findViewById<LinearLayout>(R.id.unsorted).removeAllViews()
            findViewById<LinearLayout>(R.id.sorted).removeAllViews()

            val ListLength = if (findViewById<EditText>(R.id.numbers).text.toString()!="")
                findViewById<EditText>(R.id.numbers).text.toString().toInt()
            else 10
        }
    }
}