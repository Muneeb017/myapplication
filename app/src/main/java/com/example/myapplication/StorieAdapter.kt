package com.example.myapplication

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.myapplication.databinding.ItemStorieBinding

class StorieAdapter(val Listm: ArrayList<StorieModel>) :
    RecyclerView.Adapter<StorieAdapter.StorieHolder>() {

    inner class StorieHolder(val itemBinding: ItemStorieBinding) :
        RecyclerView.ViewHolder(itemBinding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): StorieHolder {
        val binding =
            ItemStorieBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return StorieHolder(binding)
    }

    override fun onBindViewHolder(holder: StorieHolder, position: Int) {
        val model = Listm[position]
        holder.itemBinding.textView14.text = model.name

        Glide.with(holder.itemView.context).load(model.profileimage).into(holder.itemBinding.profile)

        Glide.with(holder.itemView.context).load(model.storieimage).into(holder.itemBinding.storie)

    }

    override fun getItemCount(): Int {
        return Listm.size

    }

}