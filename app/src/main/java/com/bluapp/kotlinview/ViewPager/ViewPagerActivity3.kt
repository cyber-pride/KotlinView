package com.bluapp.kotlinview.ViewPager

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import androidx.viewpager2.widget.ViewPager2
import com.bluapp.kotlinview.R
import kotlinx.android.synthetic.main.viewpager_item.*

class ViewPagerActivity3 : AppCompatActivity() {
    private var viewPager: ViewPager2? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_view_pager3)
        viewPager = findViewById(R.id.viewpager) as ViewPager2
        viewPager!!.adapter = MyAdapter()
        viewPager!!.orientation = ViewPager2.ORIENTATION_VERTICAL
    }

    private inner class MyAdapter : RecyclerView.Adapter<MyAdapter.MyViewHolder>() {
        private val colorlists = intArrayOf(
            android.R.color.black,
            android.R.color.holo_green_light,
            android.R.color.holo_purple,
            android.R.color.holo_blue_dark
        )

        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder = MyViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.viewpager_item, parent, false))

        override fun getItemCount(): Int {
          return colorlists.size
        }

        override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
            holder.itemView.run{
                itemPosition.text = "Position $position"
                container.setBackgroundResource(colorlists[position])
            }
        }

        inner class MyViewHolder(itemView: View): RecyclerView.ViewHolder(itemView)
    }

}
