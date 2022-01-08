package com.sylas.lusyspace.presentation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.sylas.lusyspace.R
import com.sylas.lusyspace.data.repository.VideoRepositoryImpl

class MainActivity : AppCompatActivity() {

    private val viewModel = VisorViewModel()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        showVideosQuantity()
    }

    private fun showVideosQuantity() {
        val quantity = viewModel.getVideosQuantity()
        val textView = findViewById<TextView>(R.id.quantity)

        textView.text = quantity
    }
}