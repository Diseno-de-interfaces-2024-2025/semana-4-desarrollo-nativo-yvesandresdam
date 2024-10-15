package com.example.ejercicio2

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import com.example.ejercicio2.ui.theme.Ejercicio2Theme
import com.example.ejercicio2.components.MyTextButton
import com.example.ejercicio2.components.MyButtonText
import com.example.ejercicio2.components.MyButtonColor

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Ejercicio2Theme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->

                    // Boton Cambia de Color
                    MyButtonColor(modifier = Modifier.padding(innerPadding), Color.Yellow)


                    /*

                    // Boton Cambia el texto
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    MyButtonText(modifier = Modifier.padding(innerPadding))

                     */
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    Ejercicio2Theme {
        Greeting("Android")
    }
}