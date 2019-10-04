package com.bluapp.kotlinview.Button

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.content.Intent
import android.graphics.drawable.Drawable
import android.view.MenuInflater
import android.view.Menu
import android.view.MenuItem
import androidx.appcompat.widget.AppCompatButton
import androidx.core.content.ContextCompat
import com.bluapp.kotlinview.R


class ButtonActivity1 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_button1)
        val iconTextButton = findViewById<AppCompatButton>(R.id.iconTextBtn) as AppCompatButton
        iconTextButton.text = "YourText"
        val drawable = ContextCompat.getDrawable(this@ButtonActivity1, R.drawable.ic_video)
        iconTextButton.setCompoundDrawablesWithIntrinsicBounds(drawable, null, null, null)
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        val inflater = menuInflater
        inflater.inflate(R.menu.button_option, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        super.onOptionsItemSelected(item)
        when (item.getItemId()) {
            R.id.action_activityButton2 -> {
                startActivity(Intent(this@ButtonActivity1, ButtonActivity2::class.java))
                return true
            }
            R.id.action_activityButton3 -> {
                startActivity(Intent(this@ButtonActivity1, ButtonActivity3::class.java))
                return true
            }
            R.id.action_activityButton4 -> {
                startActivity(Intent(this@ButtonActivity1, ButtonActivity4::class.java))
                return true
            }
            R.id.action_activityButton5 -> {
                startActivity(Intent(this@ButtonActivity1, ButtonActivity5::class.java))
                return true
            }
            R.id.action_activityButton6 -> {
                startActivity(Intent(this@ButtonActivity1, ButtonActivity6::class.java))
                return true
            }
            R.id.action_activityButton7 -> {
                startActivity(Intent(this@ButtonActivity1, ButtonActivity7::class.java))
                return true
            }
            R.id.action_activityButton8 -> {
                startActivity(Intent(this@ButtonActivity1, ButtonActivity8::class.java))
                return true
            }
            R.id.action_activityButton9 -> {
                startActivity(Intent(this@ButtonActivity1, ButtonActivity9::class.java))
                return true
            }
            R.id.action_activityButton10 -> {
                startActivity(Intent(this@ButtonActivity1, ButtonActivity10::class.java))
                return true
            }
            R.id.action_activityButton11 -> {
                startActivity(Intent(this@ButtonActivity1, ButtonActivity11::class.java))
                return true
            }
            R.id.action_activityButton12 -> {
                startActivity(Intent(this@ButtonActivity1, ButtonActivity12::class.java))
                return true
            }
            R.id.action_activityButton13 -> {
                startActivity(Intent(this@ButtonActivity1, ButtonActivity13::class.java))
                return true
            }
            R.id.action_activityButton14 -> {
                startActivity(Intent(this@ButtonActivity1, ButtonActivity14::class.java))
                return true
            }
            R.id.action_activityButton15 -> {
                startActivity(Intent(this@ButtonActivity1, ButtonActivity15::class.java))
                return true
            }
            R.id.action_activityButton16 -> {
                startActivity(Intent(this@ButtonActivity1, ButtonActivity16::class.java))
                return true
            }
            R.id.action_activityButton17 -> {
                startActivity(Intent(this@ButtonActivity1, ButtonActivity17::class.java))
                return true
            }
            R.id.action_activityButton18 -> {
                startActivity(Intent(this@ButtonActivity1, ButtonActivity18::class.java))
                return true
            }
            R.id.action_activityButton19 -> {
                startActivity(Intent(this@ButtonActivity1, ButtonActivity19::class.java))
                return true
            }
            R.id.action_activityButton20 -> {
                startActivity(Intent(this@ButtonActivity1, ButtonActivity20::class.java))
                return true
            }
            R.id.action_activityButton21 -> {
                startActivity(Intent(this@ButtonActivity1, ButtonActivity21::class.java))
                return true
            }
        }

        return true
    }


}
