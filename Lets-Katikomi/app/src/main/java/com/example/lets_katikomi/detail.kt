package com.example.lets_katikomi

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.ArrayAdapter
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_detail.*

class detail : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        // Adapterに渡す配列を作成します
        val data = arrayOf("共同研究室", "583", "584", "585","593","594","595")
        // adapterを作成します
        val adapter = ArrayAdapter(
                this,
                android.R.layout.simple_list_item_1,
                data
        )
        // adapterをlistViewに紐付けます。
        listView.adapter = adapter
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