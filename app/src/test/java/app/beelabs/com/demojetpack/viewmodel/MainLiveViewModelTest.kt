package app.beelabs.com.demojetpack.viewmodel

import android.content.Context
import androidx.arch.core.executor.testing.InstantTaskExecutorRule
import androidx.room.Room
import androidx.test.core.app.ApplicationProvider
import androidx.test.filters.SmallTest
import app.beelabs.coconut.mvvm.base.interfaces.IApiService
import app.beelabs.com.demojetpack.model.api.Api
import app.beelabs.com.demojetpack.model.api.remote.SourceRemoteDataSource
import app.beelabs.com.demojetpack.model.api.response.LocationResponse
import app.beelabs.com.demojetpack.model.dao.LocationDao
import app.beelabs.com.demojetpack.model.dao.MvvmDatabase
import app.beelabs.com.demojetpack.model.repository.LocationRepository
import app.beelabs.com.demojetpack.util.getOrAwaitValueTest
import com.fasterxml.jackson.databind.ObjectMapper
import com.google.common.truth.Truth.assertThat
import dagger.hilt.android.testing.HiltAndroidRule
import dagger.hilt.android.testing.HiltAndroidTest
import junit.framework.TestCase
import kotlinx.coroutines.ExperimentalCoroutinesApi
import kotlinx.coroutines.runBlocking
import org.junit.After
import org.junit.Before
import org.junit.Rule
import org.junit.Test
import java.io.File
import javax.inject.Inject
import javax.inject.Named

@ExperimentalCoroutinesApi
@SmallTest
@HiltAndroidTest
class MainLiveViewModelTest : TestCase() {

    @get:Rule
    var hiltRule = HiltAndroidRule(this)

    @get:Rule
    var instantTaskExecutorRule = InstantTaskExecutorRule()

    @Inject
    @Named("app_db")
    lateinit var db: MvvmDatabase
    lateinit var dao: LocationDao

    private lateinit var viewModel: MainLiveViewModel
    private lateinit var apiService: IApiService

    @Before
    public override fun setUp() {
        super.setUp()
        val context = ApplicationProvider.getApplicationContext<Context>()

        hiltRule.inject()
//        val db = Room.inMemoryDatabaseBuilder(context, MvvmDatabase::class.java)
//            .allowMainThreadQueries().build()
        val dao = db.locationDao()
        val repo = LocationRepository(SourceRemoteDataSource(Api(apiService)), dao)
        viewModel = MainLiveViewModel(repo)
    }

    @After
    override fun tearDown() {
        db.close()
    }


    @Test
    fun testRemoteDataList() = runBlocking {
        var locationResponse: LocationResponse = ObjectMapper().readValue(
            File("data_source/dataLocation.json").toString(),
            LocationResponse::class.java
        )

        val value = viewModel.location.getOrAwaitValueTest()

        assertThat("").isEqualTo("")
    }

    @Test
    fun testLocalDataList() {

    }
}