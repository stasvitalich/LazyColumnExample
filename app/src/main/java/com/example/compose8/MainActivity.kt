package com.example.compose8

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.compose8.ui.theme.Compose8Theme

// Main Activity class which extends ComponentActivity
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // Set the main content view using Jetpack Compose
        setContent {
            // Create a LazyColumn to display a scrollable list
            LazyColumn(
                modifier = Modifier.fillMaxSize(),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                // Define the items and their indices for the list
                itemsIndexed(
                    listOf(
                        "Russia",
                        "Germany",
                        "Canada",
                        "USA",
                        "Life",
                        "Dreams",
                        "Russia",
                        "Germany",
                        "Canada",
                        "USA",
                        "Life",
                        "Dreams"
                    )
                ) { index, item ->

                    // Create a Text component for each item in the list
                    Text(
                        text = "$item, $index",
                        modifier = Modifier.padding(horizontal = 5.dp, vertical = 5.dp),
                        fontSize = 40.sp, // Set the font size to 40.sp
                        fontWeight = FontWeight.Bold // Set the font weight to bold
                    )
                }
            }
        }
    }
}
