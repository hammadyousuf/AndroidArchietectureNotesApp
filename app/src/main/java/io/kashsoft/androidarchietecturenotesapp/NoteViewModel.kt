package io.kashsoft.androidarchietecturenotesapp

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class NoteViewModel(application: Application) : AndroidViewModel(application)  {
    private val respositry: NoteRespositry
    val allNotes: LiveData<List<Note>>

    init {
        val dao = NoteDatabase.getDatabase(application).getNoteDao()
        respositry = NoteRespositry(dao)
        allNotes = respositry.allNotes

    }
    fun deleteNote(note: Note) = viewModelScope.launch(Dispatchers.IO) {
    respositry.delete(note)

    }

    fun insertNote(note: Note) = viewModelScope.launch ( Dispatchers.IO ){
        respositry.insert(note)
    }
}