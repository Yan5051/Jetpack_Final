package com.example.jetpack_compose

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class EditTaskActivity : ComponentActivity() {
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
                CreateHeaderButtonBack(header = "Изменить задачу")

                Column(
                    Modifier
                        .fillMaxWidth(0.95f)
                        .height(220.dp)
                        .offset(0.dp,-100.dp),
                    verticalArrangement = Arrangement.SpaceBetween
                ) {
                    TextField(value = "Заголовок задачи", onValueChange = {},
                        Modifier
                            .clip(RoundedCornerShape(7))
                            .background(Color.White)
                            .fillMaxWidth(0.95f)
                            .height(50.dp),
                        textStyle = TextStyle(fontSize =  13.sp),)
                    Row(
                        Modifier
                            .fillMaxWidth(0.95f),
                        horizontalArrangement = Arrangement.SpaceBetween,
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        TextField(value = "16:30", onValueChange = {},
                            Modifier
                                .clip(RoundedCornerShape(7))
                                .background(Color.White)
                                .width(155.dp)
                                .height(50.dp),
                            //placeholder = { Text("Hello Work!") },
                            leadingIcon = { Icon(painterResource(R.drawable.alarm), contentDescription = "") })
                        TextField(value = "14.01.2021", onValueChange = {},
                            Modifier
                                .clip(RoundedCornerShape(7))
                                .background(Color.White)
                                .width(155.dp)
                                .height(50.dp),
                            //placeholder = { Text("Hello Work!") },
                            leadingIcon = { Icon(painterResource(R.drawable.calendar), contentDescription = "") })
                    }
                    TextField(value = "Описание задачи", onValueChange = {},
                        Modifier
                            .clip(RoundedCornerShape(7))
                            .background(Color.White)
                            .fillMaxWidth(0.95f)
                            .height(100.dp),
                        //placeholder = { Text("Hello Work!") }
                    )
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
                        colors = ButtonDefaults.buttonColors(backgroundColor = Color(238, 96, 85)) , //238, 96, 85, 1
                        onClick = {
                            val int = Intent(this@EditTaskActivity, MainActivity::class.java)
                            startActivity(int)
                        }) {
                        Text(text = "Удалить задачу", color = Color.White, fontSize = 17.sp)
                    }
                    Button(
                        modifier = Modifier.fillMaxWidth(0.95f).height(48.dp),
                        shape = RoundedCornerShape(11.dp),
                        colors = ButtonDefaults.buttonColors(backgroundColor = Color(170, 246, 131)) ,
                        onClick = {
                            val int = Intent(this@EditTaskActivity, MainActivity::class.java)
                            startActivity(int)
                        }) {
                        Text(text = "Записать задачу", color = Color.White, fontSize = 17.sp)
                    }
                }
            }
        }
    }
}
