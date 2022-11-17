package com.example.jetpack_compose

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class AlarmActivity : ComponentActivity() {
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
                CreateHeaderButtonProfile(header = "Будильник")
                //Main
                Column(
                    modifier = Modifier
                        .fillMaxWidth(0.95f)
                        .height(400.dp)
                ) {
                    Column(
                        modifier = Modifier
                            .fillMaxWidth(0.95f),
                        verticalArrangement = Arrangement.Center,
                        horizontalAlignment = Alignment.CenterHorizontally
                    ) {
                        Row(
                            modifier = Modifier
                                .fillMaxWidth(1f)
                                .clickable(
                                    onClick = {
                                        val int = Intent(this@AlarmActivity, EditAlarm::class.java)
                                        startActivity(int)
                                    }
                                ),
                            verticalAlignment = Alignment.CenterVertically,
                            horizontalArrangement = Arrangement.SpaceBetween
                        ) {
                            Text(text = "07:30", fontSize = 48.sp, color = Color.White)
                            val checkedState = remember { mutableStateOf(true) }
                            Switch(
                                checked = checkedState.value,
                                onCheckedChange = { checkedState.value = it },
                                Modifier.background(color = (if (checkedState.value) {
                                    Color(0xFFAAF683)
                                } else {
                                    Color(0xFFFF9B85)}), shape = RoundedCornerShape(50)).size(60.dp, 35.dp),

                                colors = SwitchDefaults.colors(
                                    checkedThumbColor = Color.White,
                                    checkedTrackColor = Color(0xFFAAF683),
                                    uncheckedThumbColor = Color.White,
                                    uncheckedTrackColor = Color(0xFFFF9B85)
                                )
                            )
                        }
                        Row(
                            modifier = Modifier
                                .fillMaxWidth(1f)
                                .clickable(
                                    onClick = {
                                        val int = Intent(this@AlarmActivity, EditAlarm::class.java)
                                        startActivity(int)
                                    }
                                ),
                            verticalAlignment = Alignment.CenterVertically,
                            horizontalArrangement = Arrangement.SpaceBetween
                        ) {
                            Text(text = "08:00", fontSize = 48.sp, color = Color.White)
                            val checkedState = remember { mutableStateOf(true) }
                            Switch(
                                checked = checkedState.value,
                                onCheckedChange = { checkedState.value = it },
                                Modifier.background(color = (if (checkedState.value) {
                                    Color(0xFFAAF683)
                                } else {
                                    Color(0xFFFF9B85)
                                }

                                ), shape = RoundedCornerShape(50)).size(60.dp, 35.dp),

                                colors = SwitchDefaults.colors(
                                    checkedThumbColor = Color.White,
                                    checkedTrackColor = Color(0xFFAAF683),
                                    uncheckedThumbColor = Color.White,
                                    uncheckedTrackColor = Color(0xFFFF9B85)
                                )
                            )
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
                        colors = ButtonDefaults.buttonColors(backgroundColor = Color(	170, 246, 131)) ,
                        onClick = {
                            val int = Intent(this@AlarmActivity, AddAlarmActivity::class.java)
                            startActivity(int)

                        }) {
                        Text(text = "Добавить будильник", color = Color.White, fontSize = 17.sp)
                    }
                    CreateNavigation(value = 2)
                }

            }
        }
    }
}