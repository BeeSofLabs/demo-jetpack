package app.beelabs.com.demojetpack.session1.model

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class User(
    val name: String,
    val address: String,
    val age: Int
) : Parcelable
