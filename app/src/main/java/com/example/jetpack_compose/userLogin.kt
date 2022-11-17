package com.example.jetpack_compose

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class userLogin : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .background(Color(96, 211, 148)),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Top
            ) {
                CreateHeaderButtonBack(header = "Регистрация")
                Column(
                    Modifier
                        .fillMaxWidth(0.95f)
                        .height(260.dp)
                        .offset(0.dp,100.dp),
                    verticalArrangement = Arrangement.SpaceBetween,
                    horizontalAlignment = Alignment.CenterHorizontally

                ) {
                    val message = remember{mutableStateOf("")}
                    TextField(value = message.value, onValueChange = {message.value = it}, Modifier.clip(RoundedCornerShape(15))
                        .background(Color.White).fillMaxWidth(0.95f).height(54.dp),
                        placeholder = { Text("Имя пользователя") },
                        )
                    val messagee = remember{mutableStateOf("")}
                    TextField(value = messagee.value, onValueChange = {messagee.value = it}, Modifier.clip(RoundedCornerShape(15))
                        .background(Color.White).fillMaxWidth(0.95f).height(54.dp),
                            placeholder = { Text("Адрес электорнной почты") },
                    )
                    val messagee1 = remember{mutableStateOf("")}
                    TextField(value = messagee1.value, onValueChange = {messagee1.value = it}, Modifier.clip(RoundedCornerShape(15))
                        .background(Color.White).fillMaxWidth(0.95f).height(54.dp),
                        placeholder = { Text("Пароль") },
                    )
                    Button(
                        modifier = Modifier.fillMaxWidth(0.95f).height(48.dp),
                        shape = RoundedCornerShape(13.dp),
                        colors = ButtonDefaults.buttonColors(backgroundColor = Color(	170, 246, 131)) ,
                        onClick = {
                            val int = Intent(this@userLogin, MainActivity::class.java)
                            startActivity(int)
                        }) {
                        Text(text = "Регестрация", color = Color.White, fontSize = 17.sp)
                    }

                }
            }
        }
    }
}