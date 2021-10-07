package app.beelabs.com.demojetpack.session1.nav

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.Toast
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs
import app.beelabs.com.demojetpack.R

class PageThirdFragment : Fragment() {
    val args: PageThirdFragmentArgs by navArgs()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val rootView =  inflater.inflate(R.layout.fragment_page_third, container, false)

        val btnBack = rootView.findViewById<Button>(R.id.btn_back)

        val pageNumber = args.pageNumber
        Toast.makeText(activity, "Page $pageNumber", Toast.LENGTH_LONG).show()

        btnBack.setOnClickListener {
            activity?.onBackPressed()
        }

        return rootView
    }

}