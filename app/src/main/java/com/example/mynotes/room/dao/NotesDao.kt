package com.example.mynotes.room.dao;

import androidx.room.*

import com.example.mynotes.room.entity.NotesEntity;

import java.util.List;

@Dao
interface NotesDao {

    @get: Query("SELECT * FROM notes ORDER BY id DESC")
    val allNotes: List<NotesEntity>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertNote(note: NotesEntity)

    @Delete
    fun deleteNote(note: NotesEntity)


}

