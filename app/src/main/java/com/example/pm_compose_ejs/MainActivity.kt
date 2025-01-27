package com.example.pm_compose_ejs

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.layout.wrapContentWidth
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Divider
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.VerticalDivider
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.pm_compose_ejs.ui.theme.PM_Compose_EjsTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            PM_Compose_EjsTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    ejercicio2(modifier = Modifier.padding(innerPadding))
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String,  modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
            .background(colorResource(R.color.teal_200))
            .padding(24.dp)


    )
}

@Composable
fun ejercicio2(modifier : Modifier = Modifier) {
    LazyColumn {
        items(items = listOf("Item 1", "Item 2", "Item 3", "Item 4", "Item 5")) { item ->
            Row(
                modifier = modifier.fillParentMaxWidth()
                .background(colorResource(R.color.teal_200))
                    .clickable {
                        println("Tarea completada")
                    },
                horizontalArrangement = Arrangement.SpaceAround
            ) {
                Image(
                    painter = painterResource(id = R.drawable.ic_launcher_foreground),
                    contentDescription = "image",
                    modifier = Modifier.wrapContentSize(Alignment.Center)
                )

                Text(
                    text = item,
                    modifier = Modifier
                        .fillMaxWidth()
                        .align(Alignment.CenterVertically),
                    textAlign = TextAlign.Center,
                )

            }
        }
    }
}

@Composable
fun ejercicio3(modifier : Modifier = Modifier) {
    LazyVerticalGrid(cells = GridCells.Fixed(2)){
        items(items = listOf("Item 1", "Item 2", "Item 3", "Item 4", "Item 5")) { item ->
    }
}
    }


@Preview(showBackground = true, showSystemUi = true)
@Composable
fun GreetingPreview() {
    PM_Compose_EjsTheme {
        Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
            Greeting(
                name = "Android",
                modifier = Modifier.padding(innerPadding)
            )
        }
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun GreetingPreview2() {
    PM_Compose_EjsTheme {
        PM_Compose_EjsTheme {
            Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                ejercicio2(modifier = Modifier.padding(innerPadding))
            }
        }
    }
}