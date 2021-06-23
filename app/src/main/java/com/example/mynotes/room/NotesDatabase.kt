package com.example.mynotes.room

import android.content.Context
import androidx.room.RoomDatabase
import androidx.room.Database
import androidx.room.Room
import com.example.mynotes.room.dao.NotesDao
import com.example.mynotes.room.entity.NotesEntity

@Database(entities = [NotesEntity::class], version = 1, exportSchema = false)
abstract class NotesDatabase : RoomDatabase() {
    companion object{
        var dbNotes: NotesDatabase? = null

        @Synchronized
        fun getDb(context: Context): NotesDatabase{
            if(dbNotes != null){
                dbNotes = Room.databaseBuilder(
                    context,
                    NotesDatabase::class.java,
                    "notes.db"
                ).build()
            }

            return dbNotes!!
        }
    }

    abstract fun notesDao(): NotesDao
}