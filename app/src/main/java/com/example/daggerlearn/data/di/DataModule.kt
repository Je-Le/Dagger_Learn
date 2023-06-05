package com.example.daggerlearn.data.di

import com.example.daggerlearn.data.storage.di.StorageModule
import dagger.Module
import dagger.Provides

@Module(includes = [ StorageModule::class ])
class DataModule