package com.example.githubdesktop.components

import android.graphics.Color
import android.util.EventLogTags.Description
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.sp
import com.example.githubdesktop.ui.theme.*

@Composable
fun DescriptionText(
    title: String,
    modifier: Modifier = Modifier,
    textSize: TextStyle = TextStyle(fontSize = 17.sp),
    textWeight: FontWeight = FontWeight.Medium
){
    Text(
        text = title,
        style = textSize.copy(color = Grey40, textAlign = TextAlign.Center, fontWeight = textWeight),
        modifier = modifier
    )
}