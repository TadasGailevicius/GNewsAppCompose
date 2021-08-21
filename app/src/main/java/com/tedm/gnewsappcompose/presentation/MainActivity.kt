package com.tedm.gnewsappcompose.presentation

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import com.tedm.gnewsappcompose.presentation.components.StandardScaffold
import com.tedm.gnewsappcompose.presentation.ui.theme.GNewsAppComposeTheme
import com.tedm.gnewsappcompose.presentation.util.Navigation
import com.tedm.gnewsappcompose.presentation.util.Screen
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            GNewsAppComposeTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    color = MaterialTheme.colors.background,
                    modifier = Modifier.fillMaxSize()
                ) {
                    val navController = rememberNavController()
                    val navBackStackEntry by navController.currentBackStackEntryAsState()
                    StandardScaffold(
                        navController = navController,
                        showBottomBar = navBackStackEntry?.destination?.route in listOf(
                            Screen.HomeScreen.route,
                            Screen.NewsScreen.route,
                            Screen.SearchScreen.route,
                            Screen.ProfileScreen.route,
                            Screen.MoreScreen.route,
                        ),
                        /*
                        showBackArrow = navBackStackEntry?.destination?.route in listOf(
                            Screen.PostDetailScreen.route,
                            Screen.MessagesScreen.route,
                            Screen.EditProfileScreen.route,
                            Screen.SearchScreen.route,
                            Screen.CreatePostScreen.route,
                            Screen.PersonListScreen.route,
                        ),*/
                        modifier = Modifier.fillMaxSize()
                    ) {
                        Navigation(navController)
                    }
                }
            }
        }
    }
}