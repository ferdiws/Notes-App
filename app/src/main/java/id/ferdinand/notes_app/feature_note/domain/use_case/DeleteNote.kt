package id.ferdinand.notes_app.feature_note.domain.use_case

import id.ferdinand.notes_app.feature_note.domain.model.Note
import id.ferdinand.notes_app.feature_note.domain.repository.NoteRepository

class DeleteNote(
    private val repository: NoteRepository
) {
    suspend operator fun invoke(note: Note) {
        repository.deleteNote(note)
    }
}