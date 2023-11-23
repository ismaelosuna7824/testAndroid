package com.evaluation.banregio.ui.theme.main.Style

import androidx.compose.foundation.border
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp


    val borderModifier = Modifier.clip(
        RoundedCornerShape(1.dp)
    )
        .border(1.dp, Color.White)
        .padding(start = 8.dp, end = 24.dp, top = 4.dp, bottom = 4.dp)

