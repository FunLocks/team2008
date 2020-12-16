package com.example.lets_katikomi

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class setting : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_setting)
    }
    fun onButtonTappedMS(view: View?){
        finish()
    }
    fun onButtonTappedDS(view: View?){
        finish()
        val intent = Intent(this, detail::class.java)
        startActivity(intent)
    }
}
