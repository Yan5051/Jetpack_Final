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
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.jetpack_compose.R


class EditAlarm : ComponentActivity() {
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
                CreateHeaderButtonBack(header = "Изменить будильник")
                Column(
                    Modifier
                        .fillMaxWidth(0.95f)
                        .height(400.dp)
                        .offset(0.dp, -40.dp),
                    horizontalAlignment = Alignment.Start,
                    verticalArrangement = Arrangement.SpaceBetween
                ) {
                    Row(
                        Modifier
                            .fillMaxWidth(1f),
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
                    Text("Повторять каждый", fontSize = 16.sp, color = Color.White)
                    CreateDayOnEditAlarm(name = "Понедельник")
                    CreateDayOnEditAlarm(name = "Вторник")
                    CreateDayOnEditAlarm(name = "Среда")
                    CreateDayOnEditAlarm(name = "Четверг")
                    CreateDayOnEditAlarm(name = "Пятница")
                    CreateDayOnEditAlarm(name = "Суббота")
                    CreateDayOnEditAlarm(name = "Воскресенье")
                }
                Column(
                    Modifier
                        .fillMaxWidth(0.95f)
                        .height(120.dp),
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.SpaceAround
                ) {
                    Button(
                        modifier = Modifier
                            .fillMaxWidth(0.95f)
                            .height(48.dp),
                        shape = RoundedCornerShape(11.dp),
                        colors = ButtonDefaults.buttonColors(backgroundColor = Color(238, 96, 85)) , //238, 96, 85, 1
                        onClick = {
                            val int = Intent(this@EditAlarm, AlarmActivity::class.java)
                            startActivity(int)
                        }) {
                        Text(text = "Удалить будильник", color = Color.White, fontSize = 17.sp)
                    }
                    Button(
                        modifier = Modifier
                            .fillMaxWidth(0.95f)
                            .height(48.dp),
                        shape = RoundedCornerShape(11.dp),
                        colors = ButtonDefaults.buttonColors(backgroundColor = Color(170, 246, 131)) ,
                        onClick = {
                            val int = Intent(this@EditAlarm, AlarmActivity::class.java)
                            startActivity(int)
                        }) {
                        Text(text = "Сохранить будильник", color = Color.White, fontSize = 17.sp)
                    }
                }
            }
        }
    }
}
