package com.example.activitylifecycle

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_y_page.*

class YPageActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_y_page)

        goMainPageButton.setOnClickListener {
            // Anasayfaya donmedik, yeniden açtık -> istenilen bir durum degil
            val intent = Intent(this@YPageActivity, MainActivity::class.java)
            startActivity(intent)
        }

    }
}