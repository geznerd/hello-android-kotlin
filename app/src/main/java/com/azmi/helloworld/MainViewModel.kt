package com.azmi.helloworld

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel: ViewModel() {

    private val data = MutableLiveData<List<Hewan>>()

    init {
        data.value = initData()
    }

    fun getData(): LiveData<List<Hewan>> = data

    private fun initData(): List<Hewan>{
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