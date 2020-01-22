package com.demo.codinginflow.data.dao

import androidx.lifecycle.LiveData
import androidx.room.*
import com.demo.codinginflow.data.entities.Note


@Dao interface NoteDao {

    @Query("SELECT * FROM notes ORDER BY priority DESC")
    fun getAllNotes(): LiveData<List<Note>>


    @Insert
    fun insert(note: Note)

    @Update
    fun update(note: Note)

    @Delete
    fun delete(note: Note)


    @Query("DELETE FROM notes")
    fun deleteAllNotes()

}
