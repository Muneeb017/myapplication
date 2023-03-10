package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import com.example.myapplication.login.StartActivity
import kotlinx.android.synthetic.main.activity_perfile.*
import kotlinx.android.synthetic.main.layout_two.*
import kotlinx.android.synthetic.main.login2.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.login2)

        back.setOnClickListener {
            finish()
        }

        create.setOnClickListener {
            val intent = Intent(this, Sign_up::class.java)
            startActivity(intent)
        }

        btnsend.setOnClickListener {
            startActivity(
                Intent(this, perfile_activity::class.java)
                    .putExtra("email", editusername.text.toString())
                    .putExtra("password", edituserpassword.text.toString())
            )
        }

    }
}
