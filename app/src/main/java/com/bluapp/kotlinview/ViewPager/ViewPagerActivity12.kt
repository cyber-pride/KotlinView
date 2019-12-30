package com.bluapp.kotlinview.ViewPager

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.widget.NestedScrollView
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import androidx.viewpager.widget.ViewPager
import com.bluapp.kotlinview.R

class ViewPagerActivity12 : AppCompatActivity() {
    private var nextedScrollView: NestedScrollView? = null
    private var viewPager: ViewPager? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_view_pager12)
        nextedScrollView = findViewById(R.id.nextedScrollView) as NestedScrollView
        viewPager = findViewById(R.id.viewpager) as ViewPager
        nextedScrollView!!.setFillViewport(true);
        viewPager!!.adapter = MyAdapter(supportFragmentManager)
    }

    private inner class MyAdapter(fm: FragmentManager?) : FragmentPagerAdapter(fm!!, FragmentPagerAdapter.BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT) {
        private val int_items = 5

        override fun getItem(position: Int): Fragment {
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

        override fun getCount(): Int {
            return int_items
        }
    }

}
