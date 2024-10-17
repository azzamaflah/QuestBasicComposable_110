package com.example.questbasiccomposable_110

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
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
fun Basic(modifier: Modifier = Modifier) {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,
        modifier = Modifier.fillMaxSize().padding(16.dp) // Padding keseluruhan
    ) {
        Text(
            text = "Login",
            style = TextStyle(fontSize = 50.sp, fontWeight = FontWeight.Bold)
        )

        Spacer(modifier = Modifier.height(16.dp)) // Jarak antara elemen

        Text(text = "Halaman login")

        Spacer(modifier = Modifier.height(40.dp)) // Jarak sebelum gambar

        Image(
            painter = painterResource(id = R.drawable.ipul),
            contentDescription = null,
            modifier = Modifier.size(250.dp) // Ukuran gambar
        )

        Spacer(modifier = Modifier.height(16.dp)) // Jarak setelah gambar

        Text(
            text = "fans ipul nih bos senggol dong",
            style = TextStyle(fontSize = 20.sp, fontWeight = FontWeight.Medium)
        )

        Spacer(modifier = Modifier.height(40.dp)) // Jarak sebelum teks tambahan

        Text(
            text = "Nama",
            style = TextStyle(fontSize = 20.sp, fontWeight = FontWeight.Bold)
        )

        Spacer(modifier = Modifier.height(8.dp)) // Jarak sebelum nama

        Text(
            text = "Azzam Hafidh Aflah",
            style = TextStyle(
                fontSize = 20.sp,
                fontWeight = FontWeight.Medium,
                color = Color(0xFFB22222) // Warna merah agak gelap
            )
        )

        Spacer(modifier = Modifier.height(8.dp)) // Jarak sebelum angka

        Text(
            text = "20220140110",
            style = TextStyle(
                fontSize = 20.sp,
                fontWeight = FontWeight.Medium
            ),
        )

        Spacer(modifier = Modifier.height(40.dp)) // Jarak sebelum gambar kedua

        Image(
            painter = painterResource(id = R.drawable.ipul2),
            contentDescription = null,
            modifier = Modifier.size(250.dp) // Ukuran gambar kedua
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
