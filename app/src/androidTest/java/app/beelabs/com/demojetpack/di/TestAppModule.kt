package app.beelabs.com.demojetpack.di

import android.content.Context
import androidx.room.Room
import app.beelabs.com.demojetpack.model.dao.MvvmDatabase
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Named
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class TestAppModule {

    @Provides
    @Named("testDatabase")
    fun provideInMemoryDb(@ApplicationContext context: Context) =
        Room.inMemoryDatabaseBuilder(context, MvvmDatabase::class.java)
            .allowMainThreadQueries()
            .build()
}