package com.example.githubdesktop.view

import android.content.res.Configuration
import android.preference.PreferenceActivity.Header
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AddCircle
import androidx.compose.material.icons.filled.MoreVert
import androidx.compose.material.icons.filled.Search
import androidx.compose.runtime.Composable
import com.example.githubdesktop.components.PageTitle
import androidx.compose.material3.Icon
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Divider
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.navigation.NavHostController
import com.example.githubdesktop.ui.theme.*
import com.example.githubdesktop.R
import com.example.githubdesktop.components.CustomButton
import com.example.githubdesktop.components.DescriptionText
import com.example.githubdesktop.components.HeaderComponent
import com.example.githubdesktop.components.Icons
import com.example.githubdesktop.components.SubTitleBold


@Composable
fun Home(navController: NavHostController) {
    GitHubDesktopTheme {
        Surface(
            color = MaterialTheme.colorScheme.background,
            modifier = Modifier
                .verticalScroll(rememberScrollState())
        ) {
            Column {
                HeaderComponent()
                
                Column(
                    modifier = Modifier
                        .padding(horizontal = 20.dp)
                        .padding(vertical = 10.dp)
                        .fillMaxWidth()
                ) {
                    Spacer(modifier = Modifier.height(30.dp))
                    
                    SubTitleBold(title = "My Work")
                    Spacer(modifier = Modifier.height(25.dp))


                    Icons(
                        painter = painterResource(id = R.drawable.circle_dot),
                        contentDescription = "Issues",
                        link = "profile",
                        navController = navController,
                        color = Green50
                    )
                    Spacer(modifier = Modifier.height(15.dp))
                    Icons(
                        painter = painterResource(id = R.drawable.git_pull_request),
                        contentDescription = "Pull Request",
                        link = "pullRequest",
                        navController = navController,
                        color = Blue60
                    )
                    Spacer(modifier = Modifier.height(15.dp))
                    Icons(
                        painter = painterResource(id = R.drawable.messages),
                        contentDescription = "Discussions",
                        link = "Discussion",
                        navController = navController,
                        color = Purple50
                    )
                    Spacer(modifier = Modifier.height(15.dp))
                    Icons(
                        painter = painterResource(id = R.drawable.table),
                        contentDescription = "Projects",
                        link = "project",
                        navController = navController,
                        color = Grey50
                    )
                    Spacer(modifier = Modifier.height(15.dp))
                    Icons(
                        painter = painterResource(id = R.drawable.book_2),
                        contentDescription = "Repositories",
                        link = "repositories",
                        navController = navController,
                        color = Grey80
                    )
                    Spacer(modifier = Modifier.height(15.dp))
                    Icons(
                        painter = painterResource(id = R.drawable.building),
                        contentDescription = "Organizations",
                        link = "organizations",
                        navController = navController,
                        color = Orange50
                    )
                    Spacer(modifier = Modifier.height(15.dp))
                    Icons(
                        painter = painterResource(id = R.drawable.star),
                        contentDescription = "Starred",
                        link = "starred",
                        navController = navController,
                        color = Yellow50
                    )

                    Divider(
                        color= Grey50,
                        thickness = 1.dp,
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(top = 10.dp)
                    )

                    Spacer(modifier = Modifier.height(20.dp))
                    SubTitleBold(title = "Favorites")
                    Spacer(modifier = Modifier.height(20.dp))
                    DescriptionText(title = "Add favorite repositories for quick access at any time, without having to search",
                        modifier = Modifier.padding(horizontal = 10.dp)
                        )
                    Column(modifier = Modifier.padding(vertical = 5.dp)) {
                        CustomButton(text = "ADD FAVORITES", link ="favorites" , navController =navController )
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
fun HomePreview() {
    GitHubDesktopTheme {
    }
}