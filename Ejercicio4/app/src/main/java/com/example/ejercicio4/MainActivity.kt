package com.example.ejercicio4

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.ejercicio4.ui.theme.Ejercicio4Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Ejercicio4Theme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Screen(
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}

// He decidido crear el codigo en la clase MAIN
// Estoy barajando la posibilidad de simplemente crear un componente Pantalla y pasar todo este
// codigo a ese fichero.

@Composable
fun Screen(modifier: Modifier = Modifier) {

    // Column, Row y Box son formas muy sencillas de disponer los distintos elementos en el layout
    Column(modifier = Modifier.fillMaxSize()) {
        Box(
            modifier = Modifier
                .padding(top = 50.dp)
                .height(50.dp)
                .fillMaxWidth()
                .background(Color.Blue.copy(alpha = 0.5f)), // Colores friendly
            contentAlignment = Alignment.Center
        ) {
            Text(
                text = "Screen",
                color = Color.White,
                fontSize = 20.sp
            )
        }

        // Spacer es otra forma sencilla de evitar los padding.
        // Me pregunto cuando utilizar padding y cuando spacing.

        Spacer(modifier = Modifier.height(20.dp))

        Row(modifier = Modifier) {
            Box(
                modifier = Modifier
                    .size(200.dp, 100.dp)
                    .clip(RoundedCornerShape(16.dp))
                    .background(Color.Blue.copy(alpha = 0.5f))
            )
            Spacer(modifier = Modifier.width(50.dp))
            Text(
                text = "Texto de prueba con contenido aleatorio y practicamente ningun sentido",
                color = Color.Black,
                fontSize = 20.sp
            )
        }

        Text(
            text = "FORMULARIO",
            modifier = Modifier
                .fillMaxWidth(),
            textAlign = TextAlign.Center,  // Centra el texto horizontalmente. CHAT GPT
            fontSize = 20.sp
        )

        Box {
            Row {
                Column {
                    TextField(
                        value = "text",
                        onValueChange = { newText -> var text = newText },
                        label = { Text("Ingrese su nombre") },
                        modifier = Modifier
                            .width(200.dp)
                            .padding(10.dp)
                    )
                    TextField(
                        value = "text",
                        onValueChange = { newText -> var text = newText },
                        label = { Text("Ingrese su email") },
                        modifier = Modifier
                            .width(200.dp)
                            .padding(10.dp)
                    )
                    TextField(
                        value = "text",
                        onValueChange = { newText -> var text = newText },
                        label = { Text("Ingrese su direccion") },
                        modifier = Modifier
                            .width(200.dp)
                            .padding(10.dp)
                    )
                    TextField(
                        value = "text",
                        onValueChange = { newText -> var text = newText },
                        label = { Text("Ingrese su pais") },
                        modifier = Modifier
                            .width(200.dp)
                            .padding(10.dp)
                    )
                }

                // No he conseguido actualizar los datos con los resultados introducidos en
                // el TextValue
                Column {
                    Text(
                        text = "resultado nombre"
                    )
                    Text(
                        text = "resultado email"
                    )
                    Text(
                        text = "resultado direccion"
                    )
                    Text(
                        text = "resultado pais"
                    )
                }
            }
        }

        Box(
            modifier = Modifier
                .fillMaxWidth(),
            contentAlignment = Alignment.Center // Centrar el contenido - CHAT GPT
        ) {
            var buttonText = "Init"
            Button(
                onClick = {

                    // El boton no hace nada
                    // Me pide hacer estados mutables que no he llegado a entender aun

                    buttonText = if (buttonText == "Haz clic aquí") {
                        "¡Gracias por hacer clic!"
                    } else {
                        "Haz clic aquí"
                    }
                },
                modifier = Modifier
                    .width(200.dp)
            ) {
                Text(
                    buttonText,
                    textAlign = TextAlign.Center,
                    fontSize = 20.sp
                )
            }
        }
    }
}
