package com.example.mynoteapps.ui.insert

import android.app.Application
import androidx.lifecycle.ViewModel
import com.example.mynoteapps.database.entity.Note
import com.example.mynoteapps.repository.NoteRepository

class NoteAddUpdateViewModel(application: Application): ViewModel() {
    private val mNoteRepository : NoteRepository = NoteRepository(application)

    fun insert(note: Note){
        mNoteRepository.insert(note)
    }

    fun delete(note: Note){
        mNoteRepository.delete(note)
    }

    fun update(note: Note){
        mNoteRepository.update(note)
    }
}