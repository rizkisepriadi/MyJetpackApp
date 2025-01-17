package com.app.myjetpackapp.ui.screen.detail

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.app.myjetpackapp.data.DragonBallRepository
import com.app.myjetpackapp.model.DragonBall
import com.app.myjetpackapp.ui.common.UiState
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch

class DetailViewModel(
    private val repository: DragonBallRepository
) : ViewModel() {
    private val _uiState: MutableStateFlow<UiState<DragonBall>> =
        MutableStateFlow(UiState.Loading)
    val uiState: StateFlow<UiState<DragonBall>>
        get() = _uiState

    fun getDetailById(id: Int) {
        viewModelScope.launch {
            _uiState.value = UiState.Loading
            try {
                val character = repository.getCharById(id)
                _uiState.value = UiState.Success(character)
            } catch (e: NoSuchElementException) {
                _uiState.value = UiState.Error("Character not found: ${e.message}")
            }
        }
    }

}