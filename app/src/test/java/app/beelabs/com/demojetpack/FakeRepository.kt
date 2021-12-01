//package app.beelabs.com.demojetpack
//
//import android.app.Application
//import android.content.Context
//import app.beelabs.coconut.mvvm.base.Resource
//import app.beelabs.com.demojetpack.model.api.response.LocationResponse
//import app.beelabs.com.demojetpack.model.pojo.LocationEntity
//import app.beelabs.com.demojetpack.model.repository.LocationRepository
//import app.beelabs.com.demojetpack.ui.interfaces.ILocationRepository
//import com.fasterxml.jackson.databind.ObjectMapper
//import kotlinx.coroutines.flow.Flow
//import java.io.File
//
//class FakeRepository : LocationRepository {
//    fun getLocationCaroutine(): Resource<LocationResponse> {
//        var locationResponse: LocationResponse = ObjectMapper().readValue(
//            File("data_source/dataLocation.json").toString(),
//            LocationResponse::class.java
//        )
//
//        return Resource.Success(locationResponse)
//    }
//
//    override fun getLocalLocation(application: Application): Flow<List<LocationEntity>> {
//        TODO("Not yet implemented")
//    }
//
//    override suspend fun insertLocalLocation(location: LocationEntity, context: Context) {
//        TODO("Not yet implemented")
//    }
//}