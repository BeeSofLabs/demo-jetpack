package app.beelabs.com.demojetpack.model.api.remote

import app.beelabs.com.demojetpack.model.api.Api
import javax.inject.Inject

class SourceRemoteDataSource @Inject constructor(private val api: Api) {
    fun getSourceByRX() =
        api.getNetwork().callApiRXSources(api.initHeader())

    suspend fun getSourceByCallback() =
        api.getNetwork().callApiSourcesCallback()
}