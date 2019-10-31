package com.bluapp.kotlinview.spinner

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.ViewGroup
import android.widget.*
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.constraintlayout.widget.ConstraintSet
import com.bluapp.kotlinview.R

class SpinnerActivity9 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_spinner9)
        val constraintLayout = findViewById(R.id.constraintLayout) as ConstraintLayout
        val conParam = ConstraintLayout.LayoutParams(
            ViewGroup.LayoutParams.MATCH_PARENT,
            ViewGroup.LayoutParams.WRAP_CONTENT
        )
        conParam.topToTop = ConstraintSet.PARENT_ID
        conParam.bottomToBottom = ConstraintSet.PARENT_ID
        conParam.startToStart = ConstraintSet.PARENT_ID
        conParam.endToEnd = ConstraintSet.PARENT_ID
        val spinner = Spinner(this)
        val userNames = arrayOf("Henry", "Mark", "Jack", "Smith", "Clark", "Kelvin", "Denzel")
        val arrayadapter = ArrayAdapter(this@SpinnerActivity9, android.R.layout.simple_spinner_item, userNames)
        spinner.adapter = arrayadapter
        val spinnerPosition = arrayadapter.getPosition("Smith")
        spinner.setSelection(spinnerPosition)
        constraintLayout.addView(spinner, conParam)
    }
}
