package com.example.githubdesktop.components

import androidx.compose.foundation.background
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp

@Composable
fun SubTitleBold(
    title: String,
    modifier: Modifier = Modifier,
    textSize: TextStyle = TextStyle(fontSize = 20.sp),
    textWeight: FontWeight = FontWeight.Bold
){
    Text(
        text = title,
        style = textSize.copy(fontWeight = textWeight),
        modifier = modifier,
    )
}