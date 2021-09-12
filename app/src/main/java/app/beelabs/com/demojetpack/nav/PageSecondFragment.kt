package app.beelabs.com.demojetpack.nav

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.activity.OnBackPressedCallback
import androidx.fragment.app.Fragment
import app.beelabs.com.demojetpack.R

class PageSecondFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val rootView = inflater.inflate(R.layout.fragment_page_second, container, false)

        val btnBack = rootView.findViewById<Button>(R.id.btn_back)

        btnBack.setOnClickListener {
            activity?.onBackPressed()
        }
        // Inflate the layout for this fragment
        return rootView
    }
}