package app.beelabs.com.demojetpack

import androidx.test.ext.junit.runners.AndroidJUnit4
import app.beelabs.com.demojetpack.model.repository.LocationRepository
import dagger.hilt.android.testing.HiltAndroidRule
import dagger.hilt.android.testing.HiltAndroidTest
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith
import javax.inject.Inject

@HiltAndroidTest
@RunWith(AndroidJUnit4::class)
class MainTest {

    @get:Rule
    val hiltRule = HiltAndroidRule(this)

    @Inject
    lateinit var repo: LocationRepository

    @Test
    fun testLocation() {
        hiltRule.inject()
    }
}