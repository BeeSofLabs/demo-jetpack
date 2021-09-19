package app.beelabs.com.demojetpack.session1.nav.customer

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.Toast
import androidx.core.net.toUri
import androidx.navigation.fragment.findNavController
import app.beelabs.com.demojetpack.R

class CustomerFirstFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val rootView = inflater.inflate(R.layout.fragment_customer_first, container, false)
        val btnPage = rootView.findViewById<Button>(R.id.btn_page)
        // Inflate the layout for this fragment

        btnPage.setOnClickListener {
            findNavController().navigate(R.id.action_customerFirstFragment_to_customerSecondFragment)
//            findNavController().navigate(resources.getString(R.string.deeplink_demo_app).toUri())
        }
        return rootView
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        val navController = findNavController()
        navController.currentBackStackEntry?.savedStateHandle?.getLiveData<String>("custom_key")?.observe(
            viewLifecycleOwner) { result ->
            // Do something with the result.
            Toast.makeText(activity, result, Toast.LENGTH_LONG).show()
        }
    }
}