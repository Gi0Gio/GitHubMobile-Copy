package com.example.githubdesktop.view

import android.content.res.Configuration
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
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.ui.res.painterResource
import androidx.navigation.NavHostController
import com.example.githubdesktop.ui.theme.*
import com.example.githubdesktop.R
import com.example.githubdesktop.components.Icons
import com.example.githubdesktop.components.SubTitleBold


@Composable
fun Home(navController: NavHostController) {
    GitHubDesktopTheme {
        Surface(
            color = MaterialTheme.colorScheme.background,
        ) {
            Column {
                Row(
                    modifier = Modifier
                        .padding(horizontal = 20.dp)
                        .padding(vertical = 10.dp)
                        .fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceBetween
                ) {
                    PageTitle(
                        title = "Home",
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
                        color = Yellow30
                    )

                    Spacer(modifier = Modifier.height(20.dp))

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