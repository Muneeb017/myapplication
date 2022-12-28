package com.example.myapplication

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.myapplication.databinding.ItemFacebookBinding

class FacebookAdapter(val List: ArrayList<FriendModel>) :
    RecyclerView.Adapter<FacebookAdapter.FacebookHolder>() {

    inner class FacebookHolder(val itemBinding: ItemFacebookBinding) :
        RecyclerView.ViewHolder(itemBinding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FacebookHolder {
        val binding =
            ItemFacebookBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return FacebookHolder(binding)
    }

    override fun onBindViewHolder(holder: FacebookHolder, position: Int) {
        val model = List[position]
        holder.itemBinding.textView11.text = model.name
        holder.itemBinding.textView12.text = model.mutual.toString() + " mutual friends"

        Glide.with(holder.itemView.context).load(model.image).into(holder.itemBinding.image)

    }

    override fun getItemCount(): Int {
        return List.size
    }

}
