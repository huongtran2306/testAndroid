package com.example.test

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.ui.AppBarConfiguration
import com.example.test.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var appBarConfiguration: AppBarConfiguration
    private lateinit var binding: ActivityMainBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        initUI()
    }

    private fun initUI() {


        binding.btLogin.setOnClickListener {
//           Toast.makeText(baseContext, "Hello kitty", Toast.LENGTH_LONG).show()
            val hangso = binding.etMk.text.toString()
            val soNguyen = try {
                binding.etSdt.text.toString().toInt()
            }catch (e:Exception){
                1
            }
            val intent = Intent(baseContext, TestActivity::class.java)

            intent.putExtra("hangso", hangso)
            intent.putExtra("songuyen", soNguyen)

            startActivity(intent)
        }

        binding.btEx1.setOnClickListener {
            finish()
        }
    }

    }

fun setContentView(activityMain: Int) {

}
