package com.bluapp.kotlinview.TextViewAndRadioButton

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Gravity
import android.view.Menu
import android.view.MenuItem
import android.view.ViewGroup
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.constraintlayout.widget.ConstraintSet
import com.bluapp.kotlinview.R

class TextViewAndRadioButtonActivity1 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_text_view_and_radio_button1)
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
        textview.gravity = Gravity.CENTER
        constraintLayout.addView(textview, conParam)
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        val inflater = menuInflater
        inflater.inflate(R.menu.textviewandradiobutton_option, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        super.onOptionsItemSelected(item)
        when (item.getItemId()) {
            R.id.action_activityTextViewAndRadioButton2 -> {
                startActivity(Intent(this@TextViewAndRadioButtonActivity1, TextViewAndRadioButtonActivity2::class.java))
                return true
            }
            R.id.action_activityTextViewAndRadioButton3 -> {
                startActivity(Intent(this@TextViewAndRadioButtonActivity1, TextViewAndRadioButtonActivity3::class.java))
                return true
            }
            R.id.action_activityTextViewAndRadioButton4 -> {
                startActivity(Intent(this@TextViewAndRadioButtonActivity1, TextViewAndRadioButtonActivity4::class.java))
                return true
            }
            R.id.action_activityTextViewAndRadioButton5 -> {
                startActivity(Intent(this@TextViewAndRadioButtonActivity1, TextViewAndRadioButtonActivity5::class.java))
                return true
            }
            R.id.action_activityTextViewAndRadioButton6 -> {
                startActivity(Intent(this@TextViewAndRadioButtonActivity1, TextViewAndRadioButtonActivity6::class.java))
                return true
            }
            R.id.action_activityTextViewAndRadioButton7 -> {
                startActivity(Intent(this@TextViewAndRadioButtonActivity1, TextViewAndRadioButtonActivity7::class.java))
                return true
            }
            R.id.action_activityTextViewAndRadioButton8 -> {
                startActivity(Intent(this@TextViewAndRadioButtonActivity1, TextViewAndRadioButtonActivity8::class.java))
                return true
            }
            R.id.action_activityTextViewAndRadioButton9 -> {
                startActivity(Intent(this@TextViewAndRadioButtonActivity1, TextViewAndRadioButtonActivity9::class.java))
                return true
            }
            R.id.action_activityTextViewAndRadioButton10 -> {
                startActivity(Intent(this@TextViewAndRadioButtonActivity1, TextViewAndRadioButtonActivity10::class.java))
                return true
            }
            R.id.action_activityTextViewAndRadioButton11 -> {
                startActivity(Intent(this@TextViewAndRadioButtonActivity1, TextViewAndRadioButtonActivity11::class.java))
                return true
            }
            R.id.action_activityTextViewAndRadioButton12 -> {
                startActivity(Intent(this@TextViewAndRadioButtonActivity1, TextViewAndRadioButtonActivity12::class.java))
                return true
            }
            R.id.action_activityTextViewAndRadioButton13 -> {
                startActivity(Intent(this@TextViewAndRadioButtonActivity1, TextViewAndRadioButtonActivity13::class.java))
                return true
            }
            R.id.action_activityTextViewAndRadioButton14 -> {
                startActivity(Intent(this@TextViewAndRadioButtonActivity1, TextViewAndRadioButtonActivity14::class.java))
                return true
            }
            R.id.action_activityTextViewAndRadioButton15 -> {
                startActivity(Intent(this@TextViewAndRadioButtonActivity1, TextViewAndRadioButtonActivity15::class.java))
                return true
            }
            R.id.action_activityTextViewAndRadioButton16 -> {
                startActivity(Intent(this@TextViewAndRadioButtonActivity1, TextViewAndRadioButtonActivity16::class.java))
                return true
            }
            R.id.action_activityTextViewAndRadioButton17 -> {
                startActivity(Intent(this@TextViewAndRadioButtonActivity1, TextViewAndRadioButtonActivity17::class.java))
                return true
            }
            R.id.action_activityTextViewAndRadioButton18 -> {
                startActivity(Intent(this@TextViewAndRadioButtonActivity1, TextViewAndRadioButtonActivity18::class.java))
                return true
            }
            R.id.action_activityTextViewAndRadioButton19 -> {
                startActivity(Intent(this@TextViewAndRadioButtonActivity1, TextViewAndRadioButtonActivity19::class.java))
                return true
            }
            R.id.action_activityTextViewAndRadioButton20 -> {
                startActivity(Intent(this@TextViewAndRadioButtonActivity1, TextViewAndRadioButtonActivity20::class.java))
                return true
            }
        }

        return true
    }
}
