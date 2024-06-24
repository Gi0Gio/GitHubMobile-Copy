package com.example.githubdesktop.components

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController

@Composable
fun Icons(
    painter: Painter,
    contentDescription: String,
    link: String,
    navController: NavHostController,
    color: Color,
){
    Row(
        modifier = Modifier
            .padding(5.dp),
    ){
        Box(
            modifier = Modifier
                .size(30.dp)
                .background(color, RoundedCornerShape(5.dp))
                .clickable { navController.navigate(link) }
                .padding(7.5.dp),
            contentAlignment = Alignment.Center
        ){
            Icon(
                painter = painter,
                contentDescription = contentDescription,
                modifier = Modifier
                    .size(45.dp)
            )
        }
        Spacer(modifier = Modifier.width(10.dp))
        SubTitle(
            title = contentDescription,
            modifier = Modifier.align(Alignment.CenterVertically)
        )
    }
}