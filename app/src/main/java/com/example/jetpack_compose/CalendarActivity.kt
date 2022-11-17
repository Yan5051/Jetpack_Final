package com.example.jetpack_compose

import android.os.Bundle
import android.widget.CalendarView
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.viewinterop.AndroidView


class CalendarActivity : ComponentActivity() {
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

                CreateHeaderButtonProfile(header = "Календарь")

                //main
                Column(

                ) {
                    AndroidView({ CalendarView(it) },
                        modifier = Modifier.wrapContentWidth(),

                        update = { views ->

                            views.setOnDateChangeListener { calendarView, i, i2, i3 ->

                            }
                        }

                    )
                }
                //Bottom


                CreateNavigation(value = 3)



            }
        }
    }
}