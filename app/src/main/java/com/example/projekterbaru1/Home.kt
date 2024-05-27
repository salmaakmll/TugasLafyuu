package com.example.projekterbaru1

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.fragment.app.Fragment

private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

class Home : Fragment() {
    private var param1: String? = null
    private var param2: String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            param1 = it.getString(ARG_PARAM1)
            param2 = it.getString(ARG_PARAM2)
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_home, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        // Menginisialisasi ImageView dan menambahkan OnClickListener
        val splashImageView1 = view.findViewById<ImageView>(R.id.imageView3)
        splashImageView1.setOnClickListener {
            val intent = Intent(requireContext(), FlashSaleActivity::class.java)
            startActivity(intent)
        }

        val splashImageView2 = view.findViewById<ImageView>(R.id.imageView13)
        splashImageView2.setOnClickListener {
            val intent = Intent(requireContext(), FavProductActivity::class.java)
            startActivity(intent)
        }

        // Bagian lain dari onViewCreated Anda
    }

    companion object {
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            Home().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }
    }
}
