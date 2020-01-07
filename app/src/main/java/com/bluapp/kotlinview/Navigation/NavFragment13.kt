package com.bluapp.kotlinview.Navigation


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.widget.AppCompatButton
import androidx.navigation.Navigation
import com.bluapp.kotlinview.R


class NavFragment13 : Fragment() {
    private var senddataBtn: AppCompatButton? = null
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val view =  inflater.inflate(R.layout.fragment_nav_fragment13, container, false)
        senddataBtn = view.findViewById(R.id.senddataBtn) as AppCompatButton
        senddataBtn!!.setOnClickListener {
           val action = NavFragment13Directions.maintoFragment131("Hello World")
            Navigation.findNavController(view).navigate(action);
        }
        return view
    }


}
