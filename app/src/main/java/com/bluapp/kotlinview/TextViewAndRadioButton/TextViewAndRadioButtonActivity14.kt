package com.bluapp.kotlinview.TextViewAndRadioButton

import android.content.res.ColorStateList
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.ViewGroup
import android.widget.RadioButton
import android.widget.RadioGroup
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.constraintlayout.widget.ConstraintSet
import com.bluapp.kotlinview.R

class TextViewAndRadioButtonActivity14 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_text_view_and_radio_button14)
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
        val colorstatelist = ColorStateList(
            arrayOf(
                intArrayOf(-android.R.attr.state_enabled),
                intArrayOf(android.R.attr.state_enabled)
            ),
            intArrayOf(Color.BLACK, Color.GREEN)
        )
    val malebutton = RadioButton(this)
        malebutton.text = "Male"
        malebutton.setTextColor(Color.BLACK)
        malebutton.buttonTintList = colorstatelist
        radioGroup.addView(malebutton)
        val femalebutton = RadioButton(this)
        femalebutton.text = "Female"
        femalebutton.setTextColor(Color.BLACK)
        femalebutton.buttonTintList = colorstatelist
        radioGroup.addView(femalebutton)
        constraintLayout.addView(radioGroup, conParam)
    }
}
