package com.demo.codinginflow.data

import androidx.room.Database
import androidx.room.RoomDatabase
import com.demo.codinginflow.data.dao.NoteDao
import com.demo.codinginflow.data.entities.Note

@Database(entities = arrayOf(Note::class), version = 1)
abstract class AppDatabase : RoomDatabase() {
    abstract fun noteDao(): NoteDao
}