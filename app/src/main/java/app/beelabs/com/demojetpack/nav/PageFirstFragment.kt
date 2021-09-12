package app.beelabs.com.demojetpack.nav

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.fragment.findNavController
import app.beelabs.com.demojetpack.R

class PageFirstFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val rootView = inflater.inflate(R.layout.fragment_page_first, container, false)
        val btnPage = rootView.findViewById<Button>(R.id.btn_page)
        // Inflate the layout for this fragment

        btnPage.setOnClickListener {
            findNavController().navigate(R.id.action_pageFirstFragment_to_pageSecondFragment)
        }
        return rootView
    }

}