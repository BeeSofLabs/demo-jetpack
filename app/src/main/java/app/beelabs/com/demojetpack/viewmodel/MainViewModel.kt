package app.beelabs.com.demojetpack.viewmodel

import android.widget.Toast
import app.beelabs.coconut.mvvm.base.BaseViewModel
import app.beelabs.coconut.mvvm.base.interfaces.IView
import app.beelabs.coconut.mvvm.support.rx.RxObserver
import app.beelabs.com.coconut_mvvm.sample.ui.interfaces.IMainView
import app.beelabs.com.demojetpack.model.api.response.LocationResponse
import app.beelabs.com.demojetpack.model.repository.LocationRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class MainViewModel @Inject constructor(
    private val repository: LocationRepository
) : BaseViewModel() {

    fun getSource(iview: IView) {
        (repository as LocationRepository).getSourceDataRemoteRX()
            ?.subscribe(object : RxObserver<LocationResponse>(iview) {
                override fun onNext(o: Any) {
                    super.onNext(o)
                    val data = o as LocationResponse
                    when (iview) {
                        is IMainView -> iview.handleSourceResponseData(data)
                    }
                }

                override fun onError(e: Throwable) {
                    super.onError(e)
                    Toast.makeText(
                        iview.currentActivity,
                        "OnError: ${e.message}",
                        Toast.LENGTH_SHORT
                    ).show()
                }
            })
    }
}