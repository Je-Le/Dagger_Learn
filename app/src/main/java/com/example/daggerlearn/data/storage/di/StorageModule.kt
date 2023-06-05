package com.example.daggerlearn.data.storage.di

import android.content.Context
import android.content.SharedPreferences
import com.example.daggerlearn.data.storage.repository.person.PersonStorageRepository
import com.example.daggerlearn.data.storage.repository.person.PersonStorageRepositoryImpl
import dagger.Module
import dagger.Provides

@Module
class StorageModule {

    @Provides
    fun providePersonRepository(
        sharedPreferences: SharedPreferences
    ):PersonStorageRepository{
        return PersonStorageRepositoryImpl(sharedPreferences = sharedPreferences)
    }

    @Provides
    fun providePersonSharedPreference(
        context: Context
    ): SharedPreferences{
        return context.getSharedPreferences("Person",Context.MODE_PRIVATE)
    }

}