package com.example.daggerlearn

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Scaffold
import androidx.compose.material.Surface
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import com.example.daggerlearn.core.ext.appComponent
import com.example.daggerlearn.model.Person
import com.example.daggerlearn.presentation.screen.main.MainScreen
import com.example.daggerlearn.presentation.ui.theme.DaggerLearnTheme
import javax.inject.Inject

class MainActivity : ComponentActivity() {

    @Inject
    lateinit var person: Person

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        appComponent.inject(this)
        setContent {
            DaggerLearnTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    Scaffold {
                        Box(modifier = Modifier.padding(it)){
                            MainScreen()
                        }
                    }
                }
            }
        }
    }

}