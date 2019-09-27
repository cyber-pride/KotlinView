package com.bluapp.kotlinview.Button

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.RelativeLayout
import android.view.ViewGroup
import android.widget.Button
import androidx.appcompat.widget.AppCompatButton
import androidx.core.content.ContextCompat
import com.bluapp.kotlinview.R


class ButtonActivity17 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_button17)
        val relativeLayout = findViewById(R.id.relativeLayout) as RelativeLayout
        val relParam = RelativeLayout.LayoutParams(
            ViewGroup.LayoutParams.MATCH_PARENT,
            ViewGroup.LayoutParams.WRAP_CONTENT
        )
        relParam.addRule(RelativeLayout.CENTER_IN_PARENT)
        relParam.setMargins(10, 10, 10, 10)
        val btn = AppCompatButton(this)
        btn.setBackgroundColor(ContextCompat.getColor(this@ButtonActivity17, R.color.colorAccent))
        btn.setText("Button")
        btn.setTextColor(ContextCompat.getColor(this@ButtonActivity17, R.color.white))
        relativeLayout.addView(btn, relParam)

    }
}
