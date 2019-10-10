package com.bluapp.kotlinview

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.bluapp.kotlinview.Button.ButtonActivity1
import com.bluapp.kotlinview.EditText.EditTextActivity1
import com.bluapp.kotlinview.imageView.ImageViewActivity1

class ViewActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_view)
    }

    fun ViewClick(view: View){
        if(view.id == R.id.button){
            startActivity(Intent(this@ViewActivity, ButtonActivity1::class.java))
        }else if(view.id == R.id.imageview){
            startActivity(Intent(this@ViewActivity, ImageViewActivity1::class.java))
        }else if(view.id == R.id.edittext){
            startActivity(Intent(this@ViewActivity, EditTextActivity1::class.java))
        }
    }

}
