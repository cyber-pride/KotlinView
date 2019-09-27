package com.bluapp.kotlinview.Button

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.widget.AppCompatButton
import com.bluapp.kotlinview.R
import android.content.Intent



class ButtonActivity20 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_button20)
        val refreshBtn = findViewById<AppCompatButton>(R.id.refreshBtn)
        refreshBtn.setOnClickListener {
            val refreshActivity = intent
            finish()
            startActivity(refreshActivity)
        }
    }
}
