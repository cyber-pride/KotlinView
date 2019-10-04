package com.bluapp.kotlinview.imageView

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import androidx.databinding.BindingAdapter
import androidx.databinding.DataBindingUtil
import com.bluapp.kotlinview.R
import com.bluapp.kotlinview.databinding.ActivityImageView13Binding

class ImageViewActivity13 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding:ActivityImageView13Binding = DataBindingUtil.setContentView(this, R.layout.activity_image_view13)
        val imagedata = DataBindingImageView()
        imagedata.profilepic = R.drawable.profilepic
        binding.imageview = imagedata
    }

    class DataBindingImageView {
        var profilepic: Int = 0

        companion object{
        @JvmStatic
        @BindingAdapter("android:image")
            fun loadImage(view: ImageView, profilepic: Int) {
                view.setImageResource(profilepic)
            }
        }

    }


}
