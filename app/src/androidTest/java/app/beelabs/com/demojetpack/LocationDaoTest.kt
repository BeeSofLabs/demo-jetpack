package app.beelabs.com.demojetpack

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
import kotlinx.coroutines.test.runBlockingTest
import org.junit.After
import org.junit.Before
import org.junit.Rule
import org.junit.Test
import java.io.File
import javax.inject.Inject
import javax.inject.Named

@SmallTest
@ExperimentalCoroutinesApi
@HiltAndroidTest
class LocationDaoTest{

    @get:Rule
    var instantTaskExecutorRule = InstantTaskExecutorRule()

    @get:Rule
    var hiltRule = HiltAndroidRule(this)


    @Inject
    @Named("testDatabase")
    lateinit var db: MvvmDatabase

    private lateinit var dao: LocationDao

    @Before
    fun setUp() {

        hiltRule.inject()
        dao = db.locationDao()
    }

    @After
    fun tearDown() {
        db.close()
    }

    @Test
    fun insertLocationTesting() = runBlockingTest {
        assertThat("").isEqualTo("")
    }
}