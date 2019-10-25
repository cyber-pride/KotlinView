package com.bluapp.kotlinview.CheckBox

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.bluapp.kotlinview.R
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.core.content.ContextCompat
import android.graphics.drawable.Drawable
import android.content.Context
import android.graphics.Canvas
import android.widget.TextView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup




class CheckBoxActivity7 : AppCompatActivity() {
    private val list: RecyclerView? = null
    private var recyclerAdapter: adapter? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_check_box7)
        val list = findViewById(R.id.list) as RecyclerView
        val country = arrayListOf<String>()
        country.add("Nigeria")
        country.add("China")
        country.add("USA")
        country.add("Ghana")
        country.add("Canada")
        country.add("Finland")
        country.add("Denmark")
        country.add("Argentina")
        country.add("Andorra")
        country.add("Togo")
        val layoutManager = LinearLayoutManager(this)
        list.layoutManager = layoutManager
        recyclerAdapter = adapter(this@CheckBoxActivity7, country)
        list.addItemDecoration(CustomDividerItemDecoration(this@CheckBoxActivity7))
        list.adapter = recyclerAdapter
    }

    private inner class CustomDividerItemDecoration(context: Context) : RecyclerView.ItemDecoration() {
        private val drawableline: Drawable?
        init {
            drawableline = ContextCompat.getDrawable(context, com.bluapp.kotlinview.R.drawable.recyclerline)
        }
        override fun onDrawOver(c: Canvas, parent: RecyclerView, state: RecyclerView.State) {
            val left = parent.paddingLeft
            val right = parent.width - parent.paddingRight
            val childCount = parent.childCount
            for (i in 0 until childCount) {
                val child = parent.getChildAt(i)
                val params = child.layoutParams as RecyclerView.LayoutParams
                val top = child.bottom + params.bottomMargin
                val bottom = top + drawableline!!.intrinsicHeight
                drawableline.setBounds(left, top, right, bottom)
                drawableline.draw(c)
            }
        }
    }

    private inner class adapter(internal var context: Context, internal var mData: List<String>) :
        RecyclerView.Adapter<adapter.myViewHolder>() {

        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): adapter.myViewHolder {
            val view =
                LayoutInflater.from(context).inflate(R.layout.recyclerview_adapter1, parent, false)
            return myViewHolder(view)
        }

        override fun onBindViewHolder(holder: adapter.myViewHolder, position: Int) {
            holder.country.text = mData[position]
        }

        override fun getItemCount(): Int {
            return mData.size
        }

        inner class myViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
            internal var country: TextView

            init {
                country = itemView.findViewById(R.id.country)
            }
        }
    }


}
