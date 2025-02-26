package com.example.fitstkm.articles

import com.example.fitstkm.BaseViewModel
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch

class ArticlesViewModel : BaseViewModel() {
    // Use MutableStateFlow for the private backing property
    private val _articalState = MutableStateFlow(ArticlesState(
        articles = listOf(),
        loading = true,
        error = null
    ))

    // Expose the state as a StateFlow
    val articlesState: StateFlow<ArticlesState> get() = _articalState

    init {
        getArticle()
    }

    private fun getArticle() {
        scope.launch {

            val fetchedArticles = fecthArticles()

            delay(500)
            // Simulate a network call or some delay
            // Update the state by setting the value of the MutableStateFlow
            _articalState.value = ArticlesState(articles = fetchedArticles) // Assuming ArticlesState is a data class or similar
        }
    }
suspend fun fecthArticles():List<Article> =mockArticales
private val mockArticales = listOf(
    Article("Job shadowing sparks students' career potential", "Job shadow program connects record number of students with potential employers, and helps alumni give back.", "Date 1", "Image URL 1"),
    Article("Breaking down barriers, leading equality", "Fourth-year medical student encourages openness, involvement for LGBTQ community on campus.", "Date 2", "Image URL 2"),
    Article("Job shadowing sparks students' career potential", "Job shadow program connects record number of students with potential employers, and helps alumni give back.", "Date 1", "Image URL 1"),
    Article("Breaking down barriers, leading equality", "Fourth-year medical student encourages openness, involvement for LGBTQ community on campus.", "Date 2", "Image URL 2"),
    Article("Job shadowing sparks students' career potential", "Job shadow program connects record number of students with potential employers, and helps alumni give back.", "Date 1", "Image URL 1"),
    Article("Breaking down barriers, leading equality", "Fourth-year medical student encourages openness, involvement for LGBTQ community on campus.", "Date 2", "Image URL 2"),
)


}