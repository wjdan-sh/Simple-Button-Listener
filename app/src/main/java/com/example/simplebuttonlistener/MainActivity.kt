package com.example.simplebuttonlistener

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {
     lateinit var  btkot:Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btkot=findViewById(R.id.bt1)


        btkot.setOnClickListener {
            Toast.makeText(this, "wjdan kotlin", Toast.LENGTH_SHORT).show()
        }
    }
    fun xml(view: View) {
        Toast.makeText(this, "wjdan xml ", Toast.LENGTH_SHORT).show()

    }
}


