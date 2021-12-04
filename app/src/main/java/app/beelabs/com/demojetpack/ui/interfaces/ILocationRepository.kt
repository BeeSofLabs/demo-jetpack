package app.beelabs.com.demojetpack.ui.interfaces

import android.app.Application
import android.content.Context
import app.beelabs.coconut.mvvm.base.Resource
import app.beelabs.com.demojetpack.model.api.response.LocationResponse
import app.beelabs.com.demojetpack.model.pojo.LocationEntity
import kotlinx.coroutines.flow.Flow


interface ILocationRepository {
//    suspend fun getLocationCaroutine(): Resource<LocationResponse>?
//
//    fun getLocalLocation(application: Application): Flow<List<LocationEntity>>
//
//    suspend fun insertLocalLocation(location: LocationEntity, context: Context)
}