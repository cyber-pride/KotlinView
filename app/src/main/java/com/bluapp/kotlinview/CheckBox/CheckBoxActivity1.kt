package com.bluapp.kotlinview.CheckBox

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Gravity
import android.view.Menu
import android.view.MenuItem
import android.view.ViewGroup
import android.widget.CheckBox
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.constraintlayout.widget.ConstraintSet
import com.bluapp.kotlinview.R

class CheckBoxActivity1 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_check_box1)
        val constraintLayout = findViewById(R.id.constraintLayout) as ConstraintLayout
        val conParam = ConstraintLayout.LayoutParams(
            ViewGroup.LayoutParams.WRAP_CONTENT,
            ViewGroup.LayoutParams.WRAP_CONTENT
        )
        conParam.topToTop = ConstraintSet.PARENT_ID
        conParam.bottomToBottom = ConstraintSet.PARENT_ID
        conParam.startToStart = ConstraintSet.PARENT_ID
        conParam.endToEnd = ConstraintSet.PARENT_ID
        val checkbox = CheckBox(this)
        checkbox.text = "CheckBox"
        checkbox.setPadding(14, 0, 0, 0)
        constraintLayout.addView(checkbox, conParam)
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        val inflater = menuInflater
        inflater.inflate(R.menu.checkbox_option, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        super.onOptionsItemSelected(item)
        when (item.getItemId()) {
            R.id.action_activitycheckbox2 -> {
                startActivity(Intent(this@CheckBoxActivity1, CheckBoxActivity2::class.java))
                return true
            }
            R.id.action_activitycheckbox3 -> {
                startActivity(Intent(this@CheckBoxActivity1, CheckBoxActivity3::class.java))
                return true
            }
            R.id.action_activitycheckbox4 -> {
                startActivity(Intent(this@CheckBoxActivity1, CheckBoxActivity4::class.java))
                return true
            }
            R.id.action_activitycheckbox5 -> {
                startActivity(Intent(this@CheckBoxActivity1, CheckBoxActivity5::class.java))
                return true
            }
            R.id.action_activitycheckbox6 -> {
                startActivity(Intent(this@CheckBoxActivity1, CheckBoxActivity6::class.java))
                return true
            }
            R.id.action_activitycheckbox7 -> {
                startActivity(Intent(this@CheckBoxActivity1, CheckBoxActivity7::class.java))
                return true
            }
            R.id.action_activitycheckbox8 -> {
                startActivity(Intent(this@CheckBoxActivity1, CheckBoxActivity8::class.java))
                return true
            }
            R.id.action_activitycheckbox9 -> {
                startActivity(Intent(this@CheckBoxActivity1, CheckBoxActivity9::class.java))
                return true
            }
            R.id.action_activitycheckbox10 -> {
                startActivity(Intent(this@CheckBoxActivity1, CheckBoxActivity10::class.java))
                return true
            }
            R.id.action_activitycheckbox11 -> {
                startActivity(Intent(this@CheckBoxActivity1, CheckBoxActivity11::class.java))
                return true
            }
            R.id.action_activitycheckbox12 -> {
                startActivity(Intent(this@CheckBoxActivity1, CheckBoxActivity12::class.java))
                return true
            }
            R.id.action_activitycheckbox13 -> {
                startActivity(Intent(this@CheckBoxActivity1, CheckBoxActivity13::class.java))
                return true
            }
            R.id.action_activitycheckbox14 -> {
                startActivity(Intent(this@CheckBoxActivity1, CheckBoxActivity14::class.java))
                return true
            }
            R.id.action_activitycheckbox15 -> {
                startActivity(Intent(this@CheckBoxActivity1, CheckBoxActivity15::class.java))
                return true
            }
            R.id.action_activitycheckbox16 -> {
                startActivity(Intent(this@CheckBoxActivity1, CheckBoxActivity16::class.java))
                return true
            }
            R.id.action_activitycheckbox17 -> {
                startActivity(Intent(this@CheckBoxActivity1, CheckBoxActivity17::class.java))
                return true
            }
            R.id.action_activitycheckbox18 -> {
                startActivity(Intent(this@CheckBoxActivity1, CheckBoxActivity18::class.java))
                return true
            }
            R.id.action_activitycheckbox19 -> {
                startActivity(Intent(this@CheckBoxActivity1, CheckBoxActivity19::class.java))
                return true
            }
            R.id.action_activitycheckbox20 -> {
                startActivity(Intent(this@CheckBoxActivity1, CheckBoxActivity20::class.java))
                return true
            }

        }

        return true
    }
}
