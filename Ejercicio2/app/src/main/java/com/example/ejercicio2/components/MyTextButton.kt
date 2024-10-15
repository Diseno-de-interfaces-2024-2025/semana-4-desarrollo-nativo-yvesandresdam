package com.example.ejercicio2.components


import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier


@Composable
fun MyTextButton(modifier: Modifier = Modifier) {
    // Utilizamos un estado para cambiar el texto cuando el botón es presionado
    val buttonText = remember { mutableStateOf("Haz clic") }

    Button(
        onClick = {
            // Cambia el texto cuando el botón es presionado
            buttonText.value = "Hecho!"
        },
        modifier = modifier // Acepta el modificador pasado
    ) {
        Text(text = buttonText.value)
    }
}