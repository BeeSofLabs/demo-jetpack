package app.beelabs.com.demojetpack.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.viewModelScope
import app.beelabs.coconut.mvvm.base.BaseViewModel
import app.beelabs.coconut.mvvm.base.Resource
import app.beelabs.com.demojetpack.model.api.response.LocationResponse
import app.beelabs.com.demojetpack.model.pojo.LocationEntity
import app.beelabs.com.demojetpack.model.repository.LocationRepository
import app.beelabs.com.demojetpack.ui.interfaces.ILocationRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class MainLiveViewModel @Inject constructor(
    private val repository: ILocationRepository
) : BaseViewModel() {
    private var _location: MutableLiveData<Resource<LocationResponse>> = MutableLiveData()
    val location: LiveData<Resource<LocationResponse>> = _location


    private var _localLocation: MutableLiveData<List<LocationEntity>> = MutableLiveData()
    val localLocation: LiveData<List<LocationEntity>> = _localLocation

    fun getLocationLiveData() =
        viewModelScope.launch {
            val result = (repository as LocationRepository).getLocationCaroutine()
            _location.postValue(result)
        }

    fun getLocalLocation() {
        viewModelScope.launch {
            val list = (repository as LocationRepository).getLocalLocation()
            list.collect { values ->
                _localLocation.postValue(values)
            }
        }
    }

    fun insertLocalLocation(locationEntity: LocationEntity) {
        viewModelScope.launch {
            (repository as LocationRepository).insertLocalLocation(locationEntity)
        }

    }

}