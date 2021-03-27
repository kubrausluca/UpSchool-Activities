package com.example.activitylifecycle

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        goAPageButton.setOnClickListener{
            // titleTextView.text = "Merhaba"

            // sayfa gecisi yapmak istiyorsak bir Intent nesnesi oluşturmamiz gerekmekte
            val intent = Intent(this@MainActivity, APageActivity::class.java)
            startActivity(intent)

        }

        goXPageButton.setOnClickListener{

            val intent = Intent(this@MainActivity, XPageActivity::class.java)
            startActivity(intent)

        }

    }
}