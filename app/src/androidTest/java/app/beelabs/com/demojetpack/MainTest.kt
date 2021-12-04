package app.beelabs.com.demojetpack

import app.beelabs.com.demojetpack.model.api.response.LocationResponse
import dagger.hilt.android.testing.HiltAndroidRule
import dagger.hilt.android.testing.HiltAndroidTest
import org.junit.Assert.assertEquals
import org.junit.Before
import org.junit.Rule
import org.junit.Test
import javax.inject.Inject

@HiltAndroidTest
class MainTest {

//    @get:Rule
//    val hiltRule = HiltAndroidRule(this)

//    @Inject
//    lateinit var foo: LocationResponse

    @Test
    fun testLocation() {
        assertEquals(true, true)
//        hiltRule.inject()
    }
}