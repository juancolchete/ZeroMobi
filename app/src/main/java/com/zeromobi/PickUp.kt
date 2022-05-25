package com.zeromobi

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class PickUp : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.pickup)
        print("message")
        var btnSolicitar = findViewById<Button>(R.id.btn_solicitar)
        btnSolicitar.setOnClickListener {
            print("message")
            setContentView(R.layout.car_page)
        }

    }
}