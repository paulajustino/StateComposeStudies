package com.example.statecomposestudies

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun Counter(
    count: MutableState<Int>,
    onIncrement: () -> Unit,
    modifier: Modifier = Modifier)
{
    Column(modifier = modifier.padding(16.dp)) {
        if (count.value > 0) {
            Text(text = "You've had ${count.value} water glasses.")
        }
        Button(
            onClick = onIncrement,
            modifier = Modifier.padding(top = 8.dp),
            enabled = count.value < 10
        ) {
            Text(text = "Add one")
        }
    }
}
