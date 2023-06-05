package com.example.daggerlearn.di

import android.content.Context
import com.example.daggerlearn.MainActivity
import com.example.daggerlearn.data.storage.repository.person.PersonStorageRepository
import com.example.daggerlearn.model.Person
import com.example.daggerlearn.presentation.screen.main.vm.MainViewModel
import dagger.BindsInstance
import dagger.Component

@Component( modules = [ AppModule::class ] )
interface AppComponent {
    @Component.Builder
    interface Builder{

        @BindsInstance
        fun context(context: Context): Builder

        fun build(): AppComponent

    }
    fun personStorageRepository(): PersonStorageRepository
    fun person(): Person
    fun mainViewModel(): MainViewModel

    fun inject(mainActivity: MainActivity)

}