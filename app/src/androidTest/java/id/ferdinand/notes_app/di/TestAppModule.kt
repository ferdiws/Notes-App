package id.ferdinand.notes_app.di

import android.app.Application
import androidx.room.Room
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import id.ferdinand.notes_app.feature_note.data.data_source.NoteDatabase
import id.ferdinand.notes_app.feature_note.data.repository.NoteRepositoryImpl
import id.ferdinand.notes_app.feature_note.domain.repository.NoteRepository
import id.ferdinand.notes_app.feature_note.domain.use_case.AddNote
import id.ferdinand.notes_app.feature_note.domain.use_case.DeleteNote
import id.ferdinand.notes_app.feature_note.domain.use_case.GetNote
import id.ferdinand.notes_app.feature_note.domain.use_case.GetNotes
import id.ferdinand.notes_app.feature_note.domain.use_case.NoteUseCases
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object TestAppModule {
    @Provides
    @Singleton
    fun provideNoteDatabase(app: Application): NoteDatabase {
        return Room.inMemoryDatabaseBuilder(
            app,
            NoteDatabase::class.java,
        ).build()
    }

    @Provides
    @Singleton
    fun provideNoteRepository(db: NoteDatabase): NoteRepository {
        return NoteRepositoryImpl(db.noteDao)
    }

    @Provides
    @Singleton
    fun provideNoteUseCases(repository: NoteRepository): NoteUseCases {
        return NoteUseCases(
            getNotes = GetNotes(repository),
            deleteNote = DeleteNote(repository),
            addNote = AddNote(repository),
            getNote = GetNote(repository)
        )
    }
}