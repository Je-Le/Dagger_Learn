package com.example.daggerlearn.presentation.screen.main.di

import com.example.daggerlearn.data.storage.repository.person.PersonStorageRepository
import com.example.daggerlearn.model.Person
import com.example.daggerlearn.presentation.screen.main.vm.MainViewModel
import dagger.Module
import dagger.Provides

@Module
class MainScreenModule {

    @Provides
    fun provideMainViewModel(
        person: Person,
        personStorageRepository: PersonStorageRepository
    ): MainViewModel{
        return MainViewModel(person,personStorageRepository)
    }

}