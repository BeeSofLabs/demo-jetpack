package app.beelabs.com.demojetpack.module

import app.beelabs.com.demojetpack.R
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Named
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class AppModule {

    @Singleton
    @Provides
    @Named("message1")
    fun provideMessageString() = "Hallo this is message from module injection"

    @Singleton
    @Provides
    @Named("message2")
    fun provideMessageStringSecond() = "this is my second message"
}