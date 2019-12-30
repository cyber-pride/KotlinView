package com.bluapp.kotlinview.ViewPager

import android.os.Bundle
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatActivity
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.viewpager.widget.PagerAdapter
import androidx.viewpager.widget.ViewPager
import com.bluapp.kotlinview.R


class ViewPagerActivity11 : AppCompatActivity() {
    private var viewPager: ViewPager? = null
    private var myAdapter: MyAdapter? = null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_view_pager11)
        viewPager = findViewById(R.id.viewpager) as ViewPager
        myAdapter = MyAdapter()
        viewPager!!.adapter = myAdapter
        val inflater = layoutInflater
        val constraintLayout = inflater.inflate(R.layout.viewpager_item11, null) as ConstraintLayout
        myAdapter!!.addView(constraintLayout, 0)
        myAdapter!!.notifyDataSetChanged()

    }

    fun addView(newPage: View?) {
        val pageindex: Int = myAdapter!!.addView(newPage!!)
        viewPager!!.setCurrentItem(pageindex, true)
    }

    fun removeView(defunctPage: View?) {
        var pageindex: Int = myAdapter!!.removeView(viewPager, defunctPage)
        if (pageindex == myAdapter!!.getCount()) pageindex--
        viewPager!!.currentItem = pageindex
    }

    fun getCurrentPage(): View? {
        return myAdapter!!.getView(viewPager!!.currentItem)
    }

    fun setCurrentPage(pageToShow: View?) {
        viewPager!!.setCurrentItem(myAdapter!!.getItemPosition(pageToShow!!), true)
    }

    private class MyAdapter : PagerAdapter() {
        private val views: MutableList<View> = mutableListOf<View>()

        override fun getItemPosition(`object`: Any): Int {
            val index = views.indexOf(`object`)
            return if (index == -1) POSITION_NONE else index
        }

        override fun instantiateItem(container: ViewGroup, position: Int): Any {
            val view: View = views[position]
            container.addView(view)
            return view
        }

        override fun destroyItem(container: ViewGroup, position: Int, `object`: Any) {
            container.removeView(views[position])
        }

        override fun getCount(): Int {
            return views.size
        }

        override fun isViewFromObject(view: View, `object`: Any): Boolean {
            return view === `object`
        }

        fun addView(view: View): Int {
            return addView(view, views.size)
        }

        fun addView(view: View, position: Int): Int {
            views.add(position, view)
            return position
        }

        fun removeView(pager: ViewPager?, view: View?): Int {
            return removeView(pager!!, views.indexOf(view))
        }

        fun removeView(pager: ViewPager, position: Int): Int {
            pager.adapter = null
            views.removeAt(position)
            pager.adapter = this
            return position
        }

        fun getView(position: Int): View {
            return views[position]
        }
    }
}
