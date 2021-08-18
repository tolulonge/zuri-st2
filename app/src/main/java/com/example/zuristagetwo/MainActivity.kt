package com.example.zuristagetwo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.core.widget.doOnTextChanged
import com.example.zuristagetwo.databinding.ActivityMainBinding
import com.google.android.material.snackbar.Snackbar

class MainActivity : AppCompatActivity() {
    lateinit var binding : ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


        binding.activityMainTxtName.visibility = View.VISIBLE
        binding.activityMainEdt.doOnTextChanged { text, start, before, count ->
            binding.activityMainTxtName.text = text
        }

    }
}