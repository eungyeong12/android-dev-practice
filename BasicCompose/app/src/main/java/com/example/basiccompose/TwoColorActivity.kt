package com.example.basiccompose

import android.os.Bundle
import androidx.activity.compose.setContent
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

class TwoColorActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            TwoColorScreen()
        }
    }
}

@Composable
fun TwoColorScreen() {
    var currentScreen by remember { mutableStateOf("none") }

    Column (
        modifier = Modifier
            .fillMaxSize(),
        verticalArrangement = Arrangement.SpaceBetween
    ) {
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .height(300.dp)
                .background(Color.Yellow)
        ) {
            when (currentScreen) {
                "red" -> RedScreen()
                "blue" -> BlueScreen()
            }
        }

        Column (
            modifier = Modifier
                .fillMaxWidth()
                .padding(10.dp),
            verticalArrangement = Arrangement.Bottom
        ) {
            Button(
                onClick = { currentScreen = "blue" },
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(bottom = 10.dp)
            ) {
                Text("Blue Fragment")
            }

            Button(
                onClick = { currentScreen = "red" },
                modifier = Modifier
                    .fillMaxWidth()
            ) {
                Text("Red Fragment")
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun PreviewTwoColorScreen() {
    TwoColorScreen()
}