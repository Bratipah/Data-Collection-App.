package com.example.datacollectionapp.fragments

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.datacollectionapp.R
import com.example.datacollectionapp.TAG
import com.example.datacollectionapp.databinding.SecondFragmentBinding
import com.google.firebase.database.FirebaseDatabase

class SecondFragment: Fragment(R.layout.second_fragment) {
    private lateinit var binding: SecondFragmentBinding
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = SecondFragmentBinding.inflate(layoutInflater)
//        return super.onCreateView(inflater, container, savedInstanceState)
        Log.i(TAG, "SecondFragment Launched")
        binding.backButton.setOnClickListener {
            val action = SecondFragmentDirections.actionSecondFragmentToFirstFragment()
            findNavController().navigate(action)
        }

        binding.submitButton.setOnClickListener{

            val gender = binding.genderTextInput.toString()
            val county = binding.  countyTextEditText.toString()
            val ward = binding.wardTextInput.toString()
            val crop = binding.cropTextInput.toString()
            val village = binding.villageTextInput.toString()
            val subsidiary = binding.subsidiaryTextInput.toString()


            var database = FirebaseDatabase.getInstance().getReference("Farmers")

        }
//
//        binding.submitButton.setOnClickListener {
//            val action = SecondFragmentDirections.actionSecondFragmentToDataFragment()
//            findNavController().navigate(action)
//        }

        return binding.root
    }
}
