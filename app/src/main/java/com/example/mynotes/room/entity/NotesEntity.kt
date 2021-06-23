package com.example.mynotes.room.entity

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "notes")
data class NotesEntity(
    @PrimaryKey(autoGenerate = true)
    var id: Int,

    @ColumnInfo(name = "title")
    var title: String,

    @ColumnInfo(name = "sub_title")
    var sub_title: String,

    @ColumnInfo(name = "date_time")
    var date_time: String,

    @ColumnInfo(name = "note_text")
    var note_text: String,

    @ColumnInfo(name = "img_path")
    var img_path: String,

    @ColumnInfo(name = "web_link")
    var web_link: String,

    @ColumnInfo(name = "color")
    var color: String
) {
    override fun toString(): String {
        return super.toString()
    }
}