package com.google.adnan9011.example

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.google.adnan9011.R
import com.google.adnan9011.creational.builder.runBuilderExample

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<Button>(R.id.btn_builder).setOnClickListener {
            runBuilderExample()
        }
    }
}