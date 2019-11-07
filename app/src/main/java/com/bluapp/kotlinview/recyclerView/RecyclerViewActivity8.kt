package com.bluapp.kotlinview.recyclerView

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.LinearLayoutManager
import com.bluapp.kotlinview.R
import androidx.recyclerview.widget.DividerItemDecoration
import android.widget.TextView
import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.Toast
import android.content.Context
import android.view.View


class RecyclerViewActivity8 : AppCompatActivity() {
    private var list: RecyclerView? = null
    private var recyclerAdapter: adapter? = null
    private var layoutManager: LinearLayoutManager? = null
    private val previousTotal = 0
    private var loading = false
    private val visibleThreshold = 5
    private var lastVisibleItemPosition: Int = 0
    private var visibleItemCount: Int = 0
    private var totalItemCount: Int = 0


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_recycler_view8)
        list = findViewById(R.id.list) as RecyclerView
        val country = arrayListOf<String>()
        country.add("Nigeria");
        country.add("China");
        country.add("USA");
        country.add("Ghana");
        country.add("Canada");
        country.add("Finland");
        country.add("Denmark");
        country.add("Argentina");
        country.add("Andorra");
        country.add("Angola");
        country.add("Benin");
        country.add("Brazil");
        country.add("Chile");
        country.add("Denmark");
        country.add("Egypt");
        country.add("Fiji");
        country.add("France");
        country.add("Togo");
        layoutManager = LinearLayoutManager(this)
        list!!.setLayoutManager(layoutManager)
        recyclerAdapter = adapter(this@RecyclerViewActivity8, country)
        list!!.addItemDecoration(DividerItemDecoration(list!!.getContext(), layoutManager!!.orientation))
        list!!.setAdapter(recyclerAdapter)
        list!!.addOnScrollListener(onScrollListener)

    }

    private val onScrollListener = object : RecyclerView.OnScrollListener() {
        override fun onScrollStateChanged(recyclerView: RecyclerView, newState: Int) {
            super.onScrollStateChanged(recyclerView, newState)
        }

        override fun onScrolled(recyclerView: RecyclerView, dx: Int, dy: Int) {
            super.onScrolled(recyclerView, dx, dy)
            visibleItemCount = layoutManager!!.getChildCount()
            totalItemCount = layoutManager!!.getItemCount()
            lastVisibleItemPosition = layoutManager!!.findLastVisibleItemPosition()
            if (!loading && lastVisibleItemPosition == totalItemCount - 1) {
                Toast.makeText(this@RecyclerViewActivity8, "The end, load next data", Toast.LENGTH_SHORT).show()
                loading = true
            }
        }
    }

    private inner class adapter(internal var context: Context, internal var mData: List<String>) : RecyclerView.Adapter<adapter.myViewHolder>() {
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
