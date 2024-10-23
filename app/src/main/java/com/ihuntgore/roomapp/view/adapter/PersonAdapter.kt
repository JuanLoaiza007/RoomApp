package com.ihuntgore.roomapp.view.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.ihuntgore.roomapp.R
import com.ihuntgore.roomapp.model.Person
import com.ihuntgore.roomapp.view.viewholder.PersonViewHolder

class PersonAdapter(private val onPersonClick: (Person) -> Unit) : RecyclerView.Adapter<PersonViewHolder>() {

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
}
