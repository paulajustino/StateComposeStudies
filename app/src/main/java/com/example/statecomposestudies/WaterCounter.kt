package com.example.statecomposestudies

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.statecomposestudies.ui.theme.StateComposeStudiesTheme

@Composable
fun WaterCounter(modifier: Modifier = Modifier) {

    Column(modifier = modifier.padding(16.dp)) {
        var count by rememberSaveable { mutableStateOf(0) }

        if (count > 0) {
            Text(text = "You've had $count water glasses.")
        }

        Button(
            enabled = count < 10,
            onClick = { count++ }
        ) {
            Text(text = "Add one")
        }
    }
}

@Preview
@Composable
fun WaterCounterPreview() {
    StateComposeStudiesTheme {
        WaterCounter()
    }
}