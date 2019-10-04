package com.bluapp.kotlinview.imageView

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.bluapp.kotlinview.R
import android.graphics.Bitmap
import android.graphics.BitmapFactory
import android.os.AsyncTask
import android.util.Log
import android.view.Menu
import android.view.MenuItem
import android.widget.ImageView


class ImageViewActivity1 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_image_view1)
        ImageLoader(findViewById<ImageView>(R.id.imageView) as ImageView).execute("https://inducesmile.com/wp-content/uploads/2019/01/inducesmilelog.png")
    }


    private inner class ImageLoader(internal var bmImage: ImageView) : AsyncTask<String, Void, Bitmap>() {
        override fun doInBackground(vararg urls: String): Bitmap? {
            val urldisplay = urls[0]
            var mIcon11: Bitmap? = null
            try {
                val `in` = java.net.URL(urldisplay).openStream()
                mIcon11 = BitmapFactory.decodeStream(`in`)
            } catch (e: Exception) {
                Log.e("Error", e.message)
                e.printStackTrace()
            }

            return mIcon11
        }

        override fun onPostExecute(result: Bitmap) {
            bmImage.setImageBitmap(result)
        }
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        val inflater = menuInflater
        inflater.inflate(R.menu.imageview_option, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        super.onOptionsItemSelected(item)
        when (item.getItemId()) {
            R.id.action_activityImageView2 -> {
                startActivity(Intent(this@ImageViewActivity1, ImageViewActivity2::class.java))
                return true
            }
            R.id.action_activityImageView3 -> {
                startActivity(Intent(this@ImageViewActivity1, ImageViewActivity3::class.java))
                return true
            }
            R.id.action_activityImageView4 -> {
                startActivity(Intent(this@ImageViewActivity1, ImageViewActivity4::class.java))
                return true
            }
            R.id.action_activityImageView5 -> {
                startActivity(Intent(this@ImageViewActivity1, ImageViewActivity5::class.java))
                return true
            }
            R.id.action_activityImageView6 -> {
                startActivity(Intent(this@ImageViewActivity1, ImageViewActivity6::class.java))
                return true
            }
            R.id.action_activityImageView7 -> {
                startActivity(Intent(this@ImageViewActivity1, ImageViewActivity7::class.java))
                return true
            }
            R.id.action_activityImageView8 -> {
                startActivity(Intent(this@ImageViewActivity1, ImageViewActivity8::class.java))
                return true
            }
            R.id.action_activityImageView9 -> {
                startActivity(Intent(this@ImageViewActivity1, ImageViewActivity9::class.java))
                return true
            }
            R.id.action_activityImageView10 -> {
                startActivity(Intent(this@ImageViewActivity1, ImageViewActivity10::class.java))
                return true
            }
            R.id.action_activityImageView11 -> {
                startActivity(Intent(this@ImageViewActivity1, ImageViewActivity11::class.java))
                return true
            }
            R.id.action_activityImageView12 -> {
                startActivity(Intent(this@ImageViewActivity1, ImageViewActivity12::class.java))
                return true
            }
            R.id.action_activityImageView13 -> {
                startActivity(Intent(this@ImageViewActivity1, ImageViewActivity13::class.java))
                return true
            }
            R.id.action_activityImageView14 -> {
                startActivity(Intent(this@ImageViewActivity1, ImageViewActivity14::class.java))
                return true
            }
            R.id.action_activityImageView15 -> {
                startActivity(Intent(this@ImageViewActivity1, ImageViewActivity15::class.java))
                return true
            }
            R.id.action_activityImageView16 -> {
                startActivity(Intent(this@ImageViewActivity1, ImageViewActivity16::class.java))
                return true
            }
            R.id.action_activityImageView17 -> {
                startActivity(Intent(this@ImageViewActivity1, ImageViewActivity17::class.java))
                return true
            }
            R.id.action_activityImageView18 -> {
                startActivity(Intent(this@ImageViewActivity1, ImageViewActivity18::class.java))
                return true
            }
            R.id.action_activityImageView19 -> {
                startActivity(Intent(this@ImageViewActivity1, ImageViewActivity19::class.java))
                return true
            }
            R.id.action_activityImageView20 -> {
                startActivity(Intent(this@ImageViewActivity1, ImageViewActivity20::class.java))
                return true
            }
        }

        return true
    }

}
