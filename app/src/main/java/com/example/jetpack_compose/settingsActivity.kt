package com.example.jetpack_compose

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.jetpack_compose.R



class settingsActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .background(Color(96, 211, 148)),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.SpaceBetween
            ) {
                //Header

                CreateHeaderButtonProfile(header = "Настройки")

                //Main

                Column(
                    modifier = Modifier
                        .fillMaxWidth(0.95f)
                        .height(400.dp)
                ) {
                    Row(Modifier.fillMaxWidth(0.95f).clickable(
                        onClick = {
                            val int = Intent(this@settingsActivity, ProfileActivity::class.java)
                            startActivity(int)
                        }
                    ),horizontalArrangement = Arrangement.SpaceBetween,verticalAlignment = Alignment.CenterVertically, ) {
                        Text(text = "Профиль пользователя", color = Color.White, fontSize = 22.sp)
                        Image(painterResource(R.drawable.vector), contentDescription = "", Modifier.size(17.dp))
                    }
                    Row(Modifier.fillMaxWidth(0.95f),horizontalArrangement = Arrangement.SpaceBetween,verticalAlignment = Alignment.CenterVertically) {
                        Text(text = "Дата и время", color = Color.White, fontSize = 22.sp)
                        Image(painterResource(R.drawable.vector), contentDescription = "", Modifier.size(17.dp))
                    }
                    Row(Modifier.fillMaxWidth(0.95f),horizontalArrangement = Arrangement.SpaceBetween,verticalAlignment = Alignment.CenterVertically) {
                        Text(text = "Настройки звука", color = Color.White, fontSize = 22.sp)
                        Image(painterResource(R.drawable.vector), contentDescription = "", Modifier.size(17.dp))
                    }
                    Row(Modifier.fillMaxWidth(0.95f),horizontalArrangement = Arrangement.SpaceBetween,verticalAlignment = Alignment.CenterVertically) {
                        Text(text = "Проверить обновления", color = Color.White, fontSize = 22.sp)
                        Image(painterResource(R.drawable.vector), contentDescription = "", Modifier.size(17.dp))
                    }
                }



                //Bottom

                CreateNavigation(value = 4)
            }
        }
    }
}
