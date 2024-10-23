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
    suspend fun getAll(): List<Person>

    @Query("SELECT * FROM Person WHERE id = :id")
    suspend fun getById(id: Int): Person

    @Update
    suspend fun update(person: Person)

    @Insert
    suspend fun insert(people: List<Person>)

    @Delete
    suspend fun delete(person: Person)

}