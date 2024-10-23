package com.ihuntgore.roomapp.data

import androidx.room.Database
import androidx.room.RoomDatabase
import com.ihuntgore.roomapp.model.Person

@Database(
    entities = [Person::class],
    version = 1
)

abstract class PeopleDB: RoomDatabase() {
    abstract fun personDao(): PersonDao
}

