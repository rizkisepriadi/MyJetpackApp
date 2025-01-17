package com.app.myjetpackapp.ui.screen.detail

import androidx.annotation.DrawableRes
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.lifecycle.viewmodel.compose.viewModel
import com.app.myjetpackapp.di.Injection
import com.app.myjetpackapp.ui.ViewModelFactory
import com.app.myjetpackapp.ui.common.UiState
import com.app.myjetpackapp.ui.theme.MyJetpackAppTheme

@Composable
fun DetailScreen(
    id: Int,
    viewModel: DetailViewModel = viewModel(
        factory = ViewModelFactory(
            Injection.provideRepository()
        )
    ),
    navigateBack: () -> Unit,
) {
    viewModel.uiState.collectAsState(initial = UiState.Loading).value.let { uiState ->
        when (uiState) {
            is UiState.Loading -> {
                viewModel.getDetailById(id)
            }

            is UiState.Success -> {
                val data = uiState.data
                data.fighterZ.let {
                    DetailContent(
                        photo = it.photo!!,
                        name = it.name!!,
                        race = it.race!!,
                        height = it.height!!,
                        weight = it.weight!!,
                        technique = it.technique!!,
                        transformation = it.transformation!!,
                        description = it.description!!,
                        onBackClick = navigateBack

                    )
                }
            }

            is UiState.Error -> {}
        }
    }
}

@Composable
fun DetailContent(
    @DrawableRes photo: Int,
    name: String,
    race: String,
    height: Int,
    weight: Int,
    technique: String,
    transformation: String,
    description: String,
    onBackClick: () -> Unit,
    modifier: Modifier = Modifier
) {
    Column(modifier = modifier) {
        Column(
            modifier = Modifier
                .verticalScroll(rememberScrollState())
                .weight(1f)
                .background(MaterialTheme.colorScheme.surface)
        ) {
            Box {
                Image(
                    painter = painterResource(photo),
                    contentDescription = null,
                    contentScale = ContentScale.Crop,
                    modifier = modifier
                        .height(400.dp)
                        .fillMaxWidth()
                        .background(MaterialTheme.colorScheme.tertiary)
                )
                Column(
                    modifier = Modifier
                        .width(250.dp)
                        .clip(RoundedCornerShape(12.dp))
                        .background(color = MaterialTheme.colorScheme.primaryContainer.copy(alpha = 0.8f))
                        .padding(8.dp)
                        .align(Alignment.BottomStart)

                ) {
                    Text(
                        text = "Data",
                        fontSize = 22.sp,
                        fontWeight = FontWeight.Bold
                    )
                    TableRow(label = "Race", values = race)
                    TableRow("Height", "$height cm")
                    TableRow("Weight", "$weight kg")
                    TableRow("Technique", technique)
                    TableRow("Transformation", transformation)
                }
            }
            Column(
                modifier = Modifier
                    .padding(8.dp)
            ) {
                Text(
                    text = name,
                    fontSize = 32.sp,
                    fontWeight = FontWeight.Bold
                )
                Text(
                    text = description
                )
            }
        }
    }
}


@Composable
fun TableRow(label: String, values: String) {
    Text("$label : $values")
}


@Preview(showBackground = true)
@Composable
fun Preview() {
    MyJetpackAppTheme {
        DetailScreen(
            id = 1,
            navigateBack = {}
        )
    }
}
