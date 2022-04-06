package com.example.datacollectionapp.fragments

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation.findNavController
import androidx.navigation.findNavController
import androidx.navigation.fragment.findNavController
import com.example.datacollectionapp.R
import com.example.datacollectionapp.TAG
import com.example.datacollectionapp.databinding.FirstFragmentBinding

class FirstFragment: Fragment(R.layout.first_fragment) {
    private lateinit var binding: FirstFragmentBinding
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        Log.i(TAG, "FirstFragment Launched")
        binding = FirstFragmentBinding.inflate(layoutInflater)
        var nextButton = binding.next
        nextButton.setOnClickListener {

//            val name = binding.textInput.toString().toInt()

            val action = FirstFragmentDirections.actionFirstFragmentToSecondFragment()
            view?.findNavController()?.navigate(action)

            var name = binding.textInput.toString()
            var nationalId = binding.nationalIdTextInput.toString().toLong()
            var mobileNumber = binding.mobileNoTextInput.toString().toLong()
            var uai = binding.UAITextInput.toString()
            var  noOfAcres = binding.noOfAcresTextInput.toString().toInt()


        }


//       return super.onCreateView(inflater, container, savedInstanceState)
        return binding.root
    }
}