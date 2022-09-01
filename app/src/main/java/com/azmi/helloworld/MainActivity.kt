package com.azmi.helloworld

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.RecyclerView
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
        val divider = DividerItemDecoration(this, RecyclerView.VERTICAL)
        binding.recyclerView.addItemDecoration(divider)
        binding.recyclerView.adapter = MainAdapter(getData())
        binding.recyclerView.setHasFixedSize(true)
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
