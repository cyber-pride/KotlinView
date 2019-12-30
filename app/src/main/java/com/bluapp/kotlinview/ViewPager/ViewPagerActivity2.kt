package com.bluapp.kotlinview.ViewPager

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import androidx.viewpager.widget.ViewPager
import com.bluapp.kotlinview.R
import java.util.*

class ViewPagerActivity2 : AppCompatActivity() {
    private var viewPager: ViewPager? = null
    private var currentViewPager = 0
    private val int_items = 5;

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_view_pager2)
        viewPager = findViewById(R.id.viewpager) as ViewPager
        viewPager!!.adapter = MyAdapter(supportFragmentManager)
        val handler = Handler()
        val update = Runnable {
            if(currentViewPager == int_items){
                currentViewPager = 0
            }
            viewPager!!.setCurrentItem(currentViewPager++, true)
        }
        val swiperTimer = Timer()
        swiperTimer.schedule(object : TimerTask(){
            override fun run() {
                handler.post(update)
            }
        }, 4000, 4000)

        viewPager!!.addOnPageChangeListener(object : ViewPager.OnPageChangeListener{
            override fun onPageSelected(position: Int) {
                currentViewPager = position
            }

            override fun onPageScrolled(position: Int, positionOffset: Float, positionOffsetPixels: Int) {
            }

            override fun onPageScrollStateChanged(state: Int) {

            }
        })
    }

    private inner class MyAdapter(fm: FragmentManager?) : FragmentPagerAdapter(fm!!, FragmentPagerAdapter.BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT) {

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
