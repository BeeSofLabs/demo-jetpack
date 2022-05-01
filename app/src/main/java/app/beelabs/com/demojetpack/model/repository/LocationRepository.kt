package app.beelabs.com.demojetpack.model.repository

import app.beelabs.coconut.mvvm.base.BaseRepository
import app.beelabs.com.demojetpack.model.api.remote.SourceRemoteDataSource
import app.beelabs.com.demojetpack.model.api.response.LocationResponse
import app.beelabs.com.demojetpack.model.dao.LocationDao
import app.beelabs.com.demojetpack.model.pojo.LocationEntity
import app.beelabs.com.demojetpack.ui.interfaces.ILocationRepository
import io.reactivex.Observable
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers
import kotlinx.coroutines.Dispatchers.IO
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.flowOn
import javax.inject.Inject

open class LocationRepository @Inject constructor(
    private val remoteData: SourceRemoteDataSource,
    private val locationDao: LocationDao
) : BaseRepository(), ILocationRepository {

    fun getSourceDataRemoteRX(): Observable<LocationResponse?>? =
        remoteData.getSourceByRX()?.subscribeOn(Schedulers.io())
            ?.observeOn(AndroidSchedulers.mainThread())

    override suspend fun getLocationCaroutine() = safeApiCall { remoteData.getSourceByCallback() }


    // Database
    fun getLocalLocation(): Flow<List<LocationEntity>> =
        flow {
            emit(locationDao.getLocations())
        }.flowOn(IO)


    suspend fun insertLocalLocation(location: LocationEntity?) {
        locationDao.insertLocation(location)
    }

}