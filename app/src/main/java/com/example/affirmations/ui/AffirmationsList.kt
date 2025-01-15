package com.example.affirmations.ui

import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.affirmations.model.Affirmation

@Composable
fun AffirmationsList(lista: List<Affirmation>, modifier: Modifier) {
    LazyColumn(modifier = Modifier) {
        // el método que sirve para añadir elementos a la columna es items
        items(lista) { elemento ->
            AffirmationCard(affirmation = elemento, modifier = Modifier.padding(8.dp))
        }
    }
}