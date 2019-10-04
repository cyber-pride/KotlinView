package com.bluapp.kotlinview.imageView

import android.graphics.Bitmap
import android.graphics.BitmapFactory
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import com.bluapp.kotlinview.R

class ImageViewActivity4 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_image_view4)
        val imageView = findViewById<ImageView>(R.id.imageView) as ImageView
        imageView.setImageBitmap(resizeIamge(BitmapFactory.decodeResource(resources, R.drawable.profilepic),50,50))
    }


    fun resizeIamge(bitmap: Bitmap, width:Int, height:Int):Bitmap{
        return Bitmap.createScaledBitmap(bitmap, width, height, false)
    }
}
