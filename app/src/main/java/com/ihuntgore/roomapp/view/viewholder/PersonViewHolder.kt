package com.ihuntgore.roomapp.view.viewholder

import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.ihuntgore.roomapp.R
import com.ihuntgore.roomapp.model.Person

class PersonViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
    private val textViewName: TextView = itemView.findViewById(R.id.textViewNameValue)
    private val textViewAge: TextView = itemView.findViewById(R.id.textViewAgeValue)
    private val textViewAddress: TextView = itemView.findViewById(R.id.textViewAddressValue)

    fun bind(person: Person) {
        textViewName.text = person.name
        textViewAge.text = person.age.toString()
        textViewAddress.text = person.address
    }
}
