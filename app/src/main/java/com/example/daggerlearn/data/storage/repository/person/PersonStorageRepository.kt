package com.example.daggerlearn.data.storage.repository.person

import com.example.daggerlearn.model.Person

interface PersonStorageRepository {

    suspend fun setPerson(person: Person)

    suspend fun getPerson(): Person

}