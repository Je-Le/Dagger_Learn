package com.example.daggerlearn.di

import com.example.daggerlearn.data.di.DataModule
import com.example.daggerlearn.di.PersonModule
import com.example.daggerlearn.presentation.di.PresentationModule
import com.example.daggerlearn.presentation.di.ViewModelComponent
import dagger.Module

@Module(
    includes = [
        PersonModule::class,
        PresentationModule::class,
        DataModule::class
    ],
    subcomponents = [
        ViewModelComponent::class
    ]
)
class AppModule