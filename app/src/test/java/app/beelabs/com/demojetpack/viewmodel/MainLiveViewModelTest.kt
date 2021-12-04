package app.beelabs.com.demojetpack.viewmodel

import androidx.arch.core.executor.testing.InstantTaskExecutorRule
import app.beelabs.com.demojetpack.FakeRepository
import app.beelabs.com.demojetpack.rule.MainCoroutineRule
import app.beelabs.com.demojetpack.model.api.response.LocationResponse
import app.beelabs.com.demojetpack.model.repository.LocationRepository
import app.beelabs.com.demojetpack.util.getOrAwaitValueTest
import com.fasterxml.jackson.databind.ObjectMapper
import com.google.common.truth.Truth.assertThat
import junit.framework.TestCase
import kotlinx.coroutines.ExperimentalCoroutinesApi
import kotlinx.coroutines.runBlocking
import org.junit.After
import org.junit.Before
import org.junit.Rule
import org.junit.Test
import org.mockito.Mock
import org.mockito.MockitoAnnotations
import java.nio.file.Paths

@ExperimentalCoroutinesApi
class MainLiveViewModelTest : TestCase() {

    @get:Rule
    var mainCoroutineRule = MainCoroutineRule()

    @get:Rule
    var instantTaskExecutorRule = InstantTaskExecutorRule()


    private lateinit var viewModel: MainLiveViewModel

    @Before
    public override fun setUp() {
//        MockitoAnnotations.initMocks(this);
        val repo = FakeRepository()
        viewModel = MainLiveViewModel(repo)
    }

    @After
    override fun tearDown() {
//        db.close()
    }


    @Test
    fun testRemoteDataList() = runBlocking {
//        var inputStream = javaClass.classLoader?.getResourceAsStream("dataLocation.json")
        var locationResponse: LocationResponse = ObjectMapper().readValue(
            Paths.get("src/test/resources/dataLocation.json").toFile(),
            LocationResponse::class.java
        )
//
        val value = viewModel.location.getOrAwaitValueTest()

        assertThat("").isEqualTo("")
    }

    @Test
    fun testLocalDataList() {

    }
}