package id.ferdinand.notes_app.feature_note.presentation.notes

import id.ferdinand.notes_app.feature_note.domain.model.Note
import id.ferdinand.notes_app.feature_note.domain.util.NoteOrder
import id.ferdinand.notes_app.feature_note.domain.util.OrderType

data class NotesState(
    val notes: List<Note> = emptyList(),
    val noteOrder: NoteOrder = NoteOrder.Date(OrderType.Descending),
    val isOrderSectionVisible: Boolean = false
)