package com.example.jetpack_compose

import android.content.Intent
import android.os.Build
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.annotation.RequiresApi
import androidx.compose.foundation.*
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp



class MainActivity : ComponentActivity() {
    @RequiresApi(Build.VERSION_CODES.Q)
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

                CreateHeaderButtonProfile(header = "Список дел")

                //Main
                Column(
                    modifier = Modifier
                        //.fillMaxHeight(0.7f)
                        .height(300.dp)
                        .fillMaxWidth(0.95f)
                        .offset(0.dp, (-70).dp),
                    verticalArrangement = Arrangement.SpaceBetween

                ) {
                    Column(
                        modifier = Modifier
                            .fillMaxWidth(1f)
                            .height(90.dp).clickable (
                                onClick = {
                                    val int = Intent(this@MainActivity, EditTaskActivity::class.java)
                                    startActivity(int)
                                }
                            ),

                        ) {
                        Card(
                            shape = RoundedCornerShape(30.dp, 0.dp, 30.dp, 0.dp),
                            elevation = 4.dp

                        ) {
                            Column(
                                modifier = Modifier
                                    .fillMaxSize()
                                    .background(Color(255, 217, 125)),
                                verticalArrangement = Arrangement.SpaceAround,
                                horizontalAlignment = Alignment.CenterHorizontally
                            ) {
                                Row(
                                    modifier = Modifier
                                        .fillMaxWidth(0.9f)
                                        .fillMaxHeight(0.7f),
                                    verticalAlignment = Alignment.CenterVertically,
                                    horizontalArrangement = Arrangement.SpaceBetween
                                ) {
                                    Column(
                                        modifier = Modifier
                                            .fillMaxWidth(0.7f),
                                        verticalArrangement = Arrangement.SpaceBetween
                                    ) {
                                        Text(
                                            text = "Вечерний поход в кино",
                                            fontSize = 18.sp,
                                            color = Color.White
                                        )
                                        Text(
                                            text = "Идем в кино с коллегами!",
                                            fontSize = 12.sp,
                                            color = Color(235, 235, 235)
                                        )
                                    }
                                    Column() {
                                        Text(
                                            text = "10.02.2021",
                                            fontSize = 12.sp,
                                            color = Color(235, 235, 235)
                                        )
                                        Text(
                                            text = "19:40",
                                            fontSize = 12.sp,
                                            color = Color(235, 235, 235)
                                        )
                                    }
                                }
                            }
                        }
                    }
                    Column(
                        modifier = Modifier
                            .fillMaxWidth(1f)
                            .height(90.dp).clickable (
                                onClick = {
                                    val int = Intent(this@MainActivity, EditTaskActivity::class.java)
                                    startActivity(int)
                                }
                            )

                    ) {
                        Card(
                            shape = RoundedCornerShape(30.dp, 0.dp, 30.dp, 0.dp),
                            elevation = 4.dp

                        ) {
                            Column(
                                modifier = Modifier
                                    .fillMaxSize()
                                    .background(Color(255, 217, 125)),
                                verticalArrangement = Arrangement.SpaceAround,
                                horizontalAlignment = Alignment.CenterHorizontally
                            ) {
                                Row(
                                    modifier = Modifier
                                        .fillMaxWidth(0.9f)
                                        .fillMaxHeight(0.7f),
                                    verticalAlignment = Alignment.CenterVertically,
                                    horizontalArrangement = Arrangement.SpaceBetween
                                ) {
                                    Column(
                                        modifier = Modifier
                                            .fillMaxWidth(0.7f),
                                        verticalArrangement = Arrangement.SpaceBetween
                                    ) {
                                        Text(
                                            text = "Забрать заказ Ozon",
                                            fontSize = 18.sp,
                                            color = Color.White
                                        )
                                        Text(
                                            text = "Пункт выдачи на ул. Ленина, 103",
                                            fontSize = 12.sp,
                                            color = Color(235, 235, 235)
                                        )
                                    }
                                    Column() {
                                        Text(
                                            text = "10.02.2021",
                                            fontSize = 12.sp,
                                            color = Color(235, 235, 235)
                                        )
                                        Text(
                                            text = "19:40",
                                            fontSize = 12.sp,
                                            color = Color(235, 235, 235)
                                        )
                                    }
                                }
                            }
                        }
                    }
                    Column(
                        modifier = Modifier
                            .fillMaxWidth(1f)
                            .height(90.dp).clickable (
                                onClick = {
                                    val int = Intent(this@MainActivity, EditTaskActivity::class.java)
                                    startActivity(int)
                                }
                            )
                    ) {
                        Card(
                            shape = RoundedCornerShape(30.dp, 0.dp, 30.dp, 0.dp),
                            elevation = 4.dp

                        ) {
                            Column(
                                modifier = Modifier
                                    .fillMaxSize()
                                    .background(Color(255, 217, 125)),
                                verticalArrangement = Arrangement.SpaceAround,
                                horizontalAlignment = Alignment.CenterHorizontally
                            ) {
                                Row(
                                    modifier = Modifier
                                        .fillMaxWidth(0.9f)
                                        .fillMaxHeight(0.7f),
                                    verticalAlignment = Alignment.CenterVertically,
                                    horizontalArrangement = Arrangement.SpaceBetween
                                ) {
                                    Column(
                                        modifier = Modifier
                                            .fillMaxWidth(0.7f),
                                        verticalArrangement = Arrangement.SpaceBetween
                                    ) {
                                        Text(
                                            text = "Запись в автосервис",
                                            fontSize = 18.sp,
                                            color = Color.White
                                        )
                                        Text(
                                            text = "Сдать автомобиль в автосервис на ул. Бисертская, д. 14. Замена масла",
                                            fontSize = 12.sp,
                                            color = Color(235, 235, 235)
                                        )
                                    }
                                    Column() {
                                        Text(
                                            text = "10.02.2021",
                                            fontSize = 12.sp,
                                            color = Color(235, 235, 235)
                                        )
                                        Text(
                                            text = "19:40",
                                            fontSize = 12.sp,
                                            color = Color(235, 235, 235)
                                        )
                                    }
                                }
                            }
                        }
                    }
                }
                //Bottom

                Column(
                    modifier = Modifier
                        .height(150.dp)
                        .fillMaxWidth(0.95f),
                    verticalArrangement = Arrangement.SpaceBetween,
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Button(
                        modifier = Modifier
                            .width(312.dp)
                            .height(48.dp),
                        shape = RoundedCornerShape(13.dp),
                        colors = ButtonDefaults.buttonColors(
                            backgroundColor = Color(
                                170,
                                246,
                                131
                            )
                        ),
                        onClick = {
                            val int = Intent(this@MainActivity, AddTaskActivity::class.java)
                            startActivity(int)
                        }) {
                        Text(text = "Добавить задачу", color = Color.White, fontSize = 17.sp)
                    }
                    CreateNavigation(value = 1)
                }
            }
        }
    }
}