package com.bluapp.kotlinview.Navigation


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.widget.AppCompatTextView

import com.bluapp.kotlinview.R

class NavFragment131 : Fragment() {
    private var receiveData: AppCompatTextView? = null
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val view =  inflater.inflate(R.layout.fragment_nav_fragment131, container, false)

        return inflater.inflate(R.layout.fragment_nav_fragment131, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val arg = NavFragment131Args.fromBundle(arguments!!)
        receiveData = view.findViewById(R.id.receiveData) as AppCompatTextView
        receiveData!!.text = arg.message
    }


}
