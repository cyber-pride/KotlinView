package com.bluapp.kotlinview.TextViewAndRadioButton

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.ViewGroup
import android.widget.RadioButton
import android.widget.RadioGroup
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.constraintlayout.widget.ConstraintSet
import com.bluapp.kotlinview.R

class TextViewAndRadioButtonActivity13 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_text_view_and_radio_button13)
        val constraintLayout = findViewById(R.id.constraintLayout) as ConstraintLayout
        val conParam = ConstraintLayout.LayoutParams(
            ViewGroup.LayoutParams.MATCH_PARENT,
            ViewGroup.LayoutParams.WRAP_CONTENT
        )
        conParam.topToTop = ConstraintSet.PARENT_ID
        conParam.bottomToBottom = ConstraintSet.PARENT_ID
        conParam.startToStart = ConstraintSet.PARENT_ID
        conParam.endToEnd = ConstraintSet.PARENT_ID
        val radioGroup = RadioGroup(this)
        radioGroup.orientation = RadioGroup.VERTICAL
        val malebutton = RadioButton(this)
        malebutton.text = "Male"
        malebutton.setTextColor(Color.BLACK)
        radioGroup.addView(malebutton)
        val femalebutton = RadioButton(this)
        femalebutton.text = "Female"
        femalebutton.setTextColor(Color.BLACK)
        radioGroup.addView(femalebutton)
        constraintLayout.addView(radioGroup, conParam)
    }
}
