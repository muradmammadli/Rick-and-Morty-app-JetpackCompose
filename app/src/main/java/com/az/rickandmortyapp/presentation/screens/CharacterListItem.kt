package com.az.rickandmortyapp.presentation.screens

import android.os.Bundle
import android.util.Log
import androidx.compose.ui.graphics.Color
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import coil.compose.rememberImagePainter
import com.az.rickandmortyapp.R
import com.az.rickandmortyapp.data.model.Character
import com.az.rickandmortyapp.data.model.Location
import com.az.rickandmortyapp.data.model.Origin

@Composable
fun CharacterListItem(character: Character, navController: NavController?) {
    val cardBackgroundColor = colorResource(id = R.color.blue_100)
    val buttonColor = colorResource(id = R.color.green_100)
    val textColor = colorResource(id = R.color.gray100)

    Card(
        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 16.dp, vertical = 8.dp),
        elevation = CardDefaults.cardElevation(defaultElevation = 8.dp),
        colors = CardDefaults.cardColors(
            containerColor = cardBackgroundColor
        )

    ) {
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Column(
                modifier = Modifier
                    .padding(16.dp)
            ) {
                Image(
                    painter = rememberImagePainter(data = character.image),
                    contentDescription = null,
                    modifier = Modifier
                        .size(80.dp)
                        .clip(RoundedCornerShape(5.dp)),
                )
                Spacer(modifier = Modifier.height(8.dp))
                Text(
                    text = character.name,
                    fontWeight = FontWeight.Bold,
                    fontSize = 18.sp,
                    color = textColor
                )

            }

            Button(
                modifier = Modifier
                    .size(width = 120.dp, height = 60.dp)
                    .padding(8.dp),
                colors = ButtonDefaults.buttonColors(
                    containerColor = buttonColor,
                    contentColor = Color.White
                ),
                onClick = {
                    navController?.navigate(route = "detail_screen/${character.id}")
                },
            ) {
                Column(
                    modifier = Modifier.fillMaxSize(),
                    verticalArrangement = Arrangement.Center,
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Text(
                        text = "Details",
                        textAlign = TextAlign.Center
                    )
                }
            }
        }
    }
}

@Composable
@Preview(showBackground = true)
fun PreviewCharacterListItem() {
    CharacterListItem(
        character = Character(
            created = "112",
            episode = emptyList(),
            gender = "null",
            id = 1,
            image = "https://rickandmortyapi.com/api/character/avatar/1.jpeg",
            location = Location("", "null"),
            name = "Murad",
            origin = Origin("", ""),
            species = "",
            status = "",
            type = "",
            url = "",
        ),
        null
    )
}