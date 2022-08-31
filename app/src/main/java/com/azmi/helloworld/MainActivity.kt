package com.azmi.helloworld

import android.media.Image
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    //

    private lateinit var imageView: ImageView
    private lateinit var textView: TextView

    private  var index: Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //========================
        // data class Hewan -> ArrayList
        //========================


        val data = ArrayList<Hewan>().apply {
            add(Hewan("Ayam", R.drawable.ayam))
            add(Hewan("Bebek", R.drawable.bebek))
            add(Hewan("Domba", R.drawable.domba))
            add(Hewan("Kambing", R.drawable.kambing))
            add(Hewan("Sapi", R.drawable.sapi))
        }

        // val button

        val button : Button = findViewById(R.id.button)

        button.setOnClickListener {
            index = (index + 1)  % data.size
            showData(data[index])

            //if(index == 5) index = 0
        }


        imageView =findViewById(R.id.imageView)
        textView = findViewById(R.id.textView)

        showData(data[0])

    }

    private  fun showData(hewan: Hewan) {
        imageView.setImageResource(hewan.gambarResId)
        textView.text = hewan.nama
    }
}
