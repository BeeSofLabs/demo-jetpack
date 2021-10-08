package app.beelabs.com.demojetpack.session1.nav

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation.findNavController
import androidx.navigation.fragment.findNavController
import app.beelabs.com.demojetpack.R
import app.beelabs.com.demojetpack.session1.model.User

class PageFirstFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val rootView = inflater.inflate(R.layout.fragment_page_first, container, false)
        val btnPage = rootView.findViewById<Button>(R.id.btn_page)
        val btnCustomer = rootView.findViewById<Button>(R.id.btn_customer)

        btnPage.setOnClickListener {
            val user = User("John", "South Jakarta", 25)
            val action =
                PageFirstFragmentDirections.actionPageFirstFragmentToPageSecondFragment(user)
            findNavController(it).navigate(action)
        }

        btnCustomer.setOnClickListener {
            findNavController().navigate(R.id.action_pageFirstFragment_to_customerFirstFragment)
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