package com.example.lets_katikomi

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
<<<<<<< Updated upstream

class MainActivity : AppCompatActivity() {
=======
import android.view.View
import android.widget.AdapterView
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import com.google.firebase.firestore.FirebaseFirestore
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_setting.*


class MainActivity : AppCompatActivity() {

    val db = FirebaseFirestore.getInstance()

>>>>>>> Stashed changes
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
<<<<<<< Updated upstream
=======

    fun onButtonTappedMD(view: View?) {
        val intent = Intent(this, detail::class.java)
        startActivity(intent)
    }

    fun onButtonTappedMS(view: View?) {
        val intent = Intent(this, setting::class.java)
        startActivity(intent)
    }

    fun onClickEnter(view: View) {

        // 名前が空欄じゃないとき
        if (name.text.toString().equals("") == false) {

            // nameで名前管理
            val name = name.text.toString()

            // サーバーに送る用のデータ作る
            val user = hashMapOf(
                "user" to name
            )

            db.collection("users").document(name)
                .set(user)
                .addOnSuccessListener { Toast.makeText(applicationContext, "入室しました", Toast.LENGTH_SHORT).show() }
                .addOnFailureListener { Toast.makeText(applicationContext, "入室に失敗しました", Toast.LENGTH_SHORT).show() }
        }
        // 名前が空欄のとき
        else {
            Toast.makeText(applicationContext, "設定から名前を入力してください", Toast.LENGTH_SHORT).show()
        }
    }

    fun onClickLeave(view: View) {

        if (name.text.toString().equals("") == false) {

            val name = name.text.toString()

            db.collection("users").document(name)
                .delete()
                .addOnSuccessListener { Toast.makeText(applicationContext, "退室しました", Toast.LENGTH_SHORT).show() }
                .addOnFailureListener { Toast.makeText(applicationContext, "退室に失敗しました", Toast.LENGTH_SHORT).show() }
        }
        else {
            Toast.makeText(applicationContext, "設定から名前を入力してください", Toast.LENGTH_SHORT).show()
        }
    }


>>>>>>> Stashed changes
}