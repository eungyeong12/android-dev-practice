package com.example.learningcompose

import android.os.Bundle
import androidx.activity.compose.setContent
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class PaddingAndMarginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            PaddingAndMarginScreen()
        }
    }
}

@Composable
fun PaddingAndMarginScreen() {
    Column (
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)
    ){
        // 패딩, 마진 없음
        StyledText("패딩, 마진 둘 다 없음", Color(0xFFD7FAEA), padding = 0.dp, margin = 0.dp)
        StyledText("패딩, 마진 둘 다 없음", Color(0xFF4B653B), textColor = Color.White, padding = 0.dp, margin = 0.dp)

        // 마진만 있음
        StyledText("마진만 있음", Color(0xFFD7FAEA), padding = 0.dp, margin = 15.dp)
        StyledText("마진만 있음", Color(0xFF4B653B), textColor = Color.White, padding = 0.dp, margin = 15.dp)

        // 패딩만 있음
        StyledText("패딩만 있음", Color(0xFFD7FAEA), padding = 10.dp, margin = 0.dp)
        StyledText("패딩만 있음", Color(0xFF4B653B), textColor = Color.White, padding = 10.dp, margin = 0.dp)

        // 패딩, 마진 둘 다 있음
        StyledText("패딩,마진 둘 다 있음", Color(0xFFD7FAEA), padding = 10.dp, margin = 15.dp)
        StyledText("패딩,마진 둘 다 있음", Color(0xFF4B653B), textColor = Color.White, padding = 10.dp, margin = 15.dp)
    }
}

@Composable
fun StyledText(text: String, bgColor: Color, textColor: Color = Color.Black, padding: Dp, margin: Dp) {
    Text(
        text = text,
        fontSize = 20.sp,
        color = textColor,
        modifier = Modifier
            .padding(margin) // padding()을 배경보다 먼저 적용하면 마진 역할
            .background(bgColor)
            .padding(padding) // padding()을 배경 이후에 적용하면 내부 패딩 역할
    )
}

@Preview(showBackground = true)
@Composable
fun PreviewPaddingAndMarginScreen() {
    PaddingAndMarginScreen()
}