package pe.idat.ec2_felix_jhon

import android.annotation.SuppressLint
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Card
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import pe.idat.ec2_felix_jhon.ui.theme.Ec2_Felix_JhonTheme

data class Concierto(val titulo: String, val descripcion: String, val fecha: String)

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun ConciertoScreen() {
    val conciertos = listOf(
        Concierto("Concierto 1", "Descripción del Concierto 1", "Fecha 1"),
        Concierto("Concierto 2", "Descripción del Concierto 2", "Fecha 2"),
        Concierto("Concierto 3", "Descripción del Concierto 3", "Fecha 3"),
        Concierto("Concierto 4", "Descripción del Concierto 4", "Fecha 4"),
        Concierto("Concierto 5", "Descripción del Concierto 5", "Fecha 5"),
        Concierto("Concierto 6", "Descripción del Concierto 6", "Fecha 6"),
        Concierto("Concierto 7", "Descripción del Concierto 7", "Fecha 7"),
        Concierto("Concierto 8", "Descripción del Concierto 8", "Fecha 8"),
        Concierto("Concierto 9", "Descripción del Concierto 9", "Fecha 9"),
        Concierto("Concierto 10", "Descripción del Concierto 10", "Fecha 10")
    )

    Scaffold {
        LazyColumn(
            modifier = Modifier
                .fillMaxSize()
                .padding(16.dp),
            verticalArrangement = Arrangement.spacedBy(8.dp)
        ) {
            items(conciertos) { concierto -> ConciertoCard(concierto) }
        }
    }
}

@Composable
fun ConciertoCard(concierto: Concierto) {
    Card(modifier = Modifier
        .fillMaxWidth()
        .padding(vertical = 4.dp)) {
        Column(modifier = Modifier.padding(16.dp)) {
            Text(concierto.titulo, fontSize = 20.sp, style = MaterialTheme.typography.titleMedium)
            Spacer(modifier = Modifier.height(8.dp))
            Text(concierto.descripcion, style = MaterialTheme.typography.bodyMedium)
            Spacer(modifier = Modifier.height(8.dp))
            Text(concierto.fecha, style = MaterialTheme.typography.bodySmall)
        }
    }
}

@Preview(showBackground = true)
@Composable
fun ConciertoScreenPreview() {
    Ec2_Felix_JhonTheme {
        Surface(modifier = Modifier.fillMaxSize()) {
            ConciertoScreen()
        }
    }
}