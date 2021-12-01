//package app.beelabs.com.demojetpack
//
//import androidx.arch.core.executor.testing.InstantTaskExecutorRule
//import app.beelabs.coconut.mvvm.base.Resource
//import app.beelabs.com.demojetpack.model.api.response.LocationResponse
//import app.beelabs.com.demojetpack.viewmodel.MainLiveViewModel
//import com.fasterxml.jackson.databind.ObjectMapper
//import kotlinx.coroutines.ExperimentalCoroutinesApi
//import kotlinx.coroutines.test.runBlockingTest
//import org.junit.Assert
//import org.junit.Before
//import org.junit.Rule
//import org.junit.Test
//import org.junit.runner.RunWith
//import org.mockito.Mockito
//import org.mockito.junit.MockitoJUnitRunner
//import java.io.File
//
//@RunWith(MockitoJUnitRunner::class)
//class MainViewModelTest {
//
//    @get:Rule
//    var instantTaskExecutorRule = InstantTaskExecutorRule()
//
//    @get:Rule
//    var mainCoroutineRule = MainCoroutineRule()
//
//    private lateinit var viewModel: MainLiveViewModel
//
//    @Before
//    fun setup() {
//        viewModel = MainLiveViewModel(FakeRepository())
//    }
//
//    @ExperimentalCoroutinesApi
//    @Test
//    fun testListLocation() = runBlockingTest {
//        // Given
//
////        lateinit var locations: LiveData<Resource<LocationResponse>>
//
//
//        // When
//        viewModel?.getLocationLiveData()
//
//        // Then
//        val data = viewModel?.location?.value
//        Assert.assertEquals("", "")
//    }
//
//}