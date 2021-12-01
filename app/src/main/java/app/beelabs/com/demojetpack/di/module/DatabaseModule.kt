package app.beelabs.com.demojetpack.di.module

import android.content.Context
import app.beelabs.com.demojetpack.model.dao.LocationDao
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
class DatabaseModule {

    @Provides
    @Singleton
    @Named("app_dao")
    fun provideLocationDao(database: MvvmDatabase) : LocationDao = database.locationDao()

    @Provides
    @Singleton
    @Named("app_db")
    fun provideDatabase(@ApplicationContext context: Context): MvvmDatabase =
        MvvmDatabase.getDatabase(context)
}