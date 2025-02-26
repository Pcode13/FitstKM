package com.example.fitstkm.android.screen

import androidx.compose.foundation.layout.Column
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import com.example.fitstkm.articles.ArticlesViewModel
import java.util.logging.ErrorManager



@Composable
fun ArticlesScreen(
    articlesState: ArticlesViewModel,
){
    val articles = articlesState.articlesState.collectAsState()
    Column {
        AppBar()
        if(articles.value.loading)
            Loading()
        if(articles.value.error!=null)
            ErrorManager(articles.value.error!!)
        if(articles.value.articles.isNotEmpty())
            ArticlesListView(articles.value.articles)
    }
}

fun ErrorManager(error: String) {

}

@Composable
fun ArticlesListView(articles: List<Article>) {

}

@Composable
fun Loading() {
    TODO("Not yet implemented")
}




@Composable
fun AppBar() {
    TODO("Not yet implemented")
}
