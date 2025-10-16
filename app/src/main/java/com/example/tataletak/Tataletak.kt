package com.example.tataletak

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.ComposeCompilerApi
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun TataletakColumn(modifier: Modifier) {
    Column(modifier = modifier.padding(top = 20.dp, start = 20.dp, end = 20.dp)) {
        Text(text = "Komponen1")
        Text(text = "Komponen2")
        Text(text = "Komponen3")
        Text(text = "Komponen4")
    }
}

@Composable
fun TataletakRow(modifier: Modifier){
    Row(modifier = modifier.fillMaxWidth(),
        horizontalArrangement = Arrangement.SpaceEvenly) {
        Text(text = "Komponen1")
        Text(text = "Komponen2")
        Text(text = "Komponen3")
        Text(text = "Komponen4")
    }
}

@Composable
fun TataletakBox(modifier: Modifier) {
    Box(modifier = modifier
            .fillMaxHeight()
            .fillMaxWidth(), contentAlignment = Alignment.Center
    ) {
        Text(text = "Box 1")
        Text(text = "Column 1")
        Text(text = "Row 1")
        Text(text = "Box 2")
        Text(text = "Column 2")
    }
}

@Composable
fun TataletakColumnRow(modifier: Modifier) {
    Column() {
        // Baris 1
        Row(modifier = modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceEvenly){
            Text(text = "Komponen1 Baris1")
            Text(text = "Komponen2 Baris1")
            Text(text = "Komponen3 Baris1")
        }
        // Baris 2
        Row(modifier = modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceEvenly){
            Text(text = "Komponen1 Baris2")
            Text(text = "Komponen2 Baris2")
            Text(text = "Komponen3 Baris2")
        }
    }
}

@Composable
fun TataletakRowColumn(modifier: Modifier) {
    Row(modifier = modifier.fillMaxWidth(), horizontalArrangement = Arrangement.SpaceEvenly) {
        // Kolom 1
        Column() {
            Text(text = "Komponen1 Kolom1")
            Text(text = "Komponen2 Kolom1")
            Text(text = "Komponen3 Kolom1")
        }
        // Kolom 2
        Column() {
            Text(text = "Komponen1 Kolom2")
            Text(text = "Komponen2 Kolom2")
            Text(text = "Komponen3 Kolom2")
        }
    }
}

@Composable
fun TataletakBoxColumnRow(modifier: Modifier) {
    val gambar = painterResource(id = R.drawable.icons8_game_controller_100)
    Column {
        Box(
            modifier = modifier
                .fillMaxWidth()
                .height(110.dp)
                .background(Color.LightGray),
            contentAlignment = Alignment.Center
        ) {
            Column() {
                Row(
                    modifier = modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceEvenly
                ) {
                    Text(text = "Col1_Row1_Komponen1")
                    Text(text = "Col1_Row1_Komponen2")
                    Text(text = "Col1_Row1_Komponen3")
                }
            }
        }
    }
}