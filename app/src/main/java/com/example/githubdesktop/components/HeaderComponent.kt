package com.example.githubdesktop.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material.icons.filled.AddCircle
import androidx.compose.material.icons.filled.MoreVert
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.githubdesktop.ui.theme.Blue60

@Composable
fun HeaderComponent(){
    Row(
        modifier = Modifier
            .padding(horizontal = 20.dp)
            .padding(vertical = 10.dp)
            .fillMaxWidth(),
        horizontalArrangement = Arrangement.SpaceBetween
    ) {
        PageTitle(
            title = "Home"
        )

        Spacer(modifier = Modifier.width(8.dp))

        Row(
            horizontalArrangement = Arrangement.spacedBy(13.dp)
        ){
            Icon(
                imageVector = androidx.compose.material.icons.Icons.Default.Search,
                contentDescription = "Search Icon",
                tint = Blue60
            )
            Icon(
                imageVector = androidx.compose.material.icons.Icons.Default.AddCircle,
                contentDescription = "Add Icon",
                tint = Blue60
            )
            Icon(
                imageVector = androidx.compose.material.icons.Icons.Default.MoreVert,
                contentDescription = "Options Icon",
                tint = Blue60
            )
        }
    }
}