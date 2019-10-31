package com.bluapp.kotlinview.spinner

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.Spinner
import android.widget.TextView
import com.bluapp.kotlinview.R

class SpinnerActivity8 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_spinner8)
        val spinner = findViewById(R.id.spinner) as Spinner
        val imageName = arrayOf("Video", "PrifilePic", "Checked", "UnChecked")
        val image = intArrayOf(R.drawable.ic_video, R.drawable.profilepic, R.drawable.ic_checked, R.drawable.ic_unchecked)
        val spinnerCustomAdapter = SpinnerCustomAdapter(applicationContext, image, imageName);
        spinner.adapter=spinnerCustomAdapter
    }

    class SpinnerCustomAdapter(internal var context: Context, internal var flags: IntArray, internal var Network: Array<String>) : BaseAdapter() { internal var inflter: LayoutInflater
        init {
            inflter = LayoutInflater.from(context)
        }
        override fun getCount(): Int {
            return flags.size
        }
        override fun getItem(i: Int): Any? {
            return null
        }
        override fun getItemId(i: Int): Long {
            return 0
        }
        override fun getView(i: Int, view: View?, viewGroup: ViewGroup): View {
            var view = view
            view = inflter.inflate(R.layout.custom_spinner_items, null)
            val icon = view.findViewById(R.id.spinner_imageView) as ImageView
            val names = view.findViewById(R.id.spinner_textView) as TextView
            icon.setImageResource(flags[i])
            names.text = Network[i]
            return view
        }
    }

}
