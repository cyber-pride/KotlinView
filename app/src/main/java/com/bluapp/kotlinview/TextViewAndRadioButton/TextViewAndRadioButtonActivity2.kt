package com.bluapp.kotlinview.TextViewAndRadioButton

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Gravity
import android.view.ViewGroup
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.constraintlayout.widget.ConstraintSet
import com.bluapp.kotlinview.R

class TextViewAndRadioButtonActivity2 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_text_view_and_radio_button2)
        val constraintLayout = findViewById(R.id.constraintLayout) as ConstraintLayout
        val conParam = ConstraintLayout.LayoutParams(
            ViewGroup.LayoutParams.MATCH_PARENT,
            ViewGroup.LayoutParams.WRAP_CONTENT
        )
        conParam.topToTop = ConstraintSet.PARENT_ID
        conParam.bottomToBottom = ConstraintSet.PARENT_ID
        conParam.startToStart = ConstraintSet.PARENT_ID
        conParam.endToEnd = ConstraintSet.PARENT_ID
        val textview = TextView(this)
        textview.text = "Hello World"
        textview.setTextColor(Color.WHITE)
        textview.setBackgroundColor(resources.getColor(R.color.colorAccent))
        textview.setPadding(25, 25, 25, 25)
        constraintLayout.addView(textview, conParam)
    }
}
