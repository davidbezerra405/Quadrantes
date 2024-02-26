package com.example.quadrantes

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.VerticalAlignmentLine
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.quadrantes.ui.theme.QuadrantesTheme
import org.intellij.lang.annotations.JdkConstants.HorizontalAlignment

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            QuadrantesTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Greeting()
                }
            }
        }
    }
}

@Composable
fun Greeting(modifier: Modifier = Modifier) {
    Column(
        modifier = Modifier.fillMaxSize()
    ) {
        Row(
            modifier = Modifier.weight(1f, fill = true)
        ) {
            Column(
                modifier = Modifier
                    .background(Color(0xFFEADDFF))
                    .weight(weight = 1f, fill = true)
                    .fillMaxSize()
                    .padding(16.dp)
                    .wrapContentSize(Alignment.Center)
            ) {
                Text(
                    text = stringResource(R.string.txt_q1_cab),
                    fontWeight = FontWeight.Bold,
                    textAlign = TextAlign.Center,
                    modifier = Modifier
                        .padding(bottom = 16.dp),
                )
                Text(
                    text = stringResource(R.string.txt_q1_texto),
                    modifier = modifier,
                    textAlign = TextAlign.Justify
                )
            }
            Column(
                modifier = Modifier
                    .background(Color(0xFFD0BCFF))
                    .weight(weight = 1f, fill = true)
                    .fillMaxSize()
                    .padding(16.dp)
                    .wrapContentSize(Alignment.Center)
            ) {
                Text(
                    text = stringResource(R.string.txt_q2_cab),
                    fontWeight = FontWeight.Bold,
                    textAlign = TextAlign.Center,
                    modifier = Modifier
                        .padding(bottom = 16.dp)
                )
                Text(
                    text = stringResource(R.string.txt_q2_texto),
                    modifier = modifier,
                    textAlign = TextAlign.Justify
                )
            }
        }
        Row(
            modifier = Modifier.weight(1f, fill = true)
        ) {
            Column(
                modifier = Modifier
                    .background(Color(0xFFB69DF8))
                    .weight(weight = 1f, fill = true)
                    .fillMaxSize()
                    .padding(16.dp)
                    .wrapContentSize(Alignment.Center)
            ) {
                Text(
                    text = stringResource(R.string.txt_q3_cab),
                    fontWeight = FontWeight.Bold,
                    textAlign = TextAlign.Center,
                    modifier = Modifier
                        .padding(bottom = 16.dp)
                )
                Text(
                    text = stringResource(R.string.txt_q3_texto),
                    modifier = modifier,
                    textAlign = TextAlign.Justify
                )
            }
            Column(
                modifier = Modifier
                    .background(Color(0xFFF6EDFF))
                    .weight(weight = 1f, fill = true)
                    .fillMaxSize()
                    .padding(16.dp)
                    .wrapContentSize(Alignment.Center)
            ) {
                Text(
                    text = stringResource(R.string.txt_q4_cab),
                    fontWeight = FontWeight.Bold,
                    textAlign = TextAlign.Center,
                    modifier = Modifier
                        .padding(bottom = 16.dp)
                )
                Text(
                    text = stringResource(R.string.txt_q4_texto),
                    modifier = modifier,
                    textAlign = TextAlign.Justify
                )
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    QuadrantesTheme {
        Greeting()
    }
}