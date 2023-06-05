package com.example.daggerlearn.data.storage.repository.person

import android.content.Context
import android.content.SharedPreferences
import com.example.daggerlearn.model.Name
import com.example.daggerlearn.model.Person
import javax.inject.Inject

private const val PERSON_SP = "PersonName"
private const val NULL_TEXT = "Nothing here"

class PersonStorageRepositoryImpl(
    private val sharedPreferences: SharedPreferences
): PersonStorageRepository {

    override suspend fun setPerson(person: Person) {
        sharedPreferences.edit()
            .putString(PERSON_SP,person.name.name)
            .apply()
    }

    override suspend fun getPerson(): Person {
        val personName = sharedPreferences.getString(PERSON_SP, NULL_TEXT)!!
        return Person(
            Name(
                personName
            )
        )
    }
}