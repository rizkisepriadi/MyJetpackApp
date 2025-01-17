package com.app.myjetpackapp.ui.screen.home

import androidx.compose.foundation.clickable
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.HorizontalDivider
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import com.app.myjetpackapp.di.Injection
import com.app.myjetpackapp.model.DragonBall
import com.app.myjetpackapp.ui.ViewModelFactory
import com.app.myjetpackapp.ui.common.UiState
import com.app.myjetpackapp.ui.components.CardItem

@Composable
fun HomeScreen(
    modifier: Modifier = Modifier,
    viewModel: HomeViewModel = viewModel(
        factory = ViewModelFactory(Injection.provideRepository())
    ),
    navigateToDetail: (Int) -> Unit
) {
    viewModel.uiState.collectAsState(initial = UiState.Loading).value.let { uiState ->
        when (uiState) {
            is UiState.Loading -> {
                viewModel.getAllChar()
            }

            is UiState.Success -> {
                HomeContent(
                    dragonBall = uiState.data,
                    modifier = modifier,
                    navigateToDetail = navigateToDetail
                )
            }

            is UiState.Error -> {}
        }
    }
}

@Composable
fun HomeContent(
    dragonBall: List<DragonBall>,
    modifier: Modifier = Modifier,
    navigateToDetail: (Int) -> Unit
) {
    LazyColumn(
        modifier = modifier
    ) {
        items(dragonBall) { data ->
            CardItem(
                name = data.fighterZ.name!!,
                thumbnail = data.fighterZ.thumbnail!!,
                race = data.fighterZ.race!!,
                modifier = Modifier.clickable {
                    data.fighterZ.id?.let { navigateToDetail(it) }
                }
            )
            HorizontalDivider(
                thickness = 1.dp,
                color = Color.Gray
            )
        }
    }
}