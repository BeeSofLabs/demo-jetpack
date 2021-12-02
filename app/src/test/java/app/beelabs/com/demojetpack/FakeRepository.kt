package app.beelabs.com.demojetpack

import androidx.lifecycle.MutableLiveData
import app.beelabs.coconut.mvvm.base.Resource
import app.beelabs.com.demojetpack.model.api.response.LocationResponse

class FakeRepository {

    private val locationLiveData = MutableLiveData<Resource<LocationResponse>>()


}