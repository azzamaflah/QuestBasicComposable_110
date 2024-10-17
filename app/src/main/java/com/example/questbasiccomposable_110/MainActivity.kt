package com.example.questbasiccomposable_110

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.questbasiccomposable_110.ui.theme.QuestBasicComposable_110Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            QuestBasicComposable_110Theme {
                Scaffold( modifier = Modifier.fillMaxSize() ) { innerPadding ->
                    Basic(modifier = Modifier.padding(innerPadding))

                }
            }
        }
    }
}

@Composable
fun Basic(modifier: Modifier = Modifier){
    Column (
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,
        modifier = Modifier.fillMaxSize()
    ){
        Text(text = "Login",
            style = TextStyle(fontSize = 50.sp,
                fontWeight = FontWeight.Bold)
        )
        Text(text = "Halaman login")
        Image(painter = painterResource(
            id = R.drawable.ipul
        ),
            contentDescription = null,
            modifier = Modifier.run { padding(top = 40.dp).size(250.dp) }
        )
        Text(
            text = "fans ipul nih bos senggol dong",
            style = TextStyle(
                fontSize = 20.sp,
                fontWeight = FontWeight.Medium
            ),
            modifier = Modifier.padding(top = 16.dp)
        )

        Text(text = "Nama",
            style = TextStyle(fontSize = 20.sp,
                fontWeight = FontWeight.Bold),
            modifier = Modifier.padding(top = 40.dp)
        )
        Text(text = "Azzam Hafidh Aflah",
            style = TextStyle(
                fontSize = 20.sp,
                fontWeight = FontWeight.Medium,
                color = Color(0xFFB22222) // ini buat warnya menjadi merah agak kegelapan
            )
        )
        Text(
            text = "20220140110",
            style = TextStyle(
                fontSize = 20.sp,
                fontWeight = FontWeight.Medium
            ),

        )


    }
}
@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    QuestBasicComposable_110Theme {
        Basic()
    }
}