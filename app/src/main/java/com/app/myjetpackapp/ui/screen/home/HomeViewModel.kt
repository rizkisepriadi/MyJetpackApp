package com.app.myjetpackapp.ui.screen.home

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.app.myjetpackapp.data.DragonBallRepository
import com.app.myjetpackapp.model.DragonBall
import com.app.myjetpackapp.ui.common.UiState
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.catch
import kotlinx.coroutines.launch

class HomeViewModel(
    private val repository: DragonBallRepository
) : ViewModel() {
    private val _uiState: MutableStateFlow<UiState<List<DragonBall>>> =
        MutableStateFlow(UiState.Loading)
    val uiState: StateFlow<UiState<List<DragonBall>>>
        get() = _uiState

    fun getAllChar() {
        viewModelScope.launch {
            repository.getAllChar()
                .catch {
                    _uiState.value = UiState.Error(it.message.toString())
                }
                .collect { dragonBall ->
                    _uiState.value = UiState.Success(dragonBall)
                }
        }
    }
}