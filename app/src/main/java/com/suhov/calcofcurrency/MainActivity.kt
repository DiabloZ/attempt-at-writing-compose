package com.suhov.calcofcurrency

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.suhov.calcofcurrency.ui.theme.CalcOfCurrencyTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            CalcOfCurrencyTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    DefaultPreview()
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String) {
    Text(text = "Hello $name!",
    modifier = Modifier
        .padding(10.dp)
        )
}

@Preview(showBackground = true,
showSystemUi = true)
@Composable
fun DefaultPreview() {
    CalcOfCurrencyTheme {
        Column(modifier = Modifier.fillMaxSize()) {
            Greeting("Yeap")
            Greeting("Android")
        }
    }
}