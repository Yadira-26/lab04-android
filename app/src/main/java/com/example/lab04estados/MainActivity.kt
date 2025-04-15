@file:OptIn(ExperimentalMaterial3Api::class)

package com.example.lab04estados

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.text.font.FontWeight
import com.example.lab04estados.ui.theme.Lab04EstadosTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Lab04EstadosTheme {
                Surface(modifier = Modifier.fillMaxSize()) {
                    Column {
                        TopAppBarComponent()
                        LazyColumnComponent()
                        CardComponent()
                    }
                }
            }
        }
    }
}
// Cambio de prueba
@Composable
fun ViewHolaCurso() {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = "Welcome to the Course!",
            fontSize = 32.sp, // Cambie de 28.sp a 32.sp
            fontWeight = FontWeight.Bold
        )
        Spacer(modifier = Modifier.height(16.dp))
        Text(
            text = "Hello, Student!",
            fontSize = 20.sp
        )
    }
}

@Composable
fun TopAppBarComponent() {
    TopAppBar(
        title = { Text("Mi TopAppBar") }
    )
}

@Composable
fun LazyColumnComponent() {
    val itemsList = listOf("Elemento 1", "Elemento 2", "Elemento 3", "Elemento 4")

    LazyColumn(modifier = Modifier.padding(16.dp)) {
        items(itemsList) { item ->
            Text(text = item, modifier = Modifier.padding(8.dp))
        }
    }
}

@Composable
fun CardComponent() {
    Card(modifier = Modifier.padding(16.dp)) {
        Column(modifier = Modifier.padding(16.dp)) {
            Text(text = "Hola desde una Card")
            Spacer(modifier = Modifier.height(8.dp))
            Text(text = "Este es un contenido dentro de una Card.")
        }
    }
}
