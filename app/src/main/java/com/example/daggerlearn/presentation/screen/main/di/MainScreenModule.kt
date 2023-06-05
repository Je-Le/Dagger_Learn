package com.example.daggerlearn.presentation.screen.main.di

import com.example.daggerlearn.model.Person
import com.example.daggerlearn.presentation.screen.main.vm.MainViewModel
import dagger.Module
import dagger.Provides

@Module
class MainScreenModule {

    @Provides
    fun provideMainViewModel(
        person: Person
    ): MainViewModel{
        return MainViewModel(person)
    }

}