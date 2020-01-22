package com.demo.codinginflow

import android.app.Application
import androidx.room.Room
import com.demo.codinginflow.data.AppDatabase

class NotePadApplication : Application() {

    companion object Factory {
        lateinit var database: AppDatabase
    }


    override fun onCreate() {
        super.onCreate()
        configureDatabase()
    }


    private fun configureDatabase() {
        database = Room
            .databaseBuilder(applicationContext, AppDatabase::class.java, "notepad")
            .fallbackToDestructiveMigration()
            .build()
    }
}
