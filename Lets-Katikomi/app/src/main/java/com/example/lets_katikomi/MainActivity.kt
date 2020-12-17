package com.example.lets_katikomi

import android.content.Context
import android.content.Intent

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import com.google.firebase.firestore.FirebaseFirestore
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {

    val db = FirebaseFirestore.getInstance()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val image = findViewById<ImageView>(R.id.mapView)
        /*--------------------------------------------------------------------*/
        val pref = getSharedPreferences("user_name", Context.MODE_PRIVATE)
        val storedText = pref.getString("key", "未登録")
        val username = findViewById<TextView>(R.id.username)
        username.setText(storedText)
        /*---------------------------------------------------------------------*/

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

    fun onButtonTappedMD(view: View?) {
        val intent = Intent(this, detail::class.java)
        startActivity(intent)
    }

    fun onButtonTappedMS(view: View?) {
        val intent = Intent(this, setting::class.java)
        startActivity(intent)
    }

    fun onClickEnter(view: View) {

        val pref = getSharedPreferences("user_name", Context.MODE_PRIVATE)
        val storedText = pref.getString("key", "未登録")

        if (storedText.equals("") == false) {

            val name = storedText.toString()

            val user = hashMapOf(
                "user" to name
            )

            db.collection("users").document(name)
                .set(user)
                .addOnSuccessListener { Toast.makeText(applicationContext, "入室しました", Toast.LENGTH_SHORT).show() }
                .addOnFailureListener { Toast.makeText(applicationContext, "入室に失敗しました", Toast.LENGTH_SHORT).show() }
        }
        else {
            Toast.makeText(applicationContext, "設定から名前を入力してください", Toast.LENGTH_SHORT).show()
        }
    }

    fun onClickLeave(view: View) {

        val pref = getSharedPreferences("user_name", Context.MODE_PRIVATE)
        val storedText = pref.getString("key", "未登録")

        if (storedText.equals("") == false) {

            val name = storedText.toString()

            db.collection("users").document(name)
                .delete()
                .addOnSuccessListener { Toast.makeText(applicationContext, "退室しました", Toast.LENGTH_SHORT).show() }
                .addOnFailureListener { Toast.makeText(applicationContext, "退室に失敗しました", Toast.LENGTH_SHORT).show() }
        }
        else {
            Toast.makeText(applicationContext, "設定から名前を入力してください", Toast.LENGTH_SHORT).show()
        }
    }


}