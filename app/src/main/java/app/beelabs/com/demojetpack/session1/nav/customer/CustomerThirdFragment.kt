package app.beelabs.com.demojetpack.session1.nav.customer

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.fragment.findNavController
import app.beelabs.com.demojetpack.R

class CustomerThirdFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        // Inflate the layout for this fragment
        val rootView =  inflater.inflate(R.layout.fragment_customer_third, container, false)

        val btnBack = rootView.findViewById<Button>(R.id.btn_back)

        btnBack.setOnClickListener {
            activity?.onBackPressed()
        }

        return rootView
    }

}