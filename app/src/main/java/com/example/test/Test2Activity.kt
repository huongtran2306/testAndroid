package com.example.test

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.example.test.databinding.ActivityMainBinding
import com.example.test.databinding.Test2ActivityBinding

class Test2Activity : AppCompatActivity() {
    lateinit var binding: Test2ActivityBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = DataBindingUtil.setContentView(this,R.layout.test2_activity)
        binding.test2Activity =this


        initUI()

    }
    private fun initUI(){
        binding.button.setOnClickListener {
            finish()
        }

    }
}