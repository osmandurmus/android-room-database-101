package com.osmandurmus.note.data

import androidx.room.Entity
import androidx.room.PrimaryKey
import java.sql.Date

@Entity
data class Note(
    @PrimaryKey(autoGenerate = true)
    val id: Int,
    val title: String,
    val description: String,
    val imageUrl: String,
    val isEdited: Int,
    val createdDate: Date
)
