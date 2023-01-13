package com.example.educacionitnavigationview

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.educacionitnavigationview.databinding.FragmentHomeBinding
import com.google.android.material.snackbar.Snackbar

class HomeFragment : Fragment() {

    private lateinit var binding : FragmentHomeBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_home, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentHomeBinding.bind(view)

        val viewForSnackbar = binding.coordinatorForSnackbar

        binding.lanzarSnackbar.setOnClickListener {

            Snackbar.make(viewForSnackbar, "se pulso el boton para lanzar", Snackbar.LENGTH_SHORT ).show()

        }

        binding.lanzar.setOnClickListener {

            Snackbar.make(viewForSnackbar, "no se puede realizar esta operacion ahora", Snackbar.LENGTH_INDEFINITE)
                .setAction("Aceptar"){
                    it.visibility = View.GONE
                }
                .show()

        }

    }

}