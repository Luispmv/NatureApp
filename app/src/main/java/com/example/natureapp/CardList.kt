package com.example.natureapp

import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.runtime.Composable
import java.nio.file.WatchEvent

//import androidx.compose.foundation.layout.Column
//import androidx.compose.foundation.rememberScrollState
//import androidx.compose.foundation.verticalScroll
//import androidx.compose.runtime.Composable
//import androidx.compose.ui.unit.dp
//import java.lang.reflect.Modifier

@Composable
fun NatureCardsList() {
    LazyColumn(

    ) {
        item {
            CardNature(
                imageUrl = "https://images.pexels.com/photos/2739664/pexels-photo-2739664.jpeg?auto=compress&cs=tinysrgb&w=600",
                header = "Amazonas",
                textstr = "La Selva Amazónica es la mayor selva tropical del mundo."
            )
        }
        item {
            CardNature(
                imageUrl = "https://spanish100.com/wp-content/uploads/2016/10/patagonia-820x410.png",
                header = "Patagonia",
                textstr = "La Patagonia es conocida por sus paisajes impresionantes y glaciares."
            )
        }
        item {
            CardNature(
                imageUrl = "https://images.pexels.com/photos/26447294/pexels-photo-26447294/free-photo-of-mar-vuelo-naturaleza-volador.jpeg?auto=compress&cs=tinysrgb&w=600",
                header = "Gran Barrera de Coral",
                textstr = "La Gran Barrera de Coral es el mayor sistema de arrecifes de coral del mundo."
            )
        }
        item {
            CardNature(
                imageUrl = "https://images.pexels.com/photos/1001435/pexels-photo-1001435.jpeg?auto=compress&cs=tinysrgb&w=600",
                header = "Desierto del Sahara",
                textstr = "El Sahara es el desierto cálido más grande del mundo, famoso por sus dunas interminables."
            )
        }
    }
}
