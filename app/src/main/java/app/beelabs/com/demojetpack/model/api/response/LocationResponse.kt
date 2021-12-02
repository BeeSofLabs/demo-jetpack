package app.beelabs.com.demojetpack.model.api.response

import app.beelabs.coconut.mvvm.base.BaseResponse
import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.annotation.JsonProperty

@JsonIgnoreProperties(ignoreUnknown = true)
class LocationResponse() : BaseResponse() {

    @JsonProperty("data")
    var locationData: List<LocationData> = listOf()

    class LocationData {
        val id: Int = 0
        val name: String = ""
    }

}



