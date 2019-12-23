package com.bluapp.kotlinview

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.bluapp.kotlinview.Button.ButtonActivity1
import com.bluapp.kotlinview.CheckBox.CheckBoxActivity1
import com.bluapp.kotlinview.EditText.EditTextActivity1
import com.bluapp.kotlinview.Tab.TabActivity1
import com.bluapp.kotlinview.recyclerView.RecyclerViewActivity1
import com.bluapp.kotlinview.spinner.SpinnerActivity1
import com.bluapp.kotlinview.TextViewAndRadioButton.TextViewAndRadioButtonActivity1
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
        }else if(view.id == R.id.textviewandradiobutton){
            startActivity(Intent(this@ViewActivity, TextViewAndRadioButtonActivity1::class.java))
        }else if(view.id == R.id.checkbox){
            startActivity(Intent(this@ViewActivity, CheckBoxActivity1::class.java))
        }else if(view.id == R.id.spinner){
            startActivity(Intent(this@ViewActivity, SpinnerActivity1::class.java))
        }else if(view.id == R.id.recyclerview){
            startActivity(Intent(this@ViewActivity, RecyclerViewActivity1::class.java))
        }else if(view.id == R.id.tab){
            startActivity(Intent(this@ViewActivity, TabActivity1::class.java))
        }
    }

}
