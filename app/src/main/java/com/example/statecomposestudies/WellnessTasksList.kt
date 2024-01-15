package com.example.statecomposestudies

import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

@Composable
fun WellnessTasksList(
    modifier: Modifier = Modifier,
    list: List<WellnessTask>,
    onCloseTask: (WellnessTask) -> Unit
) {
    LazyColumn(
        modifier = modifier
    ) {
        items(
            items = list,
            // estado de cada item é originalmente vinculado à sua posição na lista
            // agora será vinculado ao seu id
            key = { task -> task.id }
        ) { task ->
            StatefulWellnessTaskItem(
                taskName = task.label,
                onCloseTask = { onCloseTask(task) }
            )
        }
    }
}