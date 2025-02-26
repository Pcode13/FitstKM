package com.example.fitstkm.android.screen

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Divider
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.example.fitstkm.Platform

@Composable
fun AboutDeviceScreen(){
    Column {
        Toolbar()
        ContentView()
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
private fun Toolbar() {
    TopAppBar(
        title = { Text("About Device") },

    )
}

@Composable
private fun ContentView(){
    val items= makeItems()
    LazyColumn {
        items(items) { items ->
            RowView(title = items.first, content = items.second)
        }
    }
}

@Composable
fun RowView(title: String, content: String) {
Column(Modifier.padding(16.dp)) {
    Text(text = title,
        style = MaterialTheme.typography.titleMedium,
        color = Color.Green)
    Text(text = content,
        style = MaterialTheme.typography.titleMedium,
        color = Color.Red)
}
    Divider()
}

fun makeItems(): List<Pair<String, String>> {
    val platform = Platform()
    platform.logSystemInfo() // Ensure this method exists in the Platform class
    return listOf(
        Pair("Operating System", "${platform.osName} ${platform.osVersion}"),
        Pair("Device", "${platform.deviceModel}"),
        Pair("Density", "${platform.density.toString()}"),
    )
}
