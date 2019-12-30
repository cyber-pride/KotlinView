package com.bluapp.kotlinview.ViewPager

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.lifecycle.Lifecycle
import androidx.viewpager2.adapter.FragmentStateAdapter
import androidx.viewpager2.widget.ViewPager2
import com.bluapp.kotlinview.R

class ViewPagerActivity17 : AppCompatActivity() {
    private var viewPager: ViewPager2? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_view_pager17)
        viewPager = findViewById(R.id.viewpager) as ViewPager2
        viewPager!!.orientation = ViewPager2.ORIENTATION_HORIZONTAL
        viewPager!!.adapter = MyAdapter(supportFragmentManager, lifecycle)
        viewPager!!.offscreenPageLimit = 3
        val pageMargin = 30f
        val pageOffset = 30f

        viewPager!!.setPageTransformer { page, position ->
            val mOffset = position * -(2 * pageOffset + pageMargin)
            if(position < -1){
                page.translationX=-mOffset
            }else if(position <= 1){
                val scaleFactor = Math.max(0.7f, 1 - Math.abs(position - 0.14285715f))
                page.translationX = mOffset
                page.scaleY = scaleFactor
                page.alpha = scaleFactor
            }else{
                page.alpha = 0f
                page.translationX = mOffset

            }
        }
    }

    private inner class MyAdapter(fm: FragmentManager?, lifecycle: Lifecycle) : FragmentStateAdapter(fm!!, lifecycle) {
        private val int_items = 5

        override fun createFragment(position: Int): Fragment {
            var fragment: Fragment? = null
            when (position) {
                0 -> fragment = ViewPagerFragment()
                1 -> fragment = ViewPagerFragment()
                2 -> fragment = ViewPagerFragment()
                3 -> fragment = ViewPagerFragment()
                4 -> fragment = ViewPagerFragment()
            }
            return fragment!!
        }

        override fun getItemCount(): Int {
            return int_items
        }

    }
}
