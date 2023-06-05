package com.example.daggerlearn

import android.app.Application
import com.example.daggerlearn.di.AppComponent
import com.example.daggerlearn.di.DaggerAppComponent
import com.example.daggerlearn.presentation.di.ViewModelComponent

class App: Application() {

    lateinit var appComponent: AppComponent
    lateinit var viewModelComponent: ViewModelComponent

    override fun onCreate() {
        super.onCreate()
        init()
    }

    private fun init() {
        INSTANCE = this
        appComponent = DaggerAppComponent
            .builder()
            .context(this)
            .build()
        viewModelComponent = appComponent.viewModelComponent().build()
    }

    companion object{

        lateinit var INSTANCE: App
            private set

    }
}