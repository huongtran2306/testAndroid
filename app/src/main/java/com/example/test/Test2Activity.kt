package com.example.test

import android.content.res.AssetManager
import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.test.adapter.TestAdapter
import com.example.test.databinding.Test2ActivityBinding
import com.example.test.model.NganHangObj
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken
import java.nio.charset.Charset

class Test2Activity : AppCompatActivity() {
    lateinit var binding: Test2ActivityBinding
    lateinit var testAdapter: TestAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = DataBindingUtil.setContentView(this,R.layout.test2_activity)
        binding.test2Activity =this


        initUI()

    }
    private fun initUI(){
       val listType = object : TypeToken<List<NganHangObj>>(){}.type
        var listData = Gson().fromJson<ArrayList<NganHangObj>>(
            this.assets.fileAsString(
                "",
                "databank"
            ),
            listType
        )
        Log.d("huong","listData: $listData")
        binding.button.setOnClickListener {
            finish()
        }

        testAdapter = TestAdapter()
        testAdapter.submitList(listData)
        binding.rcvTest.apply {
            layoutManager = LinearLayoutManager(context)
            adapter = testAdapter
        }




    }
    fun AssetManager.fileAsString(subdirectory: String, filename: String): String {
        if (subdirectory.isNullOrEmpty()) {
            return open("$filename").use {
                it.readBytes().toString(Charset.defaultCharset())
            }
        } else {
            return open("$subdirectory/$filename").use {
                it.readBytes().toString(Charset.defaultCharset())
            }
        }
    }
}