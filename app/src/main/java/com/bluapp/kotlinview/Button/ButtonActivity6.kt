package com.bluapp.kotlinview.Button

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.widget.AppCompatButton
import com.bluapp.kotlinview.R
import android.widget.RelativeLayout
import android.view.ViewGroup



class ButtonActivity6 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_button6)
        val centerBtn = findViewById<AppCompatButton>(R.id.centerBtn);
        val centerRel = RelativeLayout.LayoutParams(
            ViewGroup.LayoutParams.MATCH_PARENT,
            ViewGroup.LayoutParams.WRAP_CONTENT
        )
        centerRel.setMargins(10, 10, 10, 10)
        centerRel.addRule(RelativeLayout.CENTER_IN_PARENT)
        centerBtn.setLayoutParams(centerRel)

    }
}
