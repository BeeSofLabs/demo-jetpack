package app.beelabs.com.demojetpack.module

import android.content.Context
import app.beelabs.com.demojetpack.R
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityComponent
import dagger.hilt.android.components.FragmentComponent
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.android.scopes.ActivityScoped
import dagger.hilt.android.scopes.FragmentScoped
import dagger.hilt.components.SingletonComponent
import javax.inject.Named

@Module
@InstallIn(FragmentComponent::class)
class MainModule {

    @FragmentScoped
    @Provides
    @Named("message3")
    fun provideMessageStringSecond(
    ) = "this is my main fragment message"
}