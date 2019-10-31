package com.bluapp.kotlinview.spinner

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.Spinner
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.constraintlayout.widget.ConstraintSet
import com.bluapp.kotlinview.R


class SpinnerActivity1 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_spinner1)
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
        val arrayadapter = ArrayAdapter(this@SpinnerActivity1, android.R.layout.simple_spinner_item, userNames)
        spinner.adapter = arrayadapter
        constraintLayout.addView(spinner, conParam)
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        val inflater = menuInflater
        inflater.inflate(R.menu.spinner_option, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        super.onOptionsItemSelected(item)
        when (item.getItemId()) {
            R.id.action_activityspinner2 -> {
               startActivity(Intent(this@SpinnerActivity1, SpinnerActivity2::class.java))
                return true
            }
            R.id.action_activityspinner3 -> {
                startActivity(Intent(this@SpinnerActivity1, SpinnerActivity3::class.java))
                return true
            }
            R.id.action_activityspinner4 -> {
                startActivity(Intent(this@SpinnerActivity1, SpinnerActivity4::class.java))
                return true
            }
            R.id.action_activityspinner5 -> {
                startActivity(Intent(this@SpinnerActivity1, SpinnerActivity5::class.java))
                return true
            }
            R.id.action_activityspinner6 -> {
                startActivity(Intent(this@SpinnerActivity1, SpinnerActivity6::class.java))
                return true
            }
            R.id.action_activityspinner7 -> {
                startActivity(Intent(this@SpinnerActivity1, SpinnerActivity7::class.java))
                return true
            }
            R.id.action_activityspinner8 -> {
                startActivity(Intent(this@SpinnerActivity1, SpinnerActivity8::class.java))
                return true
            }
            R.id.action_activityspinner9 -> {
                startActivity(Intent(this@SpinnerActivity1, SpinnerActivity9::class.java))
                return true
            }
            R.id.action_activityspinner10 -> {
                startActivity(Intent(this@SpinnerActivity1, SpinnerActivity10::class.java))
                return true
            }
            R.id.action_activityspinner11 -> {
                startActivity(Intent(this@SpinnerActivity1, SpinnerActivity11::class.java))
                return true
            }
            R.id.action_activityspinner12 -> {
                startActivity(Intent(this@SpinnerActivity1, SpinnerActivity12::class.java))
                return true
            }
            R.id.action_activityspinner13 -> {
                startActivity(Intent(this@SpinnerActivity1, SpinnerActivity13::class.java))
                return true
            }
            R.id.action_activityspinner14 -> {
                startActivity(Intent(this@SpinnerActivity1, SpinnerActivity14::class.java))
                return true
            }
            R.id.action_activityspinner15 -> {
                startActivity(Intent(this@SpinnerActivity1, SpinnerActivity15::class.java))
                return true
            }
            R.id.action_activityspinner16 -> {
                startActivity(Intent(this@SpinnerActivity1, SpinnerActivity16::class.java))
                return true
            }
            R.id.action_activityspinner17 -> {
                startActivity(Intent(this@SpinnerActivity1, SpinnerActivity17::class.java))
                return true
            }
            R.id.action_activityspinner18 -> {
                startActivity(Intent(this@SpinnerActivity1, SpinnerActivity18::class.java))
                return true
            }
            R.id.action_activityspinner19 -> {
                startActivity(Intent(this@SpinnerActivity1, SpinnerActivity19::class.java))
                return true
            }
            R.id.action_activityspinner20 -> {
                startActivity(Intent(this@SpinnerActivity1, SpinnerActivity20::class.java))
                return true
            }
        }

        return true
    }
}
