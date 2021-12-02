package app.beelabs.com.demojetpack.viewmodel

import android.app.Application
import android.content.Context
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.viewModelScope
import app.beelabs.coconut.mvvm.base.BaseViewModel
import app.beelabs.coconut.mvvm.base.Resource
import app.beelabs.com.demojetpack.model.api.response.LocationResponse
import app.beelabs.com.demojetpack.model.pojo.LocationEntity
import app.beelabs.com.demojetpack.model.repository.LocationRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class MainLiveViewModel @Inject constructor(
    private val repository: LocationRepository
) : BaseViewModel() {

    private val _location: MutableLiveData<Resource<LocationResponse>> = MutableLiveData()
    val location: LiveData<Resource<LocationResponse>> = _location

    private val _localLocation: MutableLiveData<List<LocationEntity>> = MutableLiveData()
    val localLocation: LiveData<List<LocationEntity>> = _localLocation

    fun getLocationLiveData() =
        viewModelScope.launch {
            _location.value = (repository as LocationRepository).getLocationCaroutine()
        }

    fun getLocalLocation(application: Application) {
        viewModelScope.launch {
            val list = (repository as LocationRepository).getLocalLocation(application)
            list.collect { values ->
                _localLocation.postValue(values)
            }
        }


    }

    suspend fun insertLocalLocation(local: LocationEntity, context: Context) {
        (repository as LocationRepository).insertLocalLocation(local, context)
    }

}