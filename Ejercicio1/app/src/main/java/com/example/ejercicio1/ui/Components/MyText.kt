package com.example.ejercicio1.ui.Components

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.TextUnit

@Composable
fun MyTextFunction(name: String, size : TextUnit, fontColor : Color, modifier: Modifier = Modifier) {
    Text(
        text = name,
        fontSize = size,
        color = fontColor,
        modifier = modifier
    )
}

