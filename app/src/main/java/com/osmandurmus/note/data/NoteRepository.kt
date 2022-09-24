package com.osmandurmus.note.data

import androidx.lifecycle.LiveData

class NoteRepository(private val noteDao: NoteDao ) {

    val getAllNote: LiveData<List<Note>> = noteDao.getAllNote()

    suspend fun addNote(note: Note) {
        noteDao.addNote(note)
    }

    suspend fun updateNote(note: Note) {
        noteDao.updateNote(note)
    }

    suspend fun deleteNote(note: Note) {
        noteDao.deleteNote(note)
    }

    fun getNoteById(note_id: Int) {
        noteDao.getNoteById(note_id)
    }
}