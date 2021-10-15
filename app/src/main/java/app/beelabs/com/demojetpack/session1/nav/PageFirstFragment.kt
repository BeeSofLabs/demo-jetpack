package app.beelabs.com.demojetpack.session1.nav

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.Toast
import androidx.core.net.toUri
import androidx.navigation.Navigation
import androidx.navigation.fragment.findNavController
import app.beelabs.com.demojetpack.R
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject
import javax.inject.Named

@AndroidEntryPoint
class  PageFirstFragment : Fragment() {

    @Inject
    @Named("message1")
    lateinit var mymessage1: String
    @Inject
    @Named("message2")
    lateinit var mymessage2: String
    @Inject
    @Named("message3")
    lateinit var mymessage3: String

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val rootView = inflater.inflate(R.layout.fragment_page_first, container, false)
        val btnMessage1 = rootView.findViewById<Button>(R.id.btn_message1)
        val btnMessage2 = rootView.findViewById<Button>(R.id.btn_message2)
        val btnMessage3 = rootView.findViewById<Button>(R.id.btn_message3)

        btnMessage1.setOnClickListener {
            Toast.makeText(activity, mymessage1, Toast.LENGTH_SHORT).show()
        }

        btnMessage2.setOnClickListener {
            Toast.makeText(activity, mymessage2, Toast.LENGTH_SHORT).show()
        }
        btnMessage3.setOnClickListener {
            Toast.makeText(activity, mymessage3, Toast.LENGTH_SHORT).show()
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