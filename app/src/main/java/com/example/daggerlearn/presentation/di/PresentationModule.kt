package com.example.daggerlearn.presentation.di

import com.example.daggerlearn.presentation.screen.main.di.MainScreenModule
import dagger.Module

@Module( includes = [ MainScreenModule::class ] )
class PresentationModule {
}