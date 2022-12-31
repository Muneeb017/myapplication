package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.bumptech.glide.Glide
import kotlinx.android.synthetic.main.activity_storie.*
import kotlinx.android.synthetic.main.activity_storie.view.*
import kotlinx.android.synthetic.main.item_facebook.view.*
import kotlinx.android.synthetic.main.item_storie.view.*

class ActivityStorie : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_storie)

        imageView3.setOnClickListener {
            finish()
        }

        val profileim = intent.getStringExtra("profile").toString()
        val storieim = intent.getStringExtra("storie").toString()
        val name = intent.getStringExtra("stname").toString()

        textView15.text = name
        Glide.with(this).load(profileim).into(prof)
        Glide.with(this).load(storieim).into(imageView7)

    }
}