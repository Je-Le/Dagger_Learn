package com.example.daggerlearn.presentation.screen.main.vm

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.daggerlearn.data.storage.repository.person.PersonStorageRepository
import com.example.daggerlearn.model.Name
import com.example.daggerlearn.model.Person
import kotlinx.coroutines.launch
import javax.inject.Inject

class MainViewModel @Inject constructor(
    private val person: Person,
    private val personStorageRepository: PersonStorageRepository
): ViewModel() {

    private val _state: MutableLiveData<String> = MutableLiveData("Nothing founded")
    val state = _state

    init {
        getPersonFromStorage()
    }

    fun setPersonToStorage(text: String){
        val person = Person(
            Name(
                text
            )
        )
        viewModelScope.launch {
            personStorageRepository.setPerson(person)
            _state.postValue(
                personStorageRepository.getPerson().name.name
            )
        }
    }

    fun getPersonFromStorage(){
        viewModelScope.launch {
            _state.postValue(
                personStorageRepository.getPerson().name.name
            )
        }
    }

    fun setStateToDefault(){
        _state.value = person.name.name
    }

}