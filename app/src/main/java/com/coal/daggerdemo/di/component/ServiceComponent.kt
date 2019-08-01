package com.coal.daggerdemo.di.component

import android.app.Application
import com.coal.daggerdemo.ApplicationClass
import com.coal.daggerdemo.data.local.DataBaseService
import com.coal.daggerdemo.data.remote.NetworkService
import com.coal.daggerdemo.ui.MainActivity
import com.coal.di.modules.ApplicationModule
import dagger.Component
import javax.inject.Singleton


@Singleton
@Component(modules = [ApplicationModule::class])
public interface ServiceComponent {
    public fun inject(application: ApplicationClass)

    public fun getNetWorkService():NetworkService
    public fun getDataBaseService():DataBaseService
}