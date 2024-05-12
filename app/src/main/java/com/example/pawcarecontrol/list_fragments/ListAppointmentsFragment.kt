package com.example.pawcarecontrol.list_fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import com.example.pawcarecontrol.R
import com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton

class ListAppointmentsFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val root = inflater.inflate(R.layout.fragment_list_appointments, container, false)

        val btnCreate = root.findViewById<ExtendedFloatingActionButton>(R.id.btnCreateDoctor)

        btnCreate.setOnClickListener{

        }

        return root
    }
}