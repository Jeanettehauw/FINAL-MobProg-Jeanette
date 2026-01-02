package com.example.project_mobprog_jean

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.project_mobprog_jean.databinding.ActivityDetailBinding

class DetailActivity : AppCompatActivity() {
    private lateinit var binding: ActivityDetailBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetailBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.tvMyName.text = "Nama: Jeanette Hauw Chandra"
        binding.tvMyNim.text = "NIM: 2702323276"

        //selected data
        binding.tvDetailUsername.text = "Username: ${intent.getStringExtra("U_NAME")}"
        binding.tvDetailEmail.text = "Email: ${intent.getStringExtra("U_EMAIL")}"
        binding.tvDetailPhone.text = "Phone: ${intent.getStringExtra("U_PHONE")}"
    }
}