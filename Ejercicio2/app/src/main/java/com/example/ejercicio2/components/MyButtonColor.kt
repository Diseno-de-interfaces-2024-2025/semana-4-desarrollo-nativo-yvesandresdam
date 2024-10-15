package com.example.ejercicio2.components


import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp


@Composable
fun MyButtonColor(modifier: Modifier = Modifier, colorBackButton: Color) {

        // Estado para saber si el botón está presionado
        val isPressed = remember { mutableStateOf(false) }

        Button(
            onClick = {
                // Cambia el estado al presionar el botón
                isPressed.value = !isPressed.value
            },
            colors = ButtonDefaults.buttonColors(
                containerColor = if (isPressed.value) colorBackButton else Color.DarkGray,
                contentColor = if (isPressed.value) Color.Black else Color.White
            ),
            border = if (isPressed.value ) BorderStroke(3.dp, Color.Black) else BorderStroke(1.dp, Color.Black),
            shape = if(isPressed.value ) RoundedCornerShape(4.dp) else RoundedCornerShape(20.dp),
            modifier = modifier
        ) {
            Text(text = if (isPressed.value) "Presionado" else "Pulsa aquí")
        }
}