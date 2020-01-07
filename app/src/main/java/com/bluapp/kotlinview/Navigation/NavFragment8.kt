package com.bluapp.kotlinview.Navigation


import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.widget.AppCompatButton
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation
import com.bluapp.kotlinview.R


class NavFragment8 : Fragment() {
    private var startBtn: AppCompatButton? = null


    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val view = inflater.inflate(R.layout.fragment_nav_fragment8, container, false)
        startBtn = view.findViewById(R.id.startBtn) as AppCompatButton
        startBtn!!.setOnClickListener {
            Navigation.findNavController(view).navigate(R.id.navSecActivity);
        }
        return view
    }

}
