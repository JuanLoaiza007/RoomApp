package com.ihuntgore.roomapp.view

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.ihuntgore.roomapp.R
import com.ihuntgore.roomapp.viewmodel.PersonApp

class MainActivity : AppCompatActivity() {

    val app = applicationContext as PersonApp

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val peopleDb = app.room.personDao().getAll()
    }
}