package com.ihuntgore.roomapp.data

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update
import com.ihuntgore.roomapp.model.Person

@Dao
interface PersonDao {

    @Query("SELECT * FROM Person")
    fun getAll(): List<Person>

    @Query("SELECT * FROM Person WHERE id = :id")
    fun getById(id: Int): Person

    @Update
    fun update(person: Person)

    @Insert
    fun insert(people: List<Person>)

    @Delete
    fun delete(person: Person)

}