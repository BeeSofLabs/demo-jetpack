package app.beelabs.com.demojetpack

import androidx.lifecycle.MutableLiveData
import app.beelabs.coconut.mvvm.base.Resource
import app.beelabs.com.demojetpack.model.api.response.LocationResponse
import app.beelabs.com.demojetpack.ui.interfaces.ILocationRepository

class FakeRepository : ILocationRepository {

    private val locationLiveData = MutableLiveData<Resource<LocationResponse>>()


}