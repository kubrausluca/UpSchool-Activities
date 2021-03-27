package com.example.activitylifecycle

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_x_page.*

class XPageActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_x_page)

        goYPageButton2.setOnClickListener {
            val intent = Intent(this@XPageActivity, YPageActivity::class.java)
            startActivity(intent)
        }
    }
}