package com.ihuntgore.roomapp.view

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.ihuntgore.roomapp.R
import com.ihuntgore.roomapp.model.Person

class PersonAdapter(private val onPersonClick: (Person) -> Unit) : RecyclerView.Adapter<PersonAdapter.PersonViewHolder>() {

    private var peopleList: List<Person> = emptyList()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PersonViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_person, parent, false)
        return PersonViewHolder(view)
    }

    override fun onBindViewHolder(holder: PersonViewHolder, position: Int) {
        val person = peopleList[position]
        holder.bind(person)
        holder.itemView.setOnClickListener { onPersonClick(person) }
    }

    override fun getItemCount(): Int {
        return peopleList.size
    }

    fun setPeople(people: List<Person>) {
        this.peopleList = people
        notifyDataSetChanged()
    }

    inner class PersonViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        private val textViewName: TextView = itemView.findViewById(R.id.textViewNameValue)
        private val textViewAge: TextView = itemView.findViewById(R.id.textViewAgeValue)
        private val textViewAddress: TextView = itemView.findViewById(R.id.textViewAddressValue)

        fun bind(person: Person) {
            textViewName.text = person.name
            textViewAge.text = person.age.toString()
            textViewAddress.text = person.address
        }
    }
}
