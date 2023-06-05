package com.example.daggerlearn.core.ext

import android.content.Context
import com.example.daggerlearn.App
import com.example.daggerlearn.di.AppComponent
import com.example.daggerlearn.presentation.di.ViewModelComponent

val Context.appComponent: AppComponent
    get() = when(this){

        is App -> appComponent

        else -> applicationContext.appComponent

    }

val Context.viewModelStore: ViewModelComponent
    get() = when(this){

        is App -> viewModelComponent

        else -> applicationContext.viewModelStore

    }