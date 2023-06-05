package com.example.daggerlearn.di

import com.example.daggerlearn.model.Name
import com.example.daggerlearn.model.Person
import dagger.Module
import dagger.Provides

@Module
class PersonModule {

    @Provides
    fun providePerson(
        name: Name
    ):Person{
        return Person(name)
    }

    @Provides
    fun provideName(): Name {
        return Name("Gamzat")
    }

}