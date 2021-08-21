package com.tedm.gnewsappcompose.presentation.util

sealed class Screen(val route: String){
    object SplashScreen : Screen("splash_screen")
    object HomeScreen : Screen("home_screen")
    object NewsScreen : Screen("news_screen")
    object SearchScreen : Screen("search_screen")
    object ProfileScreen : Screen("profile_screen")
    object MoreScreen : Screen("more_screen")
    object FilterScreen : Screen("filter_screen")
    object SectorScreen : Screen("sector_screen")
    object ArticleDetailScreen : Screen("article_detail_screen")


}