package com.example.lets_katikomi

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ImageView
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val image = findViewById<ImageView>(R.id.mapView)

        spinner.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {

            override fun onItemSelected(
                parent: AdapterView<*>?,
                view: View?,
                position: Int,
                id: Long
            ) {
                val text = parent?.selectedItem as String


                when(text) {
                    "F1" -> {
                        image.setImageResource(R.drawable.fun1)
                    }
                    "F2" -> {
                        image.setImageResource(R.drawable.fun2)
                    }
                    "F3" -> {
                        image.setImageResource(R.drawable.fun3)
                    }
                    "F4" -> {
                        image.setImageResource(R.drawable.fun4)
                    }
                    "F5"-> {
                        image.setImageResource(R.drawable.fun5)
                    }
                }
            }
            override fun onNothingSelected(parent: AdapterView<*>?) {
            }
        }
    }
}