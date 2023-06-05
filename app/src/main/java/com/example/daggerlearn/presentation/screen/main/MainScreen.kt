package com.example.daggerlearn.presentation.screen.main

import androidx.compose.foundation.layout.*
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.material.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.livedata.observeAsState
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.daggerlearn.core.ext.appComponent
import com.example.daggerlearn.presentation.screen.main.vm.MainViewModel

@Composable
fun MainScreen() {

    val context = LocalContext.current

    val viewModel = viewModel(initializer = {context.appComponent.mainViewModel()})

    val state = viewModel.state.observeAsState().value!!
    val inputText = remember {
        mutableStateOf("")
    }

    Column(
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .fillMaxSize()
            .padding(horizontal = 20.dp)
    ){
        Text(text = state)

        TextField(
            value = inputText.value,
            onValueChange = { inputText.value = it },
            modifier = Modifier
                .padding(top = 30.dp, bottom = 10.dp)
                .fillMaxWidth()
        )

        Button(onClick = { viewModel.setState(inputText.value) },
            modifier = Modifier.padding(bottom = 10.dp)) {
            Text(text = "Set text")
        }
        Button(onClick = { viewModel.setStateToDefault() }) {
            Text(text = "To default")
        }

    }



}