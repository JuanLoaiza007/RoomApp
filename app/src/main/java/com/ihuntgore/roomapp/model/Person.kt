package com.ihuntgore.roomapp.model

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
class Person (
    @PrimaryKey(autoGenerate = true)
    val id: Int,
    val name: String,
    val age: Int,
    val address: String
)