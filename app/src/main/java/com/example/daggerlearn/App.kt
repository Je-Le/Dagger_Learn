package com.example.daggerlearn

import android.app.Application

class App: Application() {

    lateinit var appComponent: AppComponent

    override fun onCreate() {
        super.onCreate()
        INSTANCE = this
        appComponent = DaggerAppComponent.create()
    }

    companion object{

        lateinit var INSTANCE: App
            private set

    }
}