package com.bluapp.kotlinview.EditText

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.view.Menu
import android.view.MenuItem
import android.widget.EditText
import com.bluapp.kotlinview.R

class EditTextActivity1 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_edit_text1)
        val edtField = findViewById<EditText>(R.id.edtField) as EditText
        edtField.text = Editable.Factory.getInstance().newEditable("Inducesmile")
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        val inflater = menuInflater
        inflater.inflate(R.menu.edittext_option, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        super.onOptionsItemSelected(item)
        when (item.getItemId()) {
            R.id.action_activityedittext2 -> {
                startActivity(Intent(this@EditTextActivity1, EditTextActivity2::class.java))
                return true
            }
            R.id.action_activityedittext3 -> {
                startActivity(Intent(this@EditTextActivity1, EditTextActivity3::class.java))
                return true
            }
            R.id.action_activityedittext4 -> {
                startActivity(Intent(this@EditTextActivity1, EditTextActivity4::class.java))
                return true
            }
            R.id.action_activityedittext5 -> {
                startActivity(Intent(this@EditTextActivity1, EditTextActivity5::class.java))
                return true
            }
            R.id.action_activityedittext6 -> {
                startActivity(Intent(this@EditTextActivity1, EditTextActivity6::class.java))
                return true
            }
            R.id.action_activityedittext7 -> {
                startActivity(Intent(this@EditTextActivity1, EditTextActivity7::class.java))
                return true
            }
            R.id.action_activityedittext8 -> {
                startActivity(Intent(this@EditTextActivity1, EditTextActivity8::class.java))
                return true
            }
            R.id.action_activityedittext9 -> {
                startActivity(Intent(this@EditTextActivity1, EditTextActivity9::class.java))
                return true
            }
            R.id.action_activityedittext10 -> {
                startActivity(Intent(this@EditTextActivity1, EditTextActivity10::class.java))
                return true
            }
            R.id.action_activityedittext11 -> {
                startActivity(Intent(this@EditTextActivity1, EditTextActivity11::class.java))
                return true
            }
            R.id.action_activityedittext12 -> {
                startActivity(Intent(this@EditTextActivity1, EditTextActivity12::class.java))
                return true
            }
            R.id.action_activityedittext13 -> {
                startActivity(Intent(this@EditTextActivity1, EditTextActivity13::class.java))
                return true
            }
            R.id.action_activityedittext14 -> {
                startActivity(Intent(this@EditTextActivity1, EditTextActivity14::class.java))
                return true
            }
            R.id.action_activityedittext15 -> {
                startActivity(Intent(this@EditTextActivity1, EditTextActivity15::class.java))
                return true
            }
            R.id.action_activityedittext16 -> {
                startActivity(Intent(this@EditTextActivity1, EditTextActivity16::class.java))
                return true
            }
            R.id.action_activityedittext17 -> {
                startActivity(Intent(this@EditTextActivity1, EditTextActivity17::class.java))
                return true
            }
            R.id.action_activityedittext18 -> {
                startActivity(Intent(this@EditTextActivity1, EditTextActivity18::class.java))
                return true
            }
            R.id.action_activityedittext19 -> {
                startActivity(Intent(this@EditTextActivity1, EditTextActivity19::class.java))
                return true
            }
            R.id.action_activityedittext20 -> {
                startActivity(Intent(this@EditTextActivity1, EditTextActivity20::class.java))
                return true
            }
        }

        return true
    }
}
