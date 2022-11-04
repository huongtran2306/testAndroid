package com.example.test

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.example.test.databinding.ThirdActivityBinding


class ThirdActivity: AppCompatActivity(){
    lateinit var binding: ThirdActivityBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= DataBindingUtil.setContentView(this,R.layout.third_activity)
        binding.thirdActivity= this

        initUI()
    }

    private fun initUI(){

    }
}