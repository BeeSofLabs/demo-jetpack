package app.beelabs.com.demojetpack

import android.app.Application
import androidx.arch.core.executor.testing.InstantTaskExecutorRule
import androidx.lifecycle.LiveData
import app.beelabs.coconut.mvvm.base.BaseRepository
import app.beelabs.coconut.mvvm.base.Resource
import app.beelabs.coconut.mvvm.support.util.DataUtil
import app.beelabs.com.demojetpack.model.api.response.LocationResponse
import app.beelabs.com.demojetpack.model.repository.LocationRepository
import app.beelabs.com.demojetpack.rule.TestCoroutineRule
import app.beelabs.com.demojetpack.viewmodel.MainLiveViewModel
import app.beelabs.com.demojetpack.viewmodel.MainViewModel
import com.fasterxml.jackson.databind.ObjectMapper
import org.junit.Before
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith
import org.mockito.Mockito
import org.mockito.Mockito.mock
import org.mockito.junit.MockitoJUnit
import org.mockito.junit.MockitoJUnitRunner
import org.mockito.junit.MockitoRule
import java.io.File

@RunWith(MockitoJUnitRunner::class)
class MainViewModelTest{

    @Rule
    @JvmField
    val instantTaskExecutorRule = InstantTaskExecutorRule()

    @Rule
    @JvmField
    val testCoroutineRule = TestCoroutineRule()

    @Rule
    @JvmField
    var initRule: MockitoRule = MockitoJUnit.rule()

    private val application = Mockito.mock(Application::class.java)

    private val locationRepository = Mockito.mock(LocationRepository::class.java)

    private var viewModel: MainLiveViewModel? = null
    private lateinit var locations: LiveData<Resource<LocationResponse>>

    private var locationResponse: LocationResponse? = null
    @Before
    suspend fun setup() {
        locationResponse = ObjectMapper().readValue(
            File("data_source/dataLocation.json").toString(),
            LocationResponse::class.java
        )

        val result = Resource.Success(locationResponse)
        Mockito.doReturn(result).`when`(locationRepository).getLocationCaroutine()

        viewModel = MainLiveViewModel(locationRepository)
    }

    @Test
    fun checkDataListLocation(){
        // Given

        // When

        // Then
    }

}