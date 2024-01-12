package com.example.a18carrotmarket

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.a18carrotmarket.databinding.ActivityDetailBinding

class DetailActivity : AppCompatActivity() {

    private lateinit var binding: ActivityDetailBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetailBinding.inflate(layoutInflater)
        setContentView(binding.root)


        val itemName = intent.getStringExtra("ITEM_NAME")
        val itemPrice = intent.getIntExtra("ITEM_PRICE", 0)
        val itemLocate = intent.getStringExtra("ITEM_LOCATE")


    }
}
