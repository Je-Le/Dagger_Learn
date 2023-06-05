package com.example.daggerlearn.core.ext

import android.content.Context
import com.example.daggerlearn.App
import com.example.daggerlearn.di.AppComponent

val Context.appComponent: AppComponent
    get() = when(this){

        is App -> appComponent

        else -> applicationContext.appComponent

    }