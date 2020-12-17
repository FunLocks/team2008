package com.example.lets_katikomi

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.ArrayAdapter
import androidx.appcompat.app.AppCompatActivity
import com.google.firebase.firestore.FirebaseFirestore
import kotlinx.android.synthetic.main.activity_detail.*
import kotlinx.android.synthetic.main.activity_main.*

class detail : AppCompatActivity() {

    val db = FirebaseFirestore.getInstance()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        /*--------------------------------------------------------------*/
        val pref = getSharedPreferences("user_name", Context.MODE_PRIVATE)
        val storedRoom = pref.getString("room", "未登録")
        /*--------------------------------------------------------------*/

        var data = arrayOf<String>()
        var cnt = 0

        db.collection(storedRoom.toString())
                .get()
                .addOnSuccessListener { result ->
                    for (document in result) {
                        data += document.id
                        cnt += 1
                    }

                    val adapter = ArrayAdapter(
                            this,
                            android.R.layout.simple_list_item_1,
                            data
                    )

                    listView.adapter = adapter
                    count.text = storedRoom + "には" + cnt.toString() + "人います"
                }

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