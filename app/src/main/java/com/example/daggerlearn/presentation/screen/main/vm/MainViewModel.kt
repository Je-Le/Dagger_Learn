package com.example.daggerlearn.presentation.screen.main.vm

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.daggerlearn.model.Person
import javax.inject.Inject

class MainViewModel @Inject constructor(
    private val person: Person
): ViewModel() {

    private val _state: MutableLiveData<String> = MutableLiveData(person.name.name)
    val state = _state

    fun setState(text: String){
        _state.value = text
    }

    fun setStateToDefault(){
        _state.value = person.name.name
    }

}