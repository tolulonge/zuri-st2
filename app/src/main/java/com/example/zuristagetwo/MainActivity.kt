package com.example.zuristagetwo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.zuristagetwo.databinding.ActivityMainBinding
import com.google.android.material.snackbar.Snackbar

class MainActivity : AppCompatActivity() {
    lateinit var binding : ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.activityMainDisplayBtn.setOnClickListener {
            binding.activityMainTxtName.visibility = View.VISIBLE
            val name = binding.activityMainEdt.text
            if (name?.isNotEmpty() == true){
                binding.activityMainTxtName.text = name
                binding.activityMainEdt.text?.clear()
            }else{
                Snackbar.make(binding.root,"Please enter your name",Snackbar.LENGTH_LONG).show()
            }
        }

    }
}