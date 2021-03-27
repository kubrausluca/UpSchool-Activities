package com.example.activitylifecycle

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_a_page.*

class APageActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_a_page)

        goBPageButton.setOnClickListener {
            val intent = Intent(this@APageActivity, BPageActivity::class.java)
            finish()
            startActivity(intent)
        }

    }
}