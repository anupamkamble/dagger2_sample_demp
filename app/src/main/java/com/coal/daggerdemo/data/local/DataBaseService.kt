package com.coal.daggerdemo.data.local

import android.app.Application
import com.coal.daggerdemo.ApplicationClass
import com.coal.daggerdemo.di.qulifiers.DBInfo
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
public class DataBaseService() {

    @Inject
    constructor(application: ApplicationClass, dbVersion : Int):this() {

    }
}