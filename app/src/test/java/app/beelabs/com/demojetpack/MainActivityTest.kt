package app.beelabs.com.demojetpack

import android.content.Context
import org.junit.Assert.*
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith
import org.junit.runner.manipulation.Ordering
import org.mockito.Mock
import org.mockito.runners.MockitoJUnitRunner


@RunWith(AndroidJUnit4::class)
class MainActivityTest {
    @Mock
    private lateinit var mockContext: Context
    @get:Rule
    var activityTestRule = Activity(MainActivity::class.java)


    @Test
    fun `get valid text return`(){

        assertEquals("", "")
    }
}