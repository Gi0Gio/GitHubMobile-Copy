package com.example.githubdesktop.components

import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.sp

@Composable
fun SubTitle(
    title: String,
    modifier: Modifier = Modifier,
    textSize: TextStyle = TextStyle(fontSize = 20.sp),
){
    Text(
        text = title,
        style = textSize,
        modifier = modifier
    )
}