package id.ferdinand.notes_app.ui.theme

import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.ReadOnlyComposable
import androidx.compose.runtime.compositionLocalOf
import androidx.compose.ui.unit.dp

data class Shapes(
    val default: RoundedCornerShape = RoundedCornerShape(0.dp),
    val small: RoundedCornerShape = RoundedCornerShape(4.dp),
    val medium: RoundedCornerShape = RoundedCornerShape(4.dp),
    val large: RoundedCornerShape = RoundedCornerShape(0.dp)
)

val LocalShape = compositionLocalOf { Shapes() }

val MaterialTheme.shapeScheme: Shapes
    @Composable
    @ReadOnlyComposable
    get() = LocalShape.current