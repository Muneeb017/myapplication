package com.example.myapplication

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.myapplication.databinding.ItemChipBinding
import com.example.myapplication.databinding.ItemStorieBinding
import kotlinx.android.synthetic.main.activity_sign_up.view.*

class ChipAdapter(val Listm: ArrayList<ChipModel>) :
    RecyclerView.Adapter<ChipAdapter.ViewHolder>() {

    inner class ViewHolder(val itemBinding: ItemChipBinding) :
        RecyclerView.ViewHolder(itemBinding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val binding =
            ItemChipBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val model = Listm[position]
        holder.itemBinding.tvTxt.text = model.name


        Glide.with(holder.itemView.context).load(model.image).into(holder.itemBinding.ivChip)

    }

    override fun getItemCount(): Int {
        return Listm.size

    }

}