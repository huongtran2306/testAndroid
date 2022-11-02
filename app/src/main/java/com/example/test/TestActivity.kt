package com.example.test

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.example.test.databinding.TestActivityBinding

class TestActivity : AppCompatActivity() {

    lateinit var binding: TestActivityBinding

    var hangso= "0"
    var soNguyen = 0

    var dem = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = DataBindingUtil.setContentView(this, R.layout.test_activity)

        binding.testActivity = this

        hangso = intent?.getStringExtra("hangso")!!
        soNguyen = intent?.getIntExtra("songuyen", 0)!!
        dem++


    }

    override fun onStart() {
        super.onStart()

    }

    override fun onResume() {
        super.onResume()
//        dem++
        initUI()
    }

    override fun onPause() {
        super.onPause()
        Toast.makeText(baseContext, "bi pause", Toast.LENGTH_SHORT).show()
    }

    override fun onStop() {
        super.onStop()
    }

    private fun initUI() {
        binding.tvHienthi.text = hangso
        binding.tvHienthiSoNguyen.text = soNguyen.toString()

        binding.btExit.setOnClickListener {
            finish()
        }

        binding.btNext.setOnClickListener {
            intent= Intent(baseContext,Test2Activity::class.java)
            startActivity(intent)
        }
    }


}