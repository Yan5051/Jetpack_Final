package com.example.jetpack_compose

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class ProfileActivity : ComponentActivity() {
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
                CreateHeaderButtonBack(header = "Профиль пользователя")
                Column(
                    Modifier
                        .fillMaxWidth(0.95f).height(250.dp),
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.SpaceBetween
                ) {
                    Image(painterResource(R.drawable.bigavatars), contentDescription = "", Modifier.size(193.dp))
                    Text(text = "Вход не выполнен", fontSize = 16.sp, color = Color.White)
                }
                Column(
                    Modifier
                        .fillMaxWidth(0.95f)
                        .height(120.dp),
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.SpaceAround
                ) {
                    Button(
                        modifier = Modifier.fillMaxWidth(0.95f).height(48.dp),
                        shape = RoundedCornerShape(11.dp),
                        colors = ButtonDefaults.buttonColors(backgroundColor = Color(170, 246, 131)) ,
                        onClick = {
                            val int = Intent(this@ProfileActivity, UserLogins::class.java)
                            startActivity(int)

                        }) {
                        Text(text = "Войти", color = Color.White, fontSize = 17.sp)
                    }
                    Button(
                        modifier = Modifier.fillMaxWidth(0.95f).height(48.dp),
                        shape = RoundedCornerShape(11.dp),
                        colors = ButtonDefaults.buttonColors(backgroundColor = Color(170, 246, 131)) ,
                        onClick = {
                            val int = Intent(this@ProfileActivity, userLogin::class.java)
                            startActivity(int)
                        }) {
                        Text(text = "Регестрация", color = Color.White, fontSize = 17.sp)
                    }
                }

            }

        }
    }
}