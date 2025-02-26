package com.example.helloworld

import android.os.Bundle
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            HelloWorldScreen()
        }
    }
}

@Composable
fun HelloWorldScreen() {
    Box( // xml의 Layout과 같은 역할
        modifier = Modifier
            .fillMaxSize() // Box를 화면 전체 크기로 확장
            .wrapContentSize(Alignment.Center) // 내부 콘텐츠 크기로 줄이고 중앙 배치
    ) {
        Text(text = "안녕 세상아!")
    }
}

@Preview(showBackground = true)
@Composable
fun PreviewHelloWorldScreen() {
    HelloWorldScreen()
}