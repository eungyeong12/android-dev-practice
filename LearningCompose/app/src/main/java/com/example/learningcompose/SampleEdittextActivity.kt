package com.example.learningcompose

import android.os.Bundle
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class SampleEdittextActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            SampleEdittextScreen()
        }
    }
}

@Composable
fun SampleEdittextScreen() {
    var password by remember { mutableStateOf("") }

    Row (
        modifier = Modifier
            .fillMaxSize()
            .padding(10.dp)
    ) {
        TextField(
            value = password,
            onValueChange = { password = it },
            placeholder = { Text("비밀번호를 입력해주세요.") },
            visualTransformation = PasswordVisualTransformation(), // 비밀번호 입력 타입
            modifier = Modifier
                .fillMaxWidth()
                .padding(10.dp), // 내부 패딩
            singleLine = true
        )
    }
}


@Preview(showBackground = true)
@Composable
fun PreviewSampleEdittextScreen() {
    SampleEdittextScreen()
}