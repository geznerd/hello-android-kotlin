package com.azmi.helloworld

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.RecyclerView
import com.azmi.helloworld.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    private val viewModel: MainViewModel by lazy {
        ViewModelProvider(this)[MainViewModel::class.java]
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        //========================
        // data class Hewan -> ArrayList
        //========================
        val divider = DividerItemDecoration(this, RecyclerView.VERTICAL)
        binding.recyclerView.addItemDecoration(divider)
        binding.recyclerView.adapter = MainAdapter(viewModel.data)
        binding.recyclerView.setHasFixedSize(true)
    }


}
