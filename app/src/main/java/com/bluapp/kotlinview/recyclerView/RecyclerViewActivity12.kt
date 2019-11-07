package com.bluapp.kotlinview.recyclerView

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.RecyclerView
import com.bluapp.kotlinview.R
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import android.widget.Toast
import android.widget.TextView
import android.widget.LinearLayout
import androidx.core.content.ContextCompat
import android.view.Gravity
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import java.io.Serializable;





class RecyclerViewActivity12 : AppCompatActivity() {
    private var list: RecyclerView? = null
    private var recyclerAdapter: adapter? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_recycler_view12)
        list = findViewById(R.id.list) as RecyclerView
        val DataItems = arrayListOf<CountryDataItem>()
        val ChildDataItems = arrayListOf<ChildDataItem>()
        val ParentDataItem: CountryDataItem
        var ChildDataItem: ChildDataItem
        ParentDataItem = CountryDataItem()
        ParentDataItem.countryName="Nigeria"

        ChildDataItem = ChildDataItem()
        ChildDataItem.stateName="Lagos"
        ChildDataItems.add(ChildDataItem)

        ChildDataItem = ChildDataItem()
        ChildDataItem.stateName="Oyo"
        ChildDataItems.add(ChildDataItem)

        ChildDataItem = ChildDataItem()
        ChildDataItem.stateName="Ogun"
        ChildDataItems.add(ChildDataItem)

        ParentDataItem.childDataItems=ChildDataItems
        DataItems.add(ParentDataItem)

        val layoutManager = LinearLayoutManager(this)
        list!!.setLayoutManager(layoutManager)
        recyclerAdapter = adapter(this@RecyclerViewActivity12, DataItems)
        list!!.addItemDecoration(DividerItemDecoration(list!!.getContext(), layoutManager.orientation))
        list!!.setAdapter(recyclerAdapter)
    }

    private inner class adapter(internal var context: Context, internal var mData: List<CountryDataItem>) : RecyclerView.Adapter<adapter.myViewHolder>() {
        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): adapter.myViewHolder {
            val view =
                LayoutInflater.from(context).inflate(R.layout.recyclerview_adapter12, parent, false)
            return myViewHolder(view)
        }

        override fun onBindViewHolder(holder: adapter.myViewHolder, position: Int) {
            val countryDataItem = mData[position]
            holder.country.text = countryDataItem.countryName
            val noOfChildTextViews = holder.linearLayout_childItems.childCount
            val noOfChild = countryDataItem.childDataItems!!.size
            if (noOfChild < noOfChildTextViews) {
                for (index in noOfChild until noOfChildTextViews) {
                    val currentTextView =
                        holder.linearLayout_childItems.getChildAt(index) as TextView
                    currentTextView.visibility = View.GONE
                }
            }
            for (textViewIndex in 0 until noOfChild) {
                val currentTextView =
                    holder.linearLayout_childItems.getChildAt(textViewIndex) as TextView
                currentTextView.setText(countryDataItem.childDataItems!![textViewIndex].stateName)
            }
        }

        override fun getItemCount(): Int {
            return mData.size
        }

        inner class myViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView),
            View.OnClickListener {
            internal var country: TextView
            val linearLayout_childItems: LinearLayout

            init {
                country = itemView.findViewById(R.id.country)
                linearLayout_childItems = itemView.findViewById(R.id.ll_child_items)
                linearLayout_childItems.visibility = View.GONE
                var intMaxNoOfChild = 0
                for (index in mData.indices) {
                    val intMaxSizeTemp = mData[index].childDataItems!!.size
                    if (intMaxSizeTemp > intMaxNoOfChild) intMaxNoOfChild = intMaxSizeTemp
                }
                for (indexView in 0 until intMaxNoOfChild) {
                    val textView = TextView(context)
                    textView.id = indexView
                    textView.setPadding(0, 20, 0, 20)
                    textView.gravity = Gravity.CENTER
                    textView.background =
                        ContextCompat.getDrawable(context, R.drawable.background_sub_module_text)
                    val layoutParams = LinearLayout.LayoutParams(
                        LinearLayout.LayoutParams.MATCH_PARENT,
                        LinearLayout.LayoutParams.WRAP_CONTENT
                    )
                    textView.setOnClickListener(this)
                    linearLayout_childItems.addView(textView, layoutParams)
                }
                country.setOnClickListener(this)
            }

            override fun onClick(view: View) {
                if (view.getId() == R.id.country) {
                    if (linearLayout_childItems.visibility == View.VISIBLE) {
                        linearLayout_childItems.visibility = View.GONE
                    } else {
                        linearLayout_childItems.visibility = View.VISIBLE
                    }
                } else {
                    val textViewClicked = view as TextView
                    Toast.makeText(context, "" + textViewClicked.text.toString(), Toast.LENGTH_SHORT
                    ).show()
                }
            }
        }
    }

    private inner class CountryDataItem : Serializable {
        var countryName: String? = null
        var childDataItems: ArrayList<ChildDataItem>? = null
    }

    private inner class ChildDataItem : Serializable {
        var stateName: String? = null
    }
}
