package com.example.test.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.example.test.databinding.ItemTestBinding
import com.example.test.model.NganHangObj

class TestAdapter : ListAdapter<NganHangObj,TestAdapter.TestViewHolder>(TestDiffCallBack()){
    class TestViewHolder constructor(val binding:ItemTestBinding)
        : RecyclerView.ViewHolder(binding.root){
            fun bindData(
                item: NganHangObj
            ){
                binding.tvNameNH.text = item.NAME_VI
            }
        companion object {
            fun onBind(parent: ViewGroup):TestViewHolder{
                val view = ItemTestBinding.inflate(
                    LayoutInflater.from(parent.context),
                    parent,
                    false
                )
                return TestViewHolder(view)
            }
        }
        }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TestViewHolder {
        return TestViewHolder.onBind(parent)
    }

    override fun onBindViewHolder(holder: TestViewHolder, position: Int) {
        holder.bindData(getItem(position))
    }
}
class TestDiffCallBack : DiffUtil.ItemCallback<NganHangObj>(){
    override fun areItemsTheSame(oldItem: NganHangObj, newItem: NganHangObj): Boolean {
        return oldItem.ID ==newItem.ID
    }

    override fun areContentsTheSame(oldItem: NganHangObj, newItem: NganHangObj): Boolean {
        return oldItem == newItem
    }

}