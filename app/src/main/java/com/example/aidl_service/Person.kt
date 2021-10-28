package com.example.aidl_service

import android.os.Parcelable
import kotlinx.parcelize.Parcelize


@Parcelize
data class Person(
    val mName: String,
    val mAge: String
) : Parcelable