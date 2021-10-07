package app.beelabs.com.demojetpack.session1.nav.customer

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import app.beelabs.com.demojetpack.R

class CustomerSecondFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val rootView = inflater.inflate(R.layout.fragment_customer_second, container, false)

        val btnPage = rootView.findViewById<Button>(R.id.btn_page)
        val btnBack = rootView.findViewById<Button>(R.id.btn_back)

        btnPage.setOnClickListener {
            findNavController().navigate(R.id.action_customerSecondFragment_to_customerThirdFragment)
        }
        btnBack.setOnClickListener {
            activity?.onBackPressed()
        }
        // Inflate the layout for this fragment
        return rootView
    }

//    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
//
//        val navController = findNavController()
//        navController.previousBackStackEntry?.savedStateHandle?.set("custom_key", "Hello , im back")
//    }
}