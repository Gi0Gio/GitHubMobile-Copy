package com.example.githubdesktop.components

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import com.example.githubdesktop.ui.theme.*

@Composable
fun CustomButton(
    text: String,
    link: String,
    navController: NavHostController,
){
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .background(Grey90, RoundedCornerShape(9.dp))
            .border(1.dp, Grey50, RoundedCornerShape(9.dp))
            .padding(vertical = 10.dp)
            .clickable { navController.navigate(link) },
        contentAlignment = Alignment.Center
    ){
        Column(
            modifier = Modifier.padding(all = 5.dp)
        ) {
            Text(text = text, color = Blue60)
        }
    }
}