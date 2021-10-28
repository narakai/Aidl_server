package com.example.aidl_server

import android.app.Service
import android.content.Intent
import android.os.IBinder
import android.util.Log
import com.example.aidl_service.IRemoteAidlInterface
import com.example.aidl_service.Person

class RemoteService : Service() {
    private val TAG = "RemoteService"

    private var mPerson: Person = Person("", "")
    private var mName: String = ""
    private var mAge: String = ""

    override fun onBind(intent: Intent): IBinder {
        Log.d(TAG, "onBind Service success!")
        mPerson = Person("Leon", "30")
        return binder
    }

    override fun onUnbind(intent: Intent?): Boolean {
        return super.onUnbind(intent)
    }

    private val binder = object : IRemoteAidlInterface.Stub() {
        override fun basicTypes(
            anInt: Int,
            aLong: Long,
            aBoolean: Boolean,
            aFloat: Float,
            aDouble: Double,
            aString: String?
        ) {
        }

        override fun getPersonUserName(): String {
            mName = mPerson.mName
            Log.d(TAG, "Person mName = $mName")
            return mName
        }

        override fun getPersonUserAge(): String {
            mAge = mPerson.mAge
            Log.d(TAG, "Person mAge = $mAge")
            return mAge
        }

        override fun getPerson(): Person {
            return mPerson
        }

    }
}