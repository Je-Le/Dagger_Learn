package com.example.daggerlearn.di

import com.example.daggerlearn.data.di.DataModule
import com.example.daggerlearn.di.PersonModule
import com.example.daggerlearn.presentation.di.PresentationModule
import dagger.Module

@Module( includes = [ PersonModule::class, PresentationModule::class,DataModule::class ] )
class AppModule