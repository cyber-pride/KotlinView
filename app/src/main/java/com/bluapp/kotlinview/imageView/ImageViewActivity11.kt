package com.bluapp.kotlinview.imageView

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.Toast
import com.bluapp.kotlinview.R

class ImageViewActivity11 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_image_view11)
        val imageView = findViewById<ImageView>(R.id.imageView) as ImageView
        imageView.setOnClickListener {
            Toast.makeText(this@ImageViewActivity11, "ProfilePic Image Click", Toast.LENGTH_SHORT).show()
        }
    }
}
