package com.osmandurmus.note.data

import androidx.lifecycle.LiveData
import androidx.room.*

@Dao
interface NoteDao {

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    suspend fun addNote(note: Note)

    @Update
    //@Query("UPDATE note SET isEdited = 1")
    suspend fun updateNote(note: Note)

    @Delete
    suspend fun deleteNote(note: Note)

    @Query("SELECT * FROM note WHERE id = :note_id")
    fun getNoteById(note_id: Int): Note;

    @Query("SELECT * FROM note ORDER BY id ASC")
    fun getAllNote(): LiveData<List<Note>>
}