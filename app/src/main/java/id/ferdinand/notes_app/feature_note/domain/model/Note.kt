package id.ferdinand.notes_app.feature_note.domain.model

import androidx.room.Entity
import androidx.room.PrimaryKey
import id.ferdinand.notes_app.ui.theme.RedOrange
import id.ferdinand.notes_app.ui.theme.RedPink
import id.ferdinand.notes_app.ui.theme.BabyBlue
import id.ferdinand.notes_app.ui.theme.Violet
import id.ferdinand.notes_app.ui.theme.LightGreen

@Entity
data class Note(
    val title: String,
    val content: String,
    val timestamp: Long,
    val color: Int,
    @PrimaryKey val id: Int? = null
) {
    companion object {
        val noteColors = listOf(RedOrange, RedPink, BabyBlue, Violet, LightGreen)
    }
}

class InvalidNoteException(message: String): Exception(message)