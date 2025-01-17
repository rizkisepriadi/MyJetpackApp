package com.app.myjetpackapp.ui.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.app.myjetpackapp.R
import com.app.myjetpackapp.ui.theme.MyJetpackAppTheme

@Composable
fun CardItem(
    thumbnail: Int,
    name: String,
    race: String,
    modifier: Modifier = Modifier
) {
    Row(
        modifier = modifier.fillMaxWidth().padding(4.dp)
    ) {
        Image(
            painter = painterResource(thumbnail),
            contentDescription = null,
            contentScale = ContentScale.Crop,
            modifier = Modifier.size(90.dp).clip(CircleShape),
        )
        Column {
            Text(
                text = name,
                fontWeight = FontWeight.Bold,
                fontSize = 20.sp
            )
            Text(
                text = race,
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
private fun CardItemPreview() {
    MyJetpackAppTheme {
        CardItem(R.drawable.son_goku_thumb, "Goku", "Saiyan" )
    }
}