package com.bluapp.kotlinview.imageView

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView
import com.bluapp.kotlinview.R

class ImageViewActivity16 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_image_view16)
        val imagePreview = findViewById<ImageView>(R.id.imagePreview) as ImageView
        val visibleBtn = findViewById<Button>(R.id.visible) as Button
        val invisibleBtn = findViewById<Button>(R.id.invisible) as Button
        visibleBtn.setOnClickListener { imagePreview.visibility = View.VISIBLE }
        invisibleBtn.setOnClickListener { imagePreview.visibility = View.INVISIBLE }
    }
}
