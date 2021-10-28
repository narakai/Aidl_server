// IRemoteAidlInterface.aidl
package com.example.aidl_service;

// Declare any non-default types here with import statements
import com.example.aidl_service.Person;

interface IRemoteAidlInterface {
    /**
     * Demonstrates some basic types that you can use as parameters
     * and return values in AIDL.
     */
    void basicTypes(int anInt, long aLong, boolean aBoolean, float aFloat,
            double aDouble, String aString);

    String getPersonUserName();
    String getPersonUserAge();
    Person getPerson();
}