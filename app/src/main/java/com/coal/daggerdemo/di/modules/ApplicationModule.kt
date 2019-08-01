package com.coal.di.modules

import android.app.Activity
import android.app.Application
import com.coal.daggerdemo.ApplicationClass
import com.coal.daggerdemo.data.local.DataBaseService
import com.coal.daggerdemo.data.remote.NetworkService
import com.coal.daggerdemo.di.qulifiers.DBInfo
import com.coal.daggerdemo.di.qulifiers.NetWorkInfo
import dagger.Module
import dagger.Provides
import javax.inject.Singleton


@Module
public class ApplicationModule(var application: ApplicationClass) {


    @Provides
    fun provideApplicationClass(): ApplicationClass {
        return  application
    }

    @Provides
    public fun provideDatabaseVersion():Int{
        return 1
    }

    @Provides
    public fun provideNetWorkApiKey(): String{
        return "API_KEY"
    }



//    @Singleton
//    @Provides
//    public fun provideNetWorkService(): NetworkService {
//        return NetworkService("API_KEY")
//    }
//
//    @Singleton
//    @Provides
//    public  fun  provideDataBaseService(): DataBaseService {
//        return DataBaseService(1, application)
//    }
}