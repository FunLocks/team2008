package com.example.lets_katikomi

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText

class setting : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_setting)
        /*--------------------------------------------------------------------*/
        val user_name = getSharedPreferences("user_name", Context.MODE_PRIVATE)
        val storedText = user_name.getString("key", "未登録")
        val editText = findViewById<EditText>(R.id.editTextTextPersonName2)
        editText.setText(storedText)

        val save_button = findViewById<Button>(R.id.saveButton)

        save_button.setOnClickListener{
            val inputText = editText.text.toString()
            user_name.edit().putString("key", inputText).apply()
        }
        /*--------------------------------------------------------------------*/
    }
    fun onButtonTappedMS(view: View?){
        finish()
        val intent = Intent(this, MainActivity::class.java)
        startActivity(intent)
    }
    fun onButtonTappedDS(view: View?){
        finish()
        val intent = Intent(this, detail::class.java)
        startActivity(intent)
    }
}
