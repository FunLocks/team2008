package com.example.lets_katikomi

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity

class detail : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)
    }

    fun onButtonTappedMD(view: View?){
        finish()
        val intent = Intent(this, MainActivity::class.java)
        startActivity(intent)
    }
    fun onButtonTappedDS(view: View?) {
        finish()
        val intent = Intent(this, setting::class.java)
        startActivity(intent)
    }
}