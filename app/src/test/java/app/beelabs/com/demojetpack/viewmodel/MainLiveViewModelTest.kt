package app.beelabs.com.demojetpack.viewmodel

import androidx.arch.core.executor.testing.InstantTaskExecutorRule
import androidx.lifecycle.MutableLiveData
import app.beelabs.coconut.mvvm.base.Resource
import app.beelabs.com.demojetpack.model.api.response.LocationResponse
import app.beelabs.com.demojetpack.model.repository.LocationRepository
import app.beelabs.com.demojetpack.rule.MainCoroutineRule
import app.beelabs.com.demojetpack.util.getOrAwaitValue
import com.fasterxml.jackson.databind.ObjectMapper
import junit.framework.TestCase
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.delay
import kotlinx.coroutines.test.TestCoroutineDispatcher
import kotlinx.coroutines.test.resetMain
import kotlinx.coroutines.test.runBlockingTest
import org.hamcrest.MatcherAssert.assertThat
import org.hamcrest.core.Is.`is`
import org.junit.After
import org.junit.Before
import org.junit.Rule
import org.junit.Test
import org.mockito.Mockito
import java.nio.file.Paths

class MainLiveViewModelTest : TestCase() {

    @get:Rule
    var mainCoroutineRule = MainCoroutineRule()

    @get:Rule
    var rule = InstantTaskExecutorRule()

    private lateinit var viewModel: MainLiveViewModel
    val testDispatcher: TestCoroutineDispatcher = TestCoroutineDispatcher()
    private lateinit var repo: LocationRepository

    @Before
    public override fun setUp() {
        repo = Mockito.mock(LocationRepository::class.java)
        viewModel = MainLiveViewModel(repo)
    }

    @After
    fun tearDownDispatcher() {
        Dispatchers.resetMain()
        testDispatcher.cleanupTestCoroutines()
    }

    @Test
    fun testRemoteDataList() = runBlockingTest {

        var locationResponse: LocationResponse = ObjectMapper().readValue(
            Paths.get("src/test/resources/dataLocation.json").toFile(),
            LocationResponse::class.java
        )

        Mockito.`when`(repo.getLocationCaroutine())
            .thenReturn(Resource.Success(locationResponse))
        viewModel.getLocationLiveData()
            delay(5000)

        var resource = viewModel.location.getOrAwaitValue()

        assertThat("Hellow Mock suspend", `is`("Hellow Mock suspend"))
    }
}
