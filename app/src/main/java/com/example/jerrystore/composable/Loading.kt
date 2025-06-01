package com.example.jerrystore.composable

import androidx.compose.foundation.Canvas
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.geometry.Rect
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.drawscope.Stroke
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import kotlin.math.cos
import kotlin.math.sin

@Composable
fun LoadingBorderWithIcon(
    modifier: Modifier = Modifier,
    borderColor: Color = Color.Green,
    strokeWidth: Dp = 4.dp,
    arcSweepAngle: Float = 270f,
    startAngle: Float = 0f,
    dotRadius: Dp = 4.dp,
    icon: @Composable () -> Unit
) {
    Box(modifier = modifier.size(64.dp), contentAlignment = Alignment.Center) {
        Canvas(modifier = Modifier.fillMaxSize()) {
            val strokePx = strokeWidth.toPx()
            val radius = 48f
            val arcRect = Rect(
                center = center,
                radius = radius
            )

            drawArc(
                color = borderColor,
                startAngle = startAngle,
                sweepAngle = arcSweepAngle,
                useCenter = false,
                style = Stroke(2f, cap = StrokeCap.Round),
                topLeft = arcRect.topLeft,
                size = arcRect.size
            )

            val angleInRad = Math.toRadians((startAngle + arcSweepAngle).toDouble())
            val dotX = center.x + radius * cos(angleInRad).toFloat()
            val dotY = center.y + radius * sin(angleInRad).toFloat()

            drawCircle(
                color = borderColor,
                radius = dotRadius.toPx(),
                center = Offset(dotX, dotY)
            )
        }

        icon()
    }
}

