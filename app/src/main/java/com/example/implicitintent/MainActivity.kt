package com.example.implicitintent

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.MediaStore
import androidx.cardview.widget.CardView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val Webv=findViewById<CardView>(R.id.web1)
        val camv=findViewById<CardView>(R.id.cam1)

        Webv.setOnClickListener {
            val intent=Intent(Intent.ACTION_VIEW)
            intent.data = Uri.parse("https://pro402.github.io/")
            startActivity(intent)
        }

        camv.setOnClickListener {
            val inta=Intent(MediaStore.ACTION_IMAGE_CAPTURE)
            startActivity(inta)
        }
    }
}