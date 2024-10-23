package com.ihuntgore.roomapp.view.viewholder

import androidx.recyclerview.widget.RecyclerView
import com.ihuntgore.roomapp.databinding.ItemPersonBinding
import com.ihuntgore.roomapp.model.Person

class PersonViewHolder(private val binding: ItemPersonBinding) : RecyclerView.ViewHolder(binding.root) {

    fun bind(person: Person) {
        binding.person = person
        binding.executePendingBindings() // Opcional: Fuerza la actualización inmediata de la UI
    }
}
