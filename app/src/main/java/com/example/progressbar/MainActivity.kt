package com.example.progressbar

import android.annotation.SuppressLint
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*
import androidx.annotation.RequiresApi
import java.util.*
import kotlin.streams.toList

class MainActivity : AppCompatActivity() {
    @RequiresApi(Build.VERSION_CODES.N)
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

            val currentTime = System.currentTimeMillis()
            val ListToSort = Random().ints(ListLength.toLong()).toList().toMutableList()
            for (element in ListToSort){
                val textToAdd = TextView(this.baseContext)
                textToAdd.text="$element"
                runOnUiThread { findViewById<LinearLayout>(R.id.unsorted).addView(textToAdd) }
            }

        }
    }
}