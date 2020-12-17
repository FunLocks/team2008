package com.example.lets_katikomi

import android.content.Context
import android.content.Intent

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
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
        val button1 = findViewById<Button>(R.id.button1)
        val button5 = findViewById<Button>(R.id.button5)
        val button = findViewById<Button>(R.id.button)
        val button9 = findViewById<Button>(R.id.button9)
        val button10 = findViewById<Button>(R.id.button10)
        val button11 = findViewById<Button>(R.id.button11)
        val button12 = findViewById<Button>(R.id.button12)
        val button13 = findViewById<Button>(R.id.button13)
        val button14 = findViewById<Button>(R.id.button14)
        val button15 = findViewById<Button>(R.id.button15)
        val button16 = findViewById<Button>(R.id.button16)
        val button17 = findViewById<Button>(R.id.button17)
        val button18 = findViewById<Button>(R.id.button18)
        val button19 = findViewById<Button>(R.id.button19)
        val button20 = findViewById<Button>(R.id.button20)
        val button21 = findViewById<Button>(R.id.button21)
        val button22 = findViewById<Button>(R.id.button22)
        val button23 = findViewById<Button>(R.id.button23)
        val button24 = findViewById<Button>(R.id.button24)
        val button25 = findViewById<Button>(R.id.button25)
        val button26 = findViewById<Button>(R.id.button26)
        val button27 = findViewById<Button>(R.id.button27)
        val button28 = findViewById<Button>(R.id.button28)
        val button29 = findViewById<Button>(R.id.button29)
        val button30 = findViewById<Button>(R.id.button30)
        val button31 = findViewById<Button>(R.id.button31)
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
                        button1.visibility=View.VISIBLE
                        button5.visibility=View.VISIBLE
                        button.visibility=View.GONE
                        button9.visibility=View.GONE
                        button10.visibility=View.GONE
                        button11.visibility=View.GONE
                        button12.visibility=View.GONE
                        button13.visibility=View.GONE
                        button14.visibility=View.GONE
                        button15.visibility=View.GONE
                        button16.visibility=View.GONE
                        button17.visibility=View.GONE
                        button18.visibility=View.GONE
                        button19.visibility=View.GONE
                        button20.visibility=View.GONE
                        button21.visibility=View.GONE
                        button22.visibility=View.GONE
                        button23.visibility=View.GONE
                        button24.visibility=View.GONE
                        button25.visibility=View.GONE
                        button26.visibility=View.GONE
                        button27.visibility=View.GONE
                        button28.visibility=View.GONE
                        button29.visibility=View.GONE
                        button30.visibility=View.GONE
                        button31.visibility=View.GONE
                    }
                    "F2" -> {
                        image.setImageResource(R.drawable.fun2)
                        button1.visibility=View.GONE
                        button5.visibility=View.GONE
                        button.visibility=View.VISIBLE
                        button9.visibility=View.GONE
                        button10.visibility=View.GONE
                        button11.visibility=View.GONE
                        button12.visibility=View.GONE
                        button13.visibility=View.GONE
                        button14.visibility=View.GONE
                        button15.visibility=View.GONE
                        button16.visibility=View.GONE
                        button17.visibility=View.GONE
                        button18.visibility=View.GONE
                        button19.visibility=View.GONE
                        button20.visibility=View.GONE
                        button21.visibility=View.GONE
                        button22.visibility=View.GONE
                        button23.visibility=View.GONE
                        button24.visibility=View.GONE
                        button25.visibility=View.GONE
                        button26.visibility=View.GONE
                        button27.visibility=View.GONE
                        button28.visibility=View.GONE
                        button29.visibility=View.GONE
                        button30.visibility=View.GONE
                        button31.visibility=View.GONE
                    }
                    "F3" -> {
                        image.setImageResource(R.drawable.fun3)
                        button1.visibility=View.GONE
                        button5.visibility=View.GONE
                        button.visibility=View.GONE
                        button9.visibility=View.VISIBLE
                        button10.visibility=View.VISIBLE
                        button11.visibility=View.VISIBLE
                        button12.visibility=View.VISIBLE
                        button13.visibility=View.VISIBLE
                        button14.visibility=View.VISIBLE
                        button15.visibility=View.VISIBLE
                        button16.visibility=View.VISIBLE
                        button17.visibility=View.GONE
                        button18.visibility=View.GONE
                        button19.visibility=View.GONE
                        button20.visibility=View.GONE
                        button21.visibility=View.GONE
                        button22.visibility=View.GONE
                        button23.visibility=View.GONE
                        button24.visibility=View.GONE
                        button25.visibility=View.GONE
                        button26.visibility=View.GONE
                        button27.visibility=View.GONE
                        button28.visibility=View.GONE
                        button29.visibility=View.GONE
                        button30.visibility=View.GONE
                        button31.visibility=View.GONE
                    }
                    "F4" -> {
                        image.setImageResource(R.drawable.fun4)
                        button1.visibility=View.GONE
                        button5.visibility=View.GONE
                        button.visibility=View.GONE
                        button9.visibility=View.GONE
                        button10.visibility=View.GONE
                        button11.visibility=View.GONE
                        button12.visibility=View.GONE
                        button13.visibility=View.GONE
                        button14.visibility=View.GONE
                        button15.visibility=View.GONE
                        button16.visibility=View.GONE
                        button17.visibility=View.VISIBLE
                        button18.visibility=View.VISIBLE
                        button19.visibility=View.VISIBLE
                        button20.visibility=View.VISIBLE
                        button21.visibility=View.VISIBLE
                        button22.visibility=View.VISIBLE
                        button23.visibility=View.VISIBLE
                        button24.visibility=View.VISIBLE
                        button25.visibility=View.GONE
                        button26.visibility=View.GONE
                        button27.visibility=View.GONE
                        button28.visibility=View.GONE
                        button29.visibility=View.GONE
                        button30.visibility=View.GONE
                        button31.visibility=View.GONE
                    }
                    "F5"-> {
                        image.setImageResource(R.drawable.fun5)
                        button1.visibility=View.GONE
                        button5.visibility=View.GONE
                        button.visibility=View.GONE
                        button9.visibility=View.GONE
                        button10.visibility=View.GONE
                        button11.visibility=View.GONE
                        button12.visibility=View.GONE
                        button13.visibility=View.GONE
                        button14.visibility=View.GONE
                        button15.visibility=View.GONE
                        button16.visibility=View.GONE
                        button17.visibility=View.GONE
                        button18.visibility=View.GONE
                        button19.visibility=View.GONE
                        button20.visibility=View.GONE
                        button21.visibility=View.GONE
                        button22.visibility=View.GONE
                        button23.visibility=View.GONE
                        button24.visibility=View.GONE
                        button25.visibility=View.VISIBLE
                        button26.visibility=View.VISIBLE
                        button27.visibility=View.VISIBLE
                        button28.visibility=View.VISIBLE
                        button29.visibility=View.VISIBLE
                        button30.visibility=View.VISIBLE
                        button31.visibility=View.VISIBLE
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