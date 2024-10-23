package com.ihuntgore.roomapp.viewmodel

import android.app.Application
import androidx.room.Room
import com.ihuntgore.roomapp.data.PeopleDB

class PersonApp : Application() {
    val room = Room
        .databaseBuilder(this, PeopleDB::class.java, "person")
        .build()
}