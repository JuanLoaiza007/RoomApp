package com.ihuntgore.roomapp.viewmodel

import android.app.Application
import androidx.room.Room
import com.ihuntgore.roomapp.data.PeopleDB

class PersonApp : Application() {

    lateinit var room: PeopleDB

    override fun onCreate() {
        super.onCreate()

        room = Room.databaseBuilder(
            applicationContext,
            PeopleDB::class.java,
            "person_database"
        ).build()
    }
}
