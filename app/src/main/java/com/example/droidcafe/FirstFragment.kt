package com.example.droidcafe

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.Toast
import androidx.fragment.app.Fragment
import com.example.droidcafe.databinding.FragmentFirstBinding

/**
 * A simple [Fragment] subclass as the default destination in the navigation.
 */
class FirstFragment : Fragment() {

    private var _binding: FragmentFirstBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentFirstBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        // 🍩 Klik Donut
        view.findViewById<ImageView>(R.id.donut).setOnClickListener {
            displayToast(getString(R.string.donut_order_message))
        }

        // 🍦 Klik Ice Cream
        view.findViewById<ImageView>(R.id.ice_cream).setOnClickListener {
            displayToast(getString(R.string.ice_cream_order_message))
        }

        // 🍧 Klik Froyo
        view.findViewById<ImageView>(R.id.froyo).setOnClickListener {
            displayToast(getString(R.string.froyo_order_message))
        }
    }

    /** 🔔 Fungsi untuk menampilkan toast */
    private fun displayToast(message: String) {
        Toast.makeText(activity, message, Toast.LENGTH_SHORT).show()
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}
