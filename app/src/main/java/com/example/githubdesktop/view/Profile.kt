package com.example.githubdesktop.view

import android.content.res.Configuration
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AddCircle
import androidx.compose.material.icons.filled.MoreVert
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.material3.Surface
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.githubdesktop.components.HeaderComponent
import com.example.githubdesktop.components.PageTitle
import com.example.githubdesktop.components.SubTitle
import com.example.githubdesktop.ui.theme.Blue60
import com.example.githubdesktop.ui.theme.GitHubDesktopTheme

@Composable
fun Profile(){
    GitHubDesktopTheme {
        Surface(
            color = MaterialTheme.colorScheme.background,
            modifier = Modifier
                .verticalScroll(rememberScrollState())
        ){
            Column{
                HeaderComponent()
                Row(
                    modifier = Modifier
                        .padding(horizontal = 20.dp)
                        .padding(vertical = 10.dp)
                        .fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceBetween
                ) {
                    PageTitle(
                        title = "Profile",
                        modifier = Modifier.weight(1f)
                    )

                    Spacer(modifier = Modifier.width(8.dp))

                    Row(
                        horizontalArrangement = Arrangement.spacedBy(13.dp)
                    ){
                        Icon(
                            imageVector = Icons.Default.Search,
                            contentDescription = "Search Icon",
                            tint = Blue60
                        )
                        Icon(
                            imageVector = Icons.Default.AddCircle,
                            contentDescription = "Add Icon",
                            tint = Blue60
                        )
                        Icon(
                            imageVector = Icons.Default.MoreVert,
                            contentDescription = "Options Icon",
                            tint = Blue60
                        )
                    }
                }
            }
        }
    }
}

@Preview(name = "Dark Mode")
@Preview(
    uiMode = Configuration.UI_MODE_NIGHT_YES,
    showBackground = true,
    name = "Light Mode"
)
@Composable
fun ProfilePreview(){
    Profile()
}
