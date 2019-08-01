package com.coal.daggerdemo.data.remote

import android.app.Application
import com.coal.daggerdemo.ApplicationClass
import com.coal.daggerdemo.di.qulifiers.NetWorkInfo
import javax.inject.Inject
import javax.inject.Singleton


@Singleton
class NetworkService() {

    @Inject
    constructor(apiKey: String) : this() {
    }
}