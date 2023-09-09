package id.ferdinand.notes_app.feature_note.presentation.add_edit_note

data class NoteTextFieldState(
    val text: String = "",
    val hint: String = "",
    val isHistVisible: Boolean = true
)