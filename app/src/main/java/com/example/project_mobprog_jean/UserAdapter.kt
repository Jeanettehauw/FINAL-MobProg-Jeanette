package com.example.project_mobprog_jean

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.project_mobprog_jean.databinding.ItemUserBinding

class UserAdapter(private val listUser: List<User>, private val onClick: (User) -> Unit) :
    RecyclerView.Adapter<UserAdapter.ViewHolder>() {

    class ViewHolder(val binding: ItemUserBinding) : RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val binding = ItemUserBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val user = listUser[position]
        holder.binding.tvUsername.text = user.username
        holder.binding.tvEmail.text = user.email
        holder.itemView.setOnClickListener { onClick(user) }
    }

    override fun getItemCount(): Int = listUser.size
}