package com.ihuntgore.roomapp.view

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.lifecycleScope
import com.ihuntgore.roomapp.R
import com.ihuntgore.roomapp.viewmodel.PersonApp
import kotlinx.coroutines.launch

class MainActivity : AppCompatActivity() {

    val app = applicationContext as PersonApp

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        lifecycleScope.launch {
            val peopleDb = app.room.personDao().getAll()
            Log.d("", "onCreate ${peopleDb.size} people")
        }
    }
}