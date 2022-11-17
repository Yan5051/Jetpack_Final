package com.example.jetpack_compose

import android.content.Intent
import androidx.activity.OnBackPressedCallback
import androidx.activity.compose.LocalOnBackPressedDispatcherOwner
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.platform.LocalLifecycleOwner
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.core.content.ContextCompat.startActivity


@Composable
fun CreateHeaderButtonProfile(header: String){
    val context = LocalContext.current
    Row(
        modifier = Modifier
            .fillMaxHeight(0.1f) //0.070
            .fillMaxWidth(0.95f)
            .offset(0.dp, 20.dp),
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically
    ) {
        Text(header, fontWeight = FontWeight.Bold, fontSize = 25.sp, color = Color.White)
        Image(painterResource(R.drawable.avatar), contentDescription = "",
            Modifier
                .size(55.dp)
                .clickable(
                    onClick = {
                        val ints = Intent(context, ProfileActivity::class.java)
                        startActivity(context, ints, null)
                    }
                ))
    }
}

@Composable
fun CreateHeaderButtonBack(header: String) {

    val context = LocalContext.current
    Row(
        modifier = Modifier
            .fillMaxHeight(0.1f) //0.070
            .fillMaxWidth(0.95f),
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically
    ) {
        Text(header, fontWeight = FontWeight.Bold, fontSize = 25.sp, color = Color.White)
        Image(painterResource(R.drawable.backbutton), contentDescription = "",
            Modifier
                .size(55.dp)
                .clickable(

                    onClick = {

                        val ints = Intent(context, MainActivity::class.java)
                        startActivity(context, ints, null)
                    }))
    }
}
@Composable
fun CreateNavigation(value: Int){
    val context = LocalContext.current
    Row(
        modifier = Modifier
            .width(310.dp)
            .height(65.dp)
    ){
        Card(
            shape = RoundedCornerShape(30.dp,30.dp,0.dp,0.dp),
            elevation = 4.dp
        ) {
            Row(
                Modifier
                    .background(Color(170, 246, 131))
                    .fillMaxWidth(1f)
                    .height(72.dp),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.SpaceAround
            ) {
                //List
                if (value == 1){
                    Column(
                        Modifier
                            .width(45.dp),
                        verticalArrangement = Arrangement.SpaceBetween,
                        horizontalAlignment = Alignment.CenterHorizontally
                    ) {
                        Image(painterResource(R.drawable.list), contentDescription = "",
                            Modifier
                                .size(32.dp)
                                .clickable(
                                    onClick = {
                                        val ints = Intent(context, MainActivity::class.java)
                                        startActivity(context, ints, null)
                                    }
                                ))
                        Text(text = "List", fontSize = 11.sp, color = Color(96, 211, 148))
                    }
                }
                else {
                    Column(
                        Modifier
                            .width(45.dp),
                        verticalArrangement = Arrangement.SpaceBetween,
                        horizontalAlignment = Alignment.CenterHorizontally
                    ) {
                        Image(painterResource(R.drawable.listred), contentDescription = "",
                            Modifier
                                .size(32.dp)
                                .clickable(
                                    onClick = {
                                        val ints = Intent(context, MainActivity::class.java)
                                        startActivity(context, ints, null)
                                    }
                                ))
                        Text(text = "List", fontSize = 11.sp, color = Color(238, 96, 85))
                    }
                }
                //Alarm
                if(value == 2){
                    Column(
                        Modifier
                            .width(45.dp),
                        verticalArrangement = Arrangement.SpaceBetween,
                        horizontalAlignment = Alignment.CenterHorizontally
                    ) {
                        Image(painterResource(R.drawable.alarmgreen), contentDescription = "",
                            Modifier
                                .size(32.dp)
                                .clickable(
                                    onClick = {
                                        val ints = Intent(context, AlarmActivity::class.java)
                                        startActivity(context, ints, null)
                                    }
                                ))
                        Text(text = "Alarm", fontSize = 11.sp, color = Color(96, 211, 148))
                    }
                }
                else {
                    Column(
                        Modifier
                            .width(45.dp),
                        verticalArrangement = Arrangement.SpaceBetween,
                        horizontalAlignment = Alignment.CenterHorizontally
                    ) {
                        Image(painterResource(R.drawable.alarm), contentDescription = "",
                            Modifier
                                .size(32.dp)
                                .clickable(
                                    onClick = {
                                        val ints = Intent(context, AlarmActivity::class.java)
                                        startActivity(context, ints, null)
                                    }
                                ))
                        Text(text = "Alarm", fontSize = 11.sp, color = Color(238, 96, 85))
                    }
                }
                //Calendar
                if(value == 3){
                    Column(
                        Modifier
                            .width(45.dp),
                        verticalArrangement = Arrangement.SpaceBetween,
                        horizontalAlignment = Alignment.CenterHorizontally
                    ) {
                        Image(painterResource(R.drawable.calendargreen), contentDescription = "",
                            Modifier
                                .size(32.dp)
                                .clickable(
                                    onClick = {
                                        val ints = Intent(context, CalendarActivity::class.java)
                                        startActivity(context, ints, null)
                                    }
                                ))
                        Text(text = "Calendar", fontSize = 11.sp, color = Color(96, 211, 148))
                    }
                }
                else {
                    Column(
                        Modifier
                            .width(45.dp),
                        verticalArrangement = Arrangement.SpaceBetween,
                        horizontalAlignment = Alignment.CenterHorizontally
                    ) {
                        Image(painterResource(R.drawable.calendar), contentDescription = "",
                            Modifier
                                .size(32.dp)
                                .clickable(
                                    onClick = {
                                        val ints = Intent(context, CalendarActivity::class.java)
                                        startActivity(context, ints, null)
                                    }
                                ))
                        Text(text = "Calendar", fontSize = 11.sp, color = Color(238, 96, 85))
                    }
                }
                //Settings
                if (value == 4){
                    Column(
                        Modifier
                            .width(45.dp),
                        verticalArrangement = Arrangement.SpaceBetween,
                        horizontalAlignment = Alignment.CenterHorizontally
                    ) {
                        Image(painterResource(R.drawable.settingsgreen), contentDescription = "",
                            Modifier
                                .size(32.dp)
                                .clickable(
                                    onClick = {
                                        val ints = Intent(context, settingsActivity::class.java)
                                        startActivity(context, ints, null)
                                    }
                                ))
                        Text(text = "Settings", fontSize = 11.sp, color = Color(96, 211, 148))
                    }
                }
                else {
                    Column(
                        Modifier
                            .width(45.dp),
                        verticalArrangement = Arrangement.SpaceBetween,
                        horizontalAlignment = Alignment.CenterHorizontally
                    ) {
                        Image(painterResource(R.drawable.settings), contentDescription = "",
                            Modifier
                                .size(32.dp)
                                .clickable(
                                    onClick = {
                                        val ints = Intent(context, settingsActivity::class.java)
                                        startActivity(context, ints, null)
                                    }
                                ))
                        Text(text = "Settings", fontSize = 11.sp, color = Color(238, 96, 85))
                    }
                }
            }
        }
    }
}
@Composable
fun CreateDayOnEditAlarm(name: String){
    Row(Modifier.fillMaxWidth(0.95f),horizontalArrangement = Arrangement.Start, verticalAlignment = Alignment.CenterVertically) {
        val checkedState = remember { mutableStateOf(false) }
        Checkbox(checked = checkedState.value, onCheckedChange = { checkedState.value = it },
            Modifier
                .background(Color.White)
                .height(20.dp)
                .width(20.dp), colors = CheckboxDefaults.colors(checkedColor = Color(255, 217, 125),uncheckedColor = Color(255, 217, 125), checkmarkColor = Color(255, 217, 125)))
        Text(name, fontSize = 16.sp, color = Color.White, modifier = Modifier.offset(4.dp,0.dp))
    }
}
