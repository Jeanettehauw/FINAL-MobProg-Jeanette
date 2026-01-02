package com.example.project_mobprog_jean

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.lifecycleScope
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.project_mobprog_jean.databinding.ActivityMainBinding
import kotlinx.coroutines.launch

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val apiService = ApiService.create()

        lifecycleScope.launch {
            try {
                val users = apiService.getUsers()
                binding.rvUsers.layoutManager = LinearLayoutManager(this@MainActivity)
                binding.rvUsers.adapter = UserAdapter(users) { selectedUser ->
                    val intent = Intent(this@MainActivity, DetailActivity::class.java)
                    intent.putExtra("U_NAME", selectedUser.username)
                    intent.putExtra("U_EMAIL", selectedUser.email)
                    intent.putExtra("U_PHONE", selectedUser.phone)
                    startActivity(intent)
                }
            } catch (e: Exception) {
                Toast.makeText(this@MainActivity, "Koneksi Gagal", Toast.LENGTH_SHORT).show()
            }
        }
    }
}