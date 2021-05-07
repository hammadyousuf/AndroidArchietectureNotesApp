package io.kashsoft.androidarchietecturenotesapp

import androidx.lifecycle.LiveData

class NoteRespositry (private  val noteDao: NoteDao){

    val allNotes: LiveData<List<Note>> = noteDao.getAllNotes()

    suspend fun insert(note: Note){
        noteDao.insert(note)
    }
    suspend fun delete(note: Note){
        noteDao.delete(note)

    }
}