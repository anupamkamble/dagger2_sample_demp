package com.coal.daggerdemo.ui

import com.coal.daggerdemo.data.local.DataBaseService
import com.coal.daggerdemo.data.remote.NetworkService
import javax.inject.Inject


public  class MainViewModel {

    lateinit var networkService: NetworkService
    lateinit var dbService: DataBaseService

    @Inject
    constructor(networkService: NetworkService, dataBaseService: DataBaseService){
        this.networkService = networkService
        this.dbService = dataBaseService
    }
}