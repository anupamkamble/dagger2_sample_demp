package com.coal.daggerdemo.ui

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.coal.daggerdemo.ApplicationClass
import com.coal.daggerdemo.R
import com.coal.daggerdemo.di.component.DaggerActivityComponent
import com.coal.daggerdemo.di.modules.ActivityModule
import javax.inject.Inject


class MainActivity : AppCompatActivity() {

    val TAG = "MainActivity"

    @Inject
    lateinit var mainViewModel: MainViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        DaggerActivityComponent.builder()
            .activityModule(ActivityModule(this ,application as ApplicationClass))
            .serviceComponent((application as ApplicationClass).component)
            .build()
            .inject(this)

        Log.e(TAG,mainViewModel.toString())

    }
}