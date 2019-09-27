package com.bluapp.kotlinview.Button

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.bluapp.kotlinview.R



class ButtonActivity10 : AppCompatActivity() {
    private var k = 0


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_button10)
    }

    override fun onBackPressed() {
        k++;
        if(k == 1) {
            Toast.makeText(this@ButtonActivity10,"Click one more time to exist app", Toast.LENGTH_SHORT).show()
        } else {
            super.onBackPressed();
        }

    }
}
