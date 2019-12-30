package com.bluapp.kotlinview.ViewPager

import android.graphics.Color
import android.os.Build
import android.os.Bundle
import android.text.Html
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.AppCompatTextView
import androidx.appcompat.widget.LinearLayoutCompat
import androidx.core.text.HtmlCompat
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import androidx.viewpager.widget.ViewPager
import com.bluapp.kotlinview.R


@Suppress("DEPRECATION")
class ViewPagerActivity8 : AppCompatActivity() {
    private var viewPager: ViewPager? = null
    private var layoutDot: LinearLayoutCompat? = null
    private lateinit  var dot: Array<AppCompatTextView?>
    private val int_items = 5


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_view_pager8)
        viewPager = findViewById(R.id.viewpager) as ViewPager
        layoutDot = findViewById(R.id.layout_dot) as LinearLayoutCompat
        viewPager!!.adapter = MyAdapter(supportFragmentManager)
        addIndicator(0)
        viewPager!!.addOnPageChangeListener(object : ViewPager.OnPageChangeListener{
            override fun onPageSelected(position: Int) {
                addIndicator(position)
            }

            override fun onPageScrolled(position: Int, positionOffset: Float, positionOffsetPixels: Int) {
            }

            override fun onPageScrollStateChanged(state: Int) {

            }
        })
    }

     fun addIndicator(pagePosition : Int){
        dot = arrayOfNulls<AppCompatTextView>(int_items)
         layoutDot!!.removeAllViews()
        for(i in dot.indices){
            dot[i] = AppCompatTextView(this)
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.N) {
                dot[i]!!.text = Html.fromHtml("&#9673;", HtmlCompat.FROM_HTML_MODE_LEGACY)
            }else{
                dot[i]!!.text = Html.fromHtml("&#9673;")
            }
            dot[i]!!.textSize = 35f
            dot[i]!!.setTextColor(Color.GRAY)
            layoutDot!!.addView(dot[i])
        }
        dot[pagePosition]!!.setTextColor(Color.BLUE)
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
