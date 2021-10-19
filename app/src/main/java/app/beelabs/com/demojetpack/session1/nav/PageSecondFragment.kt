
package app.beelabs.com.demojetpack.session1.nav

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation
import androidx.navigation.fragment.NavHostFragment.findNavController
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs
import androidx.navigation.ui.NavigationUI
import app.beelabs.com.demojetpack.R

class PageSecondFragment : Fragment() {

    val args: PageSecondFragmentArgs by navArgs()
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val rootView = inflater.inflate(R.layout.fragment_page_second, container, false)

        val btnPage = rootView.findViewById<Button>(R.id.btn_page)
        val btnBack = rootView.findViewById<Button>(R.id.btn_back)

//        val pageNumber = args.pageNumber
        val pageNumberString = arguments?.getString("pageNumberString")
//        Toast.makeText(activity, "Page $pageNumber", Toast.LENGTH_LONG).show()
        Toast.makeText(activity, "pageNumber $pageNumberString", Toast.LENGTH_LONG).show()

        btnPage.setOnClickListener {
            val action = PageSecondFragmentDirections.actionPageSecondFragmentToPageThirdFragment(pageNumber = 3 )
            Navigation.findNavController(it).navigate(action)
        }
        btnBack.setOnClickListener {
            activity?.onBackPressed()
        }

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