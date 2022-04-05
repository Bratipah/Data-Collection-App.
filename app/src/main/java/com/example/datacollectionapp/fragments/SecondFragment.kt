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

//        binding.submitButton.setOnClickListener{
//            val name = binding.name.text.toString()
//            val nationalId = binding.nationalIdTextInput.text.toString()
//            val mobileNo = binding.mobileNo.text.toString()
//            val gender = binding.genderTextInput.text.toString()
//            val uai = binding.uai.text.toString()
//            val county = binding.  countyTextEditText.text.toString()
//            val subsidiary = binding.subsidiaryTextInput.text.toString()
//            val village = binding.villageTextInput.text.toString()
//            val ward = binding.wardTextInput.text.toString()
//            val crop = binding.cropTextInput.text.toString()
//            val noOfAcres = binding.noOfAcres.text.toString()
//
//            var database = FirebaseDatabase.getInstance().getReference("Farmers")
//
//        }
//
//        binding.submitButton.setOnClickListener {
//            val action = SecondFragmentDirections.actionSecondFragmentToDataFragment()
//            findNavController().navigate(action)
//        }

        return binding.root
    }
}
