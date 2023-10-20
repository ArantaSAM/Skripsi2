package com.example.skripsi2.Data

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Layanan(
    var nama: String = "",
    var url: String = "",
    var gambar: Int
) : Parcelable
