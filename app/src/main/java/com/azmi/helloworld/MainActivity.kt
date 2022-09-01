package com.azmi.helloworld

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
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

        val adapter = MainAdapter()
        binding.recyclerView.adapter = adapter
        binding.recyclerView.setHasFixedSize(true)

        viewModel.getData().observe(this) {
            adapter.updatedata(it)
        }

        viewModel.getStatus().observe(this){
            updateUI(it)
        }
    }


    private fun updateUI(status: ApiStatus) {
        when(status) {
            ApiStatus.LOADING -> {
                binding.recyclerView.visibility = View.GONE
                binding.errorTextView.visibility = View.GONE
                binding.progressBar.visibility = View.VISIBLE
            }

            ApiStatus.SUCCESS -> {
                binding.recyclerView.visibility = View.VISIBLE
                binding.errorTextView.visibility = View.GONE
                binding.progressBar.visibility = View.GONE
            }

            ApiStatus.FAILED -> {
                binding.recyclerView.visibility = View.GONE
                binding.errorTextView.visibility = View.VISIBLE
                binding.progressBar.visibility = View.GONE
            }
        }

    }


}
