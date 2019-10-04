package com.bluapp.kotlinview.imageView

import android.graphics.drawable.BitmapDrawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import com.bluapp.kotlinview.R
import android.graphics.BitmapFactory
import android.graphics.Bitmap
import android.os.AsyncTask
import java.io.ByteArrayOutputStream



class ImageViewActivity6 : AppCompatActivity() {
    var imageView: ImageView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_image_view6)
        imageView = findViewById<ImageView>(R.id.imageView)
        ImageCompresser().execute(R.drawable.profilepic);

    }

    private inner class ImageCompresser : AsyncTask<Int, String, Bitmap>() {
        override fun doInBackground(vararg data: Int?): Bitmap? {
            var compressedBitmap: Bitmap? = null
            try {
                val drawable = getDrawable(data[0]!!)
                val bmp = (drawable as BitmapDrawable).bitmap
                val bos = ByteArrayOutputStream()
                bmp.compress(Bitmap.CompressFormat.PNG, 50, bos)
                val byteArray = bos.toByteArray()
                compressedBitmap = BitmapFactory.decodeByteArray(byteArray, 0, byteArray.size)
            } catch (e: Exception) {
                e.printStackTrace()
            }

            return compressedBitmap
        }
        override fun onPostExecute(bitmap: Bitmap) {
            super.onPostExecute(bitmap)
            imageView?.setImageBitmap(bitmap)
        }
    }
}
