package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import kotlinx.android.synthetic.main.activity_sign_up.*
import kotlinx.android.synthetic.main.login2.*

class Sign_up : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_up)

        retur.setOnClickListener {
            finish()
        }

        send.setOnClickListener {
            startActivity(
                Intent(this, perfile_activity::class.java)
                    .putExtra("email", editemail.text.toString())
                    .putExtra("name", editname.text.toString())
                    .putExtra("password", editpassword.text.toString())
                    .putExtra("confirmpassword", password.text.toString())
            )
        }

    }
}
