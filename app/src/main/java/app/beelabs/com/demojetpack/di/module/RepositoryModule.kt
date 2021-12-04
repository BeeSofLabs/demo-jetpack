package app.beelabs.com.demojetpack.di.module

import app.beelabs.com.demojetpack.model.repository.LocationRepository
import app.beelabs.com.demojetpack.ui.interfaces.ILocationRepository
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ViewModelComponent
import dagger.hilt.android.scopes.ViewModelScoped

@Module
@InstallIn(ViewModelComponent::class)
abstract class RepositoryModule {

    @Binds
    @ViewModelScoped
    abstract fun bindRepository(locationRepository: LocationRepository): ILocationRepository
}