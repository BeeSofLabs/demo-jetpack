package app.beelabs.com.demojetpack

import kotlinx.coroutines.ExperimentalCoroutinesApi
import kotlinx.coroutines.MainCoroutineDispatcher
import org.junit.rules.TestRule
import org.junit.runner.Description
import org.junit.runners.model.Statement

@ExperimentalCoroutinesApi
class MainCoroutineRule : TestRule{

    override fun apply(base: Statement?, description: Description?): Statement {
        TODO("Not yet implemented")
    }
}