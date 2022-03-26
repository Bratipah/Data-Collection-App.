package com.example.datacollectionapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.ArrayAdapter
import android.widget.AutoCompleteTextView
import android.widget.Button
import android.widget.TextView
import androidx.core.content.ContentProviderCompat.requireContext
import com.example.datacollectionapp.R.*
import com.example.datacollectionapp.databinding.ActivityMainBinding

const val TAG = "Main_Activity"
class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        Log.i(TAG, "Main Activity Launched")

//        val submitButton = findViewById<Button>(R.id.submit_button)
//
//        submitButton.setOnClickListener {
//            val intent = Intent(
//                this,
//                AnotherActivity::class.java,
//            )
//
//            startActivity(intent)
//            Log.i("MainActivity","Next Button Tapped!")
//        }
////        var textField = findViewById<TextView>(R.id.textField)
//        var genderTextInput = findViewById<TextView>(R.id.genderTextInput)
//        val items = listOf("Kisii","Nairobi","Machakos","Kisumu","Mombasa","Kwale","Nyeri","Isiolo")
//        val adapter = ArrayAdapter(
//            this,
//            layout.list_item,
//            items)
    }
}