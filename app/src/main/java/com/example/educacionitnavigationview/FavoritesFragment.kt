package com.example.educacionitnavigationview

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import com.example.educacionitnavigationview.databinding.FragmentFavoritesBinding
import com.example.educacionitnavigationview.databinding.FragmentHomeBinding


class FavoritesFragment : Fragment() {

    private lateinit var binding : FragmentFavoritesBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_favorites, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentFavoritesBinding.bind(view)

        binding.fab.setOnClickListener {

            Toast.makeText(requireContext(), " se toco el boton ", Toast.LENGTH_LONG).show()

        }
    }
}