package com.azmi.helloworld

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.azmi.helloworld.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        //========================
        // data class Hewan -> ArrayList
        //========================

        Log.d("MainActivity", "Jumlah data: ${getData().size}")

    }

    private fun getData(): List<Hewan>{
        return listOf(
           Hewan("Ayam","Gallus gallu", R.drawable.ayam),
           Hewan("Angsa","Cygnus olor", R.drawable.angsa),
            Hewan("Bebek","Cairina moschata", R.drawable.bebek),
            Hewan("Domba","Ovis ammo", R.drawable.domba),
            Hewan("Kalkun","Meleagris gallopavo", R.drawable.kalkun),
            Hewan("Kambing","Capricornis sumatrensis", R.drawable.kambing),
            Hewan("Kelinci","Oryctolagus cuniculus", R.drawable.kelinci),
            Hewan("Kerbau","Bubalus bubalis", R.drawable.kerbau),
            Hewan("Kuda","Equus caballus", R.drawable.kuda),
            Hewan("sapi","Bos taurus", R.drawable.sapi),

        )

    }


}
