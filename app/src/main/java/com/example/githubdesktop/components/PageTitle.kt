package com.example.githubdesktop.components

import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp

@Composable
fun PageTitle(
    title: String,
    modifier: Modifier = Modifier,
    textSize: TextStyle = TextStyle(fontSize = 25.sp),
    textWeight: FontWeight = FontWeight.ExtraBold
    ){
    Text(
        text = title,
        style = textSize.copy(fontWeight = textWeight),
        modifier = modifier
    )
}