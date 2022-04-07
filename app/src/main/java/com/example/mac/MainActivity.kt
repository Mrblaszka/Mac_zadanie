package com.example.mac

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



        val img = findViewById<ImageView>(R.id.imageView)
        img.setImageResource(R.drawable.staw)
        var i = 1

        val kolejny = findViewById<Button>(R.id.button)
        val poprzedni = findViewById<Button>(R.id.button2)

        kolejny.setOnClickListener {
            i++
            if(i == 2){
                img.setImageResource(R.drawable.miegusz)
            }
            if(i == 3){
                img.setImageResource(R.drawable.kazalnica)
            }
        }
        poprzedni.setOnClickListener{
            i--
            if(i == 3){
                img.setImageResource(R.drawable.miegusz)
            }
            if(i == 2){
                img.setImageResource(R.drawable.staw)
            }
            if(i == 1){
                img.setImageResource(R.drawable.kazalnica)
            }
        }
    }
}