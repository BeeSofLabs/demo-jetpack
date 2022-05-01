package app.beelabs.com.demojetpack.ui.interfaces

import app.beelabs.coconut.mvvm.base.Resource
import app.beelabs.com.demojetpack.model.api.response.LocationResponse


interface ILocationRepository {
    suspend fun getLocationCaroutine(): Resource<LocationResponse>?

//    suspend fun getTextTest(): String
//    fun getLocalLocation(application: Application): Flow<List<LocationEntity>>
//
//    suspend fun insertLocalLocation(location: LocationEntity, context: Context)
}