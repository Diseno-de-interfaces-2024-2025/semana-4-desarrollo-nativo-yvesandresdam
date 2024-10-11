package com.example.ejercicio1

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.em
import androidx.compose.ui.unit.sp
import com.example.ejercicio1.ui.Components.MyTextFunction
import com.example.ejercicio1.ui.theme.Ejercicio1Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Ejercicio1Theme {
                Scaffold(modifier = Modifier.fillMaxSize())

                // He añadido llamadas a la misma funcion 'MyTextFunction' con
                // distintos parametros.
                // Aunque el ejercicio no lo pedia,
                // he utilizado la disposicion en columna

                { innerPadding ->

                    Column(Modifier.padding(innerPadding)) {
                        MyTextFunction(
                            name = "Testing First",
                            size = 15.em,
                            fontColor = Color.Green
                        )
                        MyTextFunction(
                            name = "Testing Second",
                            size = 7.em,
                            fontColor = Color.Blue
                        )
                        MyTextFunction(
                            name = "Testing Last",
                            size = 30.sp,
                            fontColor = Color.LightGray
                        )
                    }
                }
            }
        }
    }
}


// Funcion que muestra en la ventana 'Preview' el resultado de llamar
// al componente MyTextDisplay
@Preview(showBackground = true)
@Composable
fun MyTextDisplay() {
    Ejercicio1Theme {
        MyTextFunction("displayingTest", 15.em, Color.Magenta)
    }
}


/*
// Funcion que viene por defecto con Android Studio

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

// Funcion que viene por defecto con Android Studio
@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    Ejercicio1Theme {
        Greeting("Android")
    }
}

 */