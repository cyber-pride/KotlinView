package com.bluapp.kotlinview.imageView

import android.graphics.Bitmap
import android.graphics.BitmapFactory
import android.graphics.Canvas
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import com.bluapp.kotlinview.R



class ImageViewActivity8 : AppCompatActivity() {
    var BitmapSize = 40
    var imageView: ImageView?=null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_image_view8)
        imageView = findViewById<ImageView>(R.id.imageView) as ImageView
        imageOnCanvas()

    }

    private fun imageOnCanvas(){
        val bitmapiamge = BitmapFactory.decodeResource(resources, R.drawable.profilepic)
        val width = bitmapiamge.getWidth() + BitmapSize * 2
        val height = bitmapiamge.getHeight() + BitmapSize * 2
        val bitmap = Bitmap.createBitmap(width, height, Bitmap.Config.RGB_565)
        val canvas = Canvas(bitmap)
        canvas.drawColor(Color.GREEN)
        canvas.drawBitmap(bitmapiamge, BitmapSize.toFloat(), BitmapSize.toFloat(), null)
        imageView?.setImageBitmap(bitmap);
    }
}
