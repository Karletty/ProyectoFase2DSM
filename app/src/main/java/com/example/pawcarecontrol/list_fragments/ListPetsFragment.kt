package com.example.pawcarecontrol.list_fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.pawcarecontrol.R
import com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton

class ListPetsFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val root = inflater.inflate(R.layout.fragment_list_pets, container, false)

        val btnCreatePet = root.findViewById<ExtendedFloatingActionButton>(R.id.btnCreatePet)

        btnCreatePet.setOnClickListener{
            findNavController().navigate(R.id.action_listPetsFragment_to_createPetFragment)
        }

        return root
    }
}