package com.coal.daggerdemo.di.component

import com.coal.daggerdemo.di.modules.ActivityModule
import com.coal.daggerdemo.di.scope.ActivityScope
import com.coal.daggerdemo.ui.MainActivity
import dagger.Component


@ActivityScope
@Component(dependencies = [ServiceComponent::class],modules = [ActivityModule::class])
public interface ActivityComponent{
    fun inject(activity:MainActivity)
}