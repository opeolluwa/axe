package com.opeolluwa.compose

import androidx.compose.runtime.remember
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.rounded.ArrowBack
import androidx.compose.material.icons.rounded.ArrowBack
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Shapes
import androidx.compose.material3.TextField
import androidx.compose.ui.draw.clip
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.graphics.RectangleShape
import com.opeolluwa.compose.ui.theme.LoginFormTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            LoginFormTheme {
                Scaffold(
                    modifier = Modifier
                        .fillMaxSize()
                        .background(Color(0x00000000))
                ) { innerPadding ->
                    LogInPage()
                }
            }
        }
    }
}


@Composable
fun LogInPage(modifier: Modifier = Modifier) {
    var text = ""
    Column(Modifier.padding(horizontal = 30.dp, vertical = 45.dp)) {
        Icon(
            Icons.AutoMirrored.Rounded.ArrowBack,
            contentDescription = "go back to sign up page",
            modifier = Modifier
                .padding(bottom = 20.dp)
                .clip(RoundedCornerShape(20.dp))
                .background(Color(0xFF6d6d6e))
        )
        Text(
            text = stringResource(R.string.login_page_title),
            fontSize = 28.sp,
            fontWeight = FontWeight.W400
        )

        Text(text = "Email", Modifier.padding(top = 40.dp))
        OutlinedTextField(
            value = "",
            onValueChange = { text = "" },
//            placeholder = stringResource(R.string.email_field_placeholder),
            modifier = Modifier
                .height(65.dp)
                .padding(top = 10.dp)
                .border(color = Color(0xFFFFFFFF), shape = RectangleShape, width = 1.dp)
                .fillMaxWidth()
                .clip(RoundedCornerShape(12.dp))
        )


        Text(text = "Password", Modifier.padding(top = 40.dp))
        OutlinedTextField(
            value = "",
            onValueChange = { text = "" },
//            placeholder = stringResource(R.string.email_field_placeholder),
            modifier = Modifier
                .height(65.dp)
                .padding(top = 10.dp)
                .border(color = Color(0xFFFFFFFF), shape = RectangleShape, width = 1.dp)
                .fillMaxWidth()
                .clip(RoundedCornerShape(12.dp))
        )
        Text(text = "Forgot password?", Modifier.padding(top = 40.dp))

    }
}



