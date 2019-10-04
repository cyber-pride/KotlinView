package com.bluapp.kotlinview.imageView

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import com.bluapp.kotlinview.R

class ImageViewActivity12 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_image_view12)
        val imagePreview = findViewById<ImageView>(R.id.imagePreview) as ImageView
        val rotateImage = findViewById<Button>(R.id.rotate_image) as Button
        rotateImage.setOnClickListener {
            imagePreview.rotation =45.0f
        }
    }
}
