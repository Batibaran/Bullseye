package com.barna.bullseye

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Slider
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.barna.bullseye.ui.theme.BullseyeTheme


@Composable
fun GameScreen() {
    Column(
        verticalArrangement = Arrangement.Center ,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)
    ) {
        Spacer(modifier = Modifier.weight(.5f))
        Column (
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.SpaceEvenly,
            modifier = Modifier.weight(9f)
            ){
            Text(stringResource(R.string.instruction_text))
            Text(stringResource(R.string.target_number_text), fontSize = 32.sp, fontWeight = FontWeight.Bold)
            Row(verticalAlignment = Alignment.CenterVertically) {
                Text(
                    stringResource(R.string.min_number_text),
                    textAlign = TextAlign.Center,
                    modifier = Modifier.padding(start = 16.dp))
                Slider(
                    value = 0.5f,
                    valueRange = 0.01f..1f,
                    onValueChange = {},
                    modifier = Modifier.weight(1f)
                )
                Text(
                    stringResource(R.string.max_number_text),
                    textAlign = TextAlign.Center,
                    modifier = Modifier.padding(start = 16.dp)
                    )
            }
            Button(onClick = {}) {
                Text(stringResource(R.string.button_text))
            }
        }
        Spacer(modifier = Modifier.weight(.5f))
    }
}

@Preview(showBackground = true)
@Composable
fun GameScreenPreview() {
    BullseyeTheme {
        GameScreen()
    }
}