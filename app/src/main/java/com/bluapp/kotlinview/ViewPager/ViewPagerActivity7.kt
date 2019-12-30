package com.bluapp.kotlinview.ViewPager

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import androidx.viewpager.widget.PagerAdapter
import androidx.viewpager.widget.ViewPager
import com.bluapp.kotlinview.R

class ViewPagerActivity7 : AppCompatActivity() {
    private var viewPager: ViewPager? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_view_pager7)
        viewPager = findViewById(R.id.viewpager) as ViewPager
        viewPager!!.adapter = MyAdapter()
    }

    private inner class MyAdapter() : PagerAdapter() {
        private val int_items = 5

        public override fun instantiateItem(container: ViewGroup, position: Int): Any {
            val inflater = container.context.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater
            var resid = -1
            when (position) {
                0 -> resid = R.layout.fragment_view_pager
                1 -> resid = R.layout.fragment_view_pager
                2 -> resid = R.layout.fragment_view_pager
                3 -> resid = R.layout.fragment_view_pager
                4 -> resid = R.layout.fragment_view_pager
            }
            val view = inflater.inflate(resid, container, false)
            (container as ViewPager).addView(view, 0)
            return view
        }

        override fun destroyItem(container: ViewGroup, position: Int, `object`: Any) {
            container.removeView(`object` as View)
        }

        override fun isViewFromObject(view: View, `object`: Any): Boolean {
            return  view == `object`
        }

        override fun getCount(): Int {
            return int_items
        }
    }

}
