package com.example.daggerlearn

import android.app.Application
import com.example.daggerlearn.di.AppComponent
import com.example.daggerlearn.di.DaggerAppComponent

class App: Application() {

    lateinit var appComponent: AppComponent

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

    }

    companion object{

        lateinit var INSTANCE: App
            private set

    }
}