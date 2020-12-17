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
        val pref = getSharedPreferences("user_name", Context.MODE_PRIVATE)
        //SharedPreferencesオブジェクトの取得、このオブジェクトに対してデータの要求保存
        //第１引数→ファイル名(xmlファイルにデータ保存するので),第２引数→ファイルの共有モード

        val storedText = pref.getString("key", "未登録")
        //データの型に合わせたメソッドでデータを読み取る。
        //第１引数→保存に指定したキー,第２引数→キーがないときの返すデータ

        val editText = findViewById<EditText>(R.id.name)
        editText.setText(storedText)
        //EditTextに読み取ったデータ表示してる

        val save_button = findViewById<Button>(R.id.saveButton)

        save_button.setOnClickListener{
            val inputText = editText.text.toString()
            //EditTextに入力されたデータ

            //プリファレンスに保存
            pref.edit().putString("key", inputText).apply()
            //edit()→編集用のEditerオブジェクトを取得
            //putString()→第１引数→キー名,第２引数→保存するデータ apply()→編集内容を反映
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
