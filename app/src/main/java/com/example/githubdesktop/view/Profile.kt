package com.example.githubdesktop.view

import android.content.res.Configuration
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.material3.Surface
import com.example.githubdesktop.components.SubTitle
import com.example.githubdesktop.ui.theme.GitHubDesktopTheme

@Composable
fun Profile(){
    GitHubDesktopTheme {
        Surface(
            color = MaterialTheme.colorScheme.background
        ){
            Column{
                Row{
                    SubTitle(title = "Profile")
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
