package com.example.daggerlearn

import com.example.daggerlearn.model.Person
import com.example.daggerlearn.presentation.screen.main.vm.MainViewModel
import dagger.Component
import dagger.Provides

@Component( modules = [AppModule::class] )
interface AppComponent {

    fun person(): Person
    fun mainViewModel(): MainViewModel

    fun inject(mainActivity: MainActivity)

}