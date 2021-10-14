package app.beelabs.com.demojetpack.session1.nav

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.core.os.bundleOf
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation
import androidx.navigation.fragment.findNavController
import app.beelabs.com.demojetpack.R

class PageFirstFragment : Fragment() {
    private val pageNumber = 1

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val rootView = inflater.inflate(R.layout.fragment_page_first, container, false)

        val btnPage = rootView.findViewById<Button>(R.id.btn_page)
        val btnCustomer = rootView.findViewById<Button>(R.id.btn_customer)
        val btnCustomer2 = rootView.findViewById<Button>(R.id.btn_customer_deeplink)

        btnPage.setOnClickListener {
//            val action = PageFirstFragmentDirections.actionPageFirstFragmentToPageSecondFragment(pageNumber = pageNumber+1 )
            val bundle = bundleOf("pageNumberString" to "2 from bundle")
//            Navigation.findNavController(it).navigate(action)
            Navigation.findNavController(it)
                .navigate(R.id.action_pageFirstFragment_to_pageSecondFragment, bundle)
        }
        btnCustomer.setOnClickListener {
            findNavController().navigate(R.id.action_pageFirstFragment_to_customerFirstFragment)
        }
        btnCustomer2.setOnClickListener {
            // test use deeplink
            startActivity(Intent(Intent.ACTION_VIEW).apply {
                data = Uri.parse("demo-app://demo.app/content/customer_second?username='John in customer 2'")
            })
        }

        return rootView

    }

//    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
//        val navController = findNavController()
//        navController.currentBackStackEntry?.savedStateHandle?.getLiveData<String>("custom_key")?.observe(
//            viewLifecycleOwner) { result ->
//            // Do something with the result.
//            Toast.makeText(activity, result, Toast.LENGTH_LONG).show()
//        }
//    }
}