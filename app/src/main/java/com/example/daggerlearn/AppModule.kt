package com.example.daggerlearn

import com.example.daggerlearn.di.PersonModule
import com.example.daggerlearn.presentation.di.PresentationModule
import dagger.Module

@Module( includes = [ PersonModule::class, PresentationModule::class ] )
class AppModule