package com.example.myapplication

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.core.graphics.toColorInt
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.myapplication.databinding.ItemFacebookBinding
import com.example.myapplication.databinding.ItemFacebookHomeBinding
import java.security.AccessController.getContext

class PostAdapter(val List: ArrayList<PostModel>) :
    RecyclerView.Adapter<PostAdapter.PostHolder>() {

    inner class PostHolder(val itemBinding: ItemFacebookHomeBinding) :
        RecyclerView.ViewHolder(itemBinding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PostHolder {
        val binding =
            ItemFacebookHomeBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return PostHolder(binding)
    }

    override fun onBindViewHolder(holder: PostHolder, position: Int) {
        val model = List[position]
        holder.itemBinding.textView15.text = model.name
        holder.itemBinding.textView16.text = model.time.toString() + " min ."
        holder.itemBinding.numLikes.text = model.likes.toString()
        holder.itemBinding.numComment.text = model.comment.toString()

        holder.itemBinding.like.setOnClickListener {
            holder.itemBinding.like.setTextColor("#1877f2".toColorInt())
            holder.itemBinding.imLike.setColorFilter(holder.itemView.context.resources.getColor(R.color.ligblue))
        }

        Glide.with(holder.itemView.context).load(model.profileimage).into(holder.itemBinding.prof)

        Glide.with(holder.itemView.context).load(model.postimage).into(holder.itemBinding.post)
    }

    override fun getItemCount(): Int {
        return List.size
    }


}