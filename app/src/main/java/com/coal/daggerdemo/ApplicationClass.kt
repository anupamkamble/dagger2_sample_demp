package com.coal.daggerdemo

import android.app.Application
import android.util.Log
import com.coal.daggerdemo.data.local.DataBaseService
import com.coal.daggerdemo.data.remote.NetworkService
import com.coal.daggerdemo.di.component.DaggerServiceComponent
import com.coal.daggerdemo.di.component.ServiceComponent
import com.coal.di.modules.ApplicationModule
import javax.inject.Inject

public class ApplicationClass : Application(){

    val TAG = "ApplicationClass"

    @Inject
    lateinit var netWorkInstant: NetworkService

    @Inject
    lateinit var dbService: DataBaseService

    lateinit var component : ServiceComponent

    override fun onCreate() {
        super.onCreate()
        component =  DaggerServiceComponent
            .builder()
            .applicationModule(ApplicationModule(this@ApplicationClass))
            .build()

        component.inject(this)


        Log.e(TAG,netWorkInstant.toString())
        Log.e(TAG,dbService.toString())
    }
}