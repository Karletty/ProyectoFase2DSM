package com.example.pawcarecontrol.security_fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.Navigation.findNavController
import androidx.navigation.findNavController
import com.example.pawcarecontrol.R

class MainFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val root = inflater.inflate(R.layout.fragment_main, container, false)

        val btnToLogin = root.findViewById<Button>(R.id.btnToLogin)

        btnToLogin.setOnClickListener{
            findNavController().navigate(R.id.action_mainActivity_to_loginFragment)
        }
        return root
    }
}