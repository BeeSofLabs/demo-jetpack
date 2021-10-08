package app.beelabs.com.demojetpack.session1.nav

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs
import app.beelabs.com.demojetpack.R

class PageSecondFragment : Fragment() {
    private val args: PageSecondFragmentArgs by navArgs()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val rootView = inflater.inflate(R.layout.fragment_page_second, container, false)

        val nameLabel = rootView.findViewById<TextView>(R.id.user_name)
        val addressLabel = rootView.findViewById<TextView>(R.id.user_address)
        val ageLabel = rootView.findViewById<TextView>(R.id.user_age)
        val btnPage = rootView.findViewById<Button>(R.id.btn_page)
        val btnBack = rootView.findViewById<Button>(R.id.btn_back)

        val user = args.user
        user.apply {
            nameLabel.text = name
            addressLabel.text = address
            ageLabel.text = age.toString()
        }




        btnPage.setOnClickListener {

            findNavController().navigate(R.id.action_pageSecondFragment_to_pageThirdFragment)
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
//        navController.previousBackStackEntry?.
//        savedStateHandle?.
//        set("custom_key", "Hello , im back")
//    }
}