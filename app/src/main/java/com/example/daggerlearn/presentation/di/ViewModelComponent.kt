package com.example.daggerlearn.presentation.di

import com.example.daggerlearn.presentation.screen.main.di.ViewModelModule
import com.example.daggerlearn.presentation.screen.main.vm.MainViewModel
import dagger.Subcomponent

@Subcomponent(
     modules = [
          ViewModelModule::class
     ]
)
interface ViewModelComponent{

     @Subcomponent.Builder
     interface Builder{

          fun build(): ViewModelComponent
     }

     fun mainViewModel(): MainViewModel

}