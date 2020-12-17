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
        val dining = findViewById<Button>(R.id.dining)
        val atelier = findViewById<Button>(R.id.atelier)
        val shop = findViewById<Button>(R.id.shop)
        val gym = findViewById<Button>(R.id.gym)
        val largeLectureRoom = findViewById<Button>(R.id.largeLectureRoom)
        val library = findViewById<Button>(R.id.library)
        val com365 = findViewById<Button>(R.id.com365)
        val com364 = findViewById<Button>(R.id.com364)
        val com363 = findViewById<Button>(R.id.com363)
        val c_d495 = findViewById<Button>(R.id.c_d495)
        val c_d494 = findViewById<Button>(R.id.c_d494)
        val r493 = findViewById<Button>(R.id.r493)
        val r485 = findViewById<Button>(R.id.r485)
        val r484 = findViewById<Button>(R.id.r484)
        val com483 = findViewById<Button>(R.id.com483)
        val secretariat = findViewById<Button>(R.id.secretariat)
        val auditorium = findViewById<Button>(R.id.auditorium)
        val labo = findViewById<Button>(R.id.labo)
        val r595 = findViewById<Button>(R.id.r595)
        val r594 = findViewById<Button>(R.id.r594)
        val r593 = findViewById<Button>(R.id.r593)
        val r585 = findViewById<Button>(R.id.r585)
        val r584 = findViewById<Button>(R.id.r584)
        val r583 = findViewById<Button>(R.id.r583)
        /*--------------------------------------------------------------------*/
        val pref = getSharedPreferences("user_name", Context.MODE_PRIVATE)
        val storedText = pref.getString("key", "未登録")
        username.setText(storedText)
        val storedRoom = pref.getString("room", "未登録")
        selectedRoom.setText(storedRoom)
        /*---------------------------------------------------------------------*/

        spinner.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {

            override fun onItemSelected(
                parent: AdapterView<*>?,
                view: View?,
                position: Int,
                id: Long
            ) {
                val floor = parent?.selectedItem as String

                when(floor) {
                    "F1" -> {
                        image.setImageResource(R.drawable.fun1)
                        dining.visibility=View.VISIBLE
                        atelier.visibility=View.VISIBLE
                        shop.visibility=View.GONE
                        gym.visibility=View.GONE
                        largeLectureRoom.visibility=View.GONE
                        library.visibility=View.GONE
                        com365.visibility=View.GONE
                        com364.visibility=View.GONE
                        com363.visibility=View.GONE
                        c_d495.visibility=View.GONE
                        c_d494.visibility=View.GONE
                        r493.visibility=View.GONE
                        r485.visibility=View.GONE
                        r484.visibility=View.GONE
                        com483.visibility=View.GONE
                        secretariat.visibility=View.GONE
                        auditorium.visibility=View.GONE
                        labo.visibility=View.GONE
                        r595.visibility=View.GONE
                        r594.visibility=View.GONE
                        r593.visibility=View.GONE
                        r585.visibility=View.GONE
                        r584.visibility=View.GONE
                        r583.visibility=View.GONE
                    }
                    "F2" -> {
                        image.setImageResource(R.drawable.fun2)
                        dining.visibility=View.GONE
                        atelier.visibility=View.GONE
                        shop.visibility=View.VISIBLE
                        gym.visibility=View.GONE
                        largeLectureRoom.visibility=View.GONE
                        library.visibility=View.GONE
                        com365.visibility=View.GONE
                        com364.visibility=View.GONE
                        com363.visibility=View.GONE
                        c_d495.visibility=View.GONE
                        c_d494.visibility=View.GONE
                        r493.visibility=View.GONE
                        r485.visibility=View.GONE
                        r484.visibility=View.GONE
                        com483.visibility=View.GONE
                        secretariat.visibility=View.GONE
                        auditorium.visibility=View.GONE
                        labo.visibility=View.GONE
                        r595.visibility=View.GONE
                        r594.visibility=View.GONE
                        r593.visibility=View.GONE
                        r585.visibility=View.GONE
                        r584.visibility=View.GONE
                        r583.visibility=View.GONE
                    }
                    "F3" -> {
                        image.setImageResource(R.drawable.fun3)
                        dining.visibility=View.GONE
                        atelier.visibility=View.GONE
                        shop.visibility=View.GONE
                        gym.visibility=View.VISIBLE
                        largeLectureRoom.visibility=View.VISIBLE
                        library.visibility=View.VISIBLE
                        com365.visibility=View.VISIBLE
                        com364.visibility=View.VISIBLE
                        com363.visibility=View.VISIBLE
                        c_d495.visibility=View.GONE
                        c_d494.visibility=View.GONE
                        r493.visibility=View.GONE
                        r485.visibility=View.GONE
                        r484.visibility=View.GONE
                        com483.visibility=View.GONE
                        secretariat.visibility=View.GONE
                        auditorium.visibility=View.GONE
                        labo.visibility=View.GONE
                        r595.visibility=View.GONE
                        r594.visibility=View.GONE
                        r593.visibility=View.GONE
                        r585.visibility=View.GONE
                        r584.visibility=View.GONE
                        r583.visibility=View.GONE
                    }
                    "F4" -> {
                        image.setImageResource(R.drawable.fun4)
                        dining.visibility=View.GONE
                        atelier.visibility=View.GONE
                        shop.visibility=View.GONE
                        gym.visibility=View.GONE
                        largeLectureRoom.visibility=View.GONE
                        library.visibility=View.GONE
                        com365.visibility=View.GONE
                        com364.visibility=View.GONE
                        com363.visibility=View.GONE
                        c_d495.visibility=View.VISIBLE
                        c_d494.visibility=View.VISIBLE
                        r493.visibility=View.VISIBLE
                        r485.visibility=View.VISIBLE
                        r484.visibility=View.VISIBLE
                        com483.visibility=View.VISIBLE
                        secretariat.visibility=View.VISIBLE
                        auditorium.visibility=View.VISIBLE
                        labo.visibility=View.GONE
                        r595.visibility=View.GONE
                        r594.visibility=View.GONE
                        r593.visibility=View.GONE
                        r585.visibility=View.GONE
                        r584.visibility=View.GONE
                        r583.visibility=View.GONE
                    }
                    "F5"-> {
                        image.setImageResource(R.drawable.fun5)
                        dining.visibility=View.GONE
                        atelier.visibility=View.GONE
                        shop.visibility=View.GONE
                        gym.visibility=View.GONE
                        largeLectureRoom.visibility=View.GONE
                        library.visibility=View.GONE
                        com365.visibility=View.GONE
                        com364.visibility=View.GONE
                        com363.visibility=View.GONE
                        c_d495.visibility=View.GONE
                        c_d494.visibility=View.GONE
                        r493.visibility=View.GONE
                        r485.visibility=View.GONE
                        r484.visibility=View.GONE
                        com483.visibility=View.GONE
                        secretariat.visibility=View.GONE
                        auditorium.visibility=View.GONE
                        labo.visibility=View.VISIBLE
                        r595.visibility=View.VISIBLE
                        r594.visibility=View.VISIBLE
                        r593.visibility=View.VISIBLE
                        r585.visibility=View.VISIBLE
                        r584.visibility=View.VISIBLE
                        r583.visibility=View.VISIBLE
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

        if (!storedText.equals("")) {

            val name = storedText.toString()

            if (selectedRoom.text == "選択された部屋") {
                Toast.makeText(applicationContext, "部屋を選択してください", Toast.LENGTH_SHORT).show()
            }
            else {
                val user = hashMapOf(
                        "user" to name
                )

                db.collection(selectedRoom.text.toString()).document(name)
                        .set(user)
                        .addOnSuccessListener { Toast.makeText(applicationContext, "入室しました", Toast.LENGTH_SHORT).show() }
                        .addOnFailureListener { Toast.makeText(applicationContext, "入室に失敗しました", Toast.LENGTH_SHORT).show() }
            }
        }
        else {
            Toast.makeText(applicationContext, "設定から名前を入力してください", Toast.LENGTH_SHORT).show()
        }
    }

    fun onClickLeave(view: View) {

        val pref = getSharedPreferences("user_name", Context.MODE_PRIVATE)
        val storedText = pref.getString("key", "未登録")

        if (!storedText.equals("")) {

            val name = storedText.toString()

            if (selectedRoom.text == "選択された部屋") {
                Toast.makeText(applicationContext, "部屋を選択してください", Toast.LENGTH_SHORT).show()
            }
            else {
                db.collection(selectedRoom.text.toString()).document(name)
                        .delete()
                        .addOnSuccessListener { Toast.makeText(applicationContext, "退室しました", Toast.LENGTH_SHORT).show() }
                        .addOnFailureListener { Toast.makeText(applicationContext, "退室に失敗しました", Toast.LENGTH_SHORT).show() }
            }
        }
        else {
            Toast.makeText(applicationContext, "設定から名前を入力してください", Toast.LENGTH_SHORT).show()
        }
    }

    fun onClickDining(view: View) {
        selectedRoom.text = dining.text
        val pref = getSharedPreferences("user_name", Context.MODE_PRIVATE)
        val inputRoom = selectedRoom.text.toString()
        pref.edit().putString("room", inputRoom).apply()
    }

    fun onClickAtelier(view: View) {
        selectedRoom.text = atelier.text
        val pref = getSharedPreferences("user_name", Context.MODE_PRIVATE)
        val inputRoom = selectedRoom.text.toString()
        pref.edit().putString("room", inputRoom).apply()
    }

    fun onClickShop(view: View) {
        selectedRoom.text = shop.text
        val pref = getSharedPreferences("user_name", Context.MODE_PRIVATE)
        val inputRoom = selectedRoom.text.toString()
        pref.edit().putString("room", inputRoom).apply()
    }

    fun onClickGym(view: View) {
        selectedRoom.text = gym.text
        val pref = getSharedPreferences("user_name", Context.MODE_PRIVATE)
        val inputRoom = selectedRoom.text.toString()
        pref.edit().putString("room", inputRoom).apply()
    }

    fun onClickLargeLectureRoom(view: View) {
        selectedRoom.text = largeLectureRoom.text
        val pref = getSharedPreferences("user_name", Context.MODE_PRIVATE)
        val inputRoom = selectedRoom.text.toString()
        pref.edit().putString("room", inputRoom).apply()
    }

    fun onClickLibrary(view: View) {
        selectedRoom.text = library.text
        val pref = getSharedPreferences("user_name", Context.MODE_PRIVATE)
        val inputRoom = selectedRoom.text.toString()
        pref.edit().putString("room", inputRoom).apply()
    }

    fun onClickCom365(view: View) {
        selectedRoom.text = com365.text
        val pref = getSharedPreferences("user_name", Context.MODE_PRIVATE)
        val inputRoom = selectedRoom.text.toString()
        pref.edit().putString("room", inputRoom).apply()
    }

    fun onClickCom364(view: View) {
        selectedRoom.text = com364.text
        val pref = getSharedPreferences("user_name", Context.MODE_PRIVATE)
        val inputRoom = selectedRoom.text.toString()
        pref.edit().putString("room", inputRoom).apply()
    }

    fun onClickCom363(view: View) {
        selectedRoom.text = com363.text
        val pref = getSharedPreferences("user_name", Context.MODE_PRIVATE)
        val inputRoom = selectedRoom.text.toString()
        pref.edit().putString("room", inputRoom).apply()
    }

    fun onClickC_d495(view: View) {
        selectedRoom.text = c_d495.text
        val pref = getSharedPreferences("user_name", Context.MODE_PRIVATE)
        val inputRoom = selectedRoom.text.toString()
        pref.edit().putString("room", inputRoom).apply()
    }

    fun onClickC_d494(view: View) {
        selectedRoom.text = c_d494.text
        val pref = getSharedPreferences("user_name", Context.MODE_PRIVATE)
        val inputRoom = selectedRoom.text.toString()
        pref.edit().putString("room", inputRoom).apply()
    }

    fun onClickR493(view: View) {
        selectedRoom.text = r493.text
        val pref = getSharedPreferences("user_name", Context.MODE_PRIVATE)
        val inputRoom = selectedRoom.text.toString()
        pref.edit().putString("room", inputRoom).apply()
    }

    fun onClickR485(view: View) {
        selectedRoom.text = r485.text
        val pref = getSharedPreferences("user_name", Context.MODE_PRIVATE)
        val inputRoom = selectedRoom.text.toString()
        pref.edit().putString("room", inputRoom).apply()
    }

    fun onClickR484(view: View) {
        selectedRoom.text = r484.text
        val pref = getSharedPreferences("user_name", Context.MODE_PRIVATE)
        val inputRoom = selectedRoom.text.toString()
        pref.edit().putString("room", inputRoom).apply()
    }

    fun onClickCom483(view: View) {
        selectedRoom.text = com483.text
        val pref = getSharedPreferences("user_name", Context.MODE_PRIVATE)
        val inputRoom = selectedRoom.text.toString()
        pref.edit().putString("room", inputRoom).apply()
    }

    fun onClickSecretariat(view: View) {
        selectedRoom.text = secretariat.text
        val pref = getSharedPreferences("user_name", Context.MODE_PRIVATE)
        val inputRoom = selectedRoom.text.toString()
        pref.edit().putString("room", inputRoom).apply()
    }

    fun onClickAuditorium(view: View) {
        selectedRoom.text = auditorium.text
        val pref = getSharedPreferences("user_name", Context.MODE_PRIVATE)
        val inputRoom = selectedRoom.text.toString()
        pref.edit().putString("room", inputRoom).apply()
    }

    fun onClickLabo(view: View) {
        selectedRoom.text = labo.text
        val pref = getSharedPreferences("user_name", Context.MODE_PRIVATE)
        val inputRoom = selectedRoom.text.toString()
        pref.edit().putString("room", inputRoom).apply()
    }

    fun onClickR595(view: View) {
        selectedRoom.text = r595.text
        val pref = getSharedPreferences("user_name", Context.MODE_PRIVATE)
        val inputRoom = selectedRoom.text.toString()
        pref.edit().putString("room", inputRoom).apply()
    }

    fun onClickR594(view: View) {
        selectedRoom.text = r594.text
        val pref = getSharedPreferences("user_name", Context.MODE_PRIVATE)
        val inputRoom = selectedRoom.text.toString()
        pref.edit().putString("room", inputRoom).apply()
    }

    fun onClickR593(view: View) {
        selectedRoom.text = r593.text
        val pref = getSharedPreferences("user_name", Context.MODE_PRIVATE)
        val inputRoom = selectedRoom.text.toString()
        pref.edit().putString("room", inputRoom).apply()
    }

    fun onClickR585(view: View) {
        selectedRoom.text = r585.text
        val pref = getSharedPreferences("user_name", Context.MODE_PRIVATE)
        val inputRoom = selectedRoom.text.toString()
        pref.edit().putString("room", inputRoom).apply()
    }

    fun onClickR584(view: View) {
        selectedRoom.text = r584.text
        val pref = getSharedPreferences("user_name", Context.MODE_PRIVATE)
        val inputRoom = selectedRoom.text.toString()
        pref.edit().putString("room", inputRoom).apply()
    }

    fun onClickR583(view: View) {
        selectedRoom.text = r583.text
        val pref = getSharedPreferences("user_name", Context.MODE_PRIVATE)
        val inputRoom = selectedRoom.text.toString()
        pref.edit().putString("room", inputRoom).apply()
    }


}