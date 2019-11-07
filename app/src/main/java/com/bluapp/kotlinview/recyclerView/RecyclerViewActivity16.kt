package com.bluapp.kotlinview.recyclerView

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.bluapp.kotlinview.R
import androidx.recyclerview.widget.RecyclerView
import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.TextView
import android.view.View
import androidx.recyclerview.widget.LinearLayoutManager


class RecyclerViewActivity16 : AppCompatActivity() {
    private var list: RecyclerView? = null
    private val TYPE_HEADER: Int = 0
    private val TYPE_ITEM: Int = 1

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_recycler_view16)
        list = findViewById(R.id.list) as RecyclerView
        val linearLayoutManager = LinearLayoutManager(this@RecyclerViewActivity16)
        list!!.setLayoutManager(linearLayoutManager)
        list!!.setHasFixedSize(true)
        val customAdapter = CustomRecyclerViewAdapter(getDataSource())
        list!!.setAdapter(customAdapter)
    }

    inner class CustomRecyclerViewAdapter(private val itemObjects: List<ItemObject>) : RecyclerView.Adapter<RecyclerView.ViewHolder>() {

        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
            if (viewType == TYPE_HEADER) {
                val layoutView = LayoutInflater.from(parent.context).inflate(R.layout.header_layout, parent, false)
                return HeaderViewHolder(layoutView)
            } else if (viewType == TYPE_ITEM) {
                val layoutView = LayoutInflater.from(parent.context).inflate(R.layout.item_layout, parent, false)
                return ItemViewHolder(layoutView)
            }
            throw RuntimeException("No match for $viewType.")
        }

        override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
            val mObject = itemObjects[position]
            if (holder is HeaderViewHolder) {
                (holder as HeaderViewHolder).headerTitle.setText(mObject.contents)
            } else if (holder is ItemViewHolder) {
                (holder as ItemViewHolder).itemContent.setText(mObject.contents)
            }
        }

        private fun getItem(position: Int): ItemObject {
            return itemObjects[position]
        }

        override fun getItemCount(): Int {
            return itemObjects.size
        }

        override fun getItemViewType(position: Int): Int {
            return if (isPositionHeader(position)) TYPE_HEADER else TYPE_ITEM
        }

        private fun isPositionHeader(position: Int): Boolean {
            return position == 0
        }
    }

    inner class HeaderViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var headerTitle: TextView
        init {
            headerTitle = itemView.findViewById(R.id.header)
        }
    }

    inner class ItemViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var itemContent: TextView
        init {
            itemContent = itemView.findViewById(R.id.itemcontent) as TextView
        }
    }

    inner class ItemObject(val contents: String)

    private fun getDataSource(): List<ItemObject> {
        val data = ArrayList<ItemObject>()
        data.add(ItemObject("Country"))
        data.add(ItemObject("Nigeria"))
        data.add(ItemObject("Finland"))
        data.add(ItemObject("Denmark"))
        data.add(ItemObject("Argentina"))
        data.add(ItemObject("Andorra"))
        return data
    }
}
