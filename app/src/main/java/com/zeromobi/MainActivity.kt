package com.zeromobi

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ListView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.pickup)

        var btnLogin = findViewById<Button>(R.id.btn_login)
        btnLogin.setOnClickListener {
            setContentView(R.layout.pickup)
        }
    }
}