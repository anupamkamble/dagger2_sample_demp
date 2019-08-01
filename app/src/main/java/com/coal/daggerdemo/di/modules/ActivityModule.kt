package com.coal.daggerdemo.di.modules

import android.app.Activity
import android.content.Context
import com.coal.daggerdemo.ApplicationClass
import com.coal.daggerdemo.data.local.DataBaseService
import com.coal.daggerdemo.data.remote.NetworkService
import com.coal.daggerdemo.ui.MainViewModel
import dagger.Module
import dagger.Provides


@Module
class ActivityModule(var activityContext: Activity, var applicationClass: ApplicationClass) {

    @Provides
    fun provideActivityContext():ApplicationClass{
        return  applicationClass
    }
}