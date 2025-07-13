package io.github.ivblinov.popkorn.features.movie_feed.ui.screen

import android.util.Log
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import dagger.hilt.android.lifecycle.HiltViewModel
import io.github.ivblinov.popkorn.domain.usecase.GetTop250MoviesUseCase
import io.github.ivblinov.popkorn.features.movie_feed.ui.state.MovieFeedState
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch
import javax.inject.Inject

private const val TAG = "MyLog"
@HiltViewModel
class MovieFeedViewModel @Inject constructor(
    private val getTop250UseCase: GetTop250MoviesUseCase
) : ViewModel() {

    private val _state = MutableStateFlow<MovieFeedState>(MovieFeedState.Loading)
    val state = _state.asStateFlow()

    init {
        loadTop250Movies()
    }

    private fun loadTop250Movies() {
        viewModelScope.launch {
            _state.value = MovieFeedState.Loading
            getTop250UseCase()
                .onSuccess { movieCollection ->
                    _state.value = MovieFeedState.Success(movieCollection)
                    movieCollection.items.forEach {
                        Log.d(TAG, "$it")
                    }
                }
                .onFailure { error ->
                    _state.value = MovieFeedState.Error(error.message ?: "Неизвестная ошибка")
                }
        }
    }
}