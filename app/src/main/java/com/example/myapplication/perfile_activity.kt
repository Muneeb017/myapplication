package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.ContactsContract.CommonDataKinds.Email
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_perfile.*

class perfile_activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_perfile)


        val emailadd = intent.getStringExtra("email")
        val username = intent.getStringExtra("name")
        val password = intent.getStringExtra("password")
        val conmpassword = intent.getStringExtra("confirmpassword")


        email.text = "email : " + emailadd
        nam.text = "Username : " + username
        pass.text = "Userpassword : " + password
        confirmpassword.text = "name :" + conmpassword

    }
}