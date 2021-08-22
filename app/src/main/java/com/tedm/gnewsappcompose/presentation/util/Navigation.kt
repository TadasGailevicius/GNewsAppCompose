package com.tedm.gnewsappcompose.presentation.util

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.tedm.gnewsappcompose.presentation.home.HomeScreen
import com.tedm.gnewsappcompose.presentation.more.MoreScreen
import com.tedm.gnewsappcompose.presentation.news.NewsScreen
import com.tedm.gnewsappcompose.presentation.profile.ProfileScreen
import com.tedm.gnewsappcompose.presentation.search.SearchScreen
import com.tedm.gnewsappcompose.presentation.splash.SplashScreen


@Composable
fun Navigation(navController: NavHostController) {
    NavHost(
        navController = navController,
        startDestination = Screen.SplashScreen.route,
        modifier = Modifier.fillMaxSize()
    ) {
        composable(Screen.SplashScreen.route) {
            SplashScreen(navController = navController)
        }
        composable(Screen.HomeScreen.route) {
            HomeScreen(navController = navController)
        }
        composable(Screen.NewsScreen.route) {
            NewsScreen(navController = navController)
        }
        composable(Screen.SearchScreen.route) {
            SearchScreen(navController = navController)
        }
        composable(Screen.ProfileScreen.route) {
            ProfileScreen(navController = navController)
        }
        composable(Screen.MoreScreen.route) {
            MoreScreen(navController = navController)
        }
    }
}