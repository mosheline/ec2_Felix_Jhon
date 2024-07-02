package pe.idat.ec2_felix_jhon

import android.annotation.SuppressLint
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.Check
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.text.input.KeyboardType
import pe.idat.ec2_felix_jhon.ui.theme.Ec2_Felix_JhonTheme

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun informacionScreen() {
    var nombre by remember { mutableStateOf("") }
    var apellidos by remember { mutableStateOf("") }
    var dni by remember { mutableStateOf("") }
    var celular by remember { mutableStateOf("") }
    var email by remember { mutableStateOf("") }
    var otroPrograma by remember { mutableStateOf("") }
    var colorFavorito by remember { mutableStateOf("") }

    var msSqlServer by remember { mutableStateOf(false) }
    var vstudioCode by remember { mutableStateOf(false) }
    var androidStudio by remember { mutableStateOf(false) }
    var otroCheckbox by remember { mutableStateOf(false) }

    Scaffold(
        topBar = {
            TopAppBar(
                title = { Text("INFORMACIÓN") }
            )
        }
    ) {
        LazyColumn(
            modifier = Modifier
                .fillMaxSize()
                .padding(16.dp),
            verticalArrangement = Arrangement.Top,
            horizontalAlignment = Alignment.Start
        ) {
            
            item {
                OutlinedTextField(
                    value = nombre,
                    onValueChange = { nombre = it },
                    label = { Text("Nombres") },
                    modifier = Modifier.fillMaxWidth()
                )
                Spacer(modifier = Modifier.height(16.dp))
            }
            item {
                OutlinedTextField(
                    value = apellidos,
                    onValueChange = { apellidos = it },
                    label = { Text("Apellidos") },
                    modifier = Modifier.fillMaxWidth()
                )
                Spacer(modifier = Modifier.height(16.dp))
            }
            item {
                OutlinedTextField(
                    value = dni,
                    onValueChange = { dni = it },
                    label = { Text("DNI") },
                    modifier = Modifier.fillMaxWidth(),
                    keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number)
                )
                Spacer(modifier = Modifier.height(16.dp))
            }
            item {
                OutlinedTextField(
                    value = celular,
                    onValueChange = { celular = it },
                    label = { Text("Celular") },
                    modifier = Modifier.fillMaxWidth(),
                    keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Phone)
                )
                Spacer(modifier = Modifier.height(16.dp))
            }
            item {
                OutlinedTextField(
                    value = email,
                    onValueChange = { email = it },
                    label = { Text("Email") },
                    modifier = Modifier.fillMaxWidth(),
                    keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Email)
                )
                Spacer(modifier = Modifier.height(16.dp))
            }
            item {
                Text("Seleccione Programas que domine:", fontSize = 16.sp)
                Spacer(modifier = Modifier.height(8.dp))
            }
            item {
                Row(verticalAlignment = Alignment.CenterVertically) {
                    Checkbox(checked = msSqlServer, onCheckedChange = { msSqlServer = it })
                    Spacer(modifier = Modifier.width(8.dp))
                    Text("MS SQL SERVER")
                }
            }
            item {
                Row(verticalAlignment = Alignment.CenterVertically) {
                    Checkbox(checked = vstudioCode, onCheckedChange = { vstudioCode = it })
                    Spacer(modifier = Modifier.width(8.dp))
                    Text("VStudio Code")
                }
            }
            item {
                Row(verticalAlignment = Alignment.CenterVertically) {
                    Checkbox(checked = androidStudio, onCheckedChange = { androidStudio = it })
                    Spacer(modifier = Modifier.width(8.dp))
                    Text("Android Studio")
                }
            }
            item {
                Row(verticalAlignment = Alignment.CenterVertically) {
                    Checkbox(checked = otroCheckbox, onCheckedChange = { otroCheckbox = it })
                    Spacer(modifier = Modifier.width(8.dp))
                    Text("Otro")
                }
                Spacer(modifier = Modifier.height(8.dp))
            }
            item {
                OutlinedTextField(
                    value = otroPrograma,
                    onValueChange = { otroPrograma = it },
                    label = { Text("Ingrese otro programa") },
                    modifier = Modifier.fillMaxWidth()
                )
                Spacer(modifier = Modifier.height(16.dp))
            }
            item {
                Text("Seleccione su color favorito:", fontSize = 16.sp)
                Spacer(modifier = Modifier.height(8.dp))
            }
            item {
                Row(verticalAlignment = Alignment.CenterVertically) {
                    RadioButton(
                        selected = colorFavorito == "Azul",
                        onClick = { colorFavorito = "Azul" }
                    )
                    Spacer(modifier = Modifier.width(8.dp))
                    Text("Azul")
                }
            }
            item {
                Row(verticalAlignment = Alignment.CenterVertically) {
                    RadioButton(
                        selected = colorFavorito == "Rojo",
                        onClick = { colorFavorito = "Rojo" }
                    )
                    Spacer(modifier = Modifier.width(8.dp))
                    Text("Rojo")
                }
            }
            item {
                Row(verticalAlignment = Alignment.CenterVertically) {
                    RadioButton(
                        selected = colorFavorito == "Verde",
                        onClick = { colorFavorito = "Verde" }
                    )
                    Spacer(modifier = Modifier.width(8.dp))
                    Text("Verde")
                }
            }
            item {
                Row(verticalAlignment = Alignment.CenterVertically) {
                    RadioButton(
                        selected = colorFavorito == "Otro",
                        onClick = { colorFavorito = "Otro" }
                    )
                    Spacer(modifier = Modifier.width(8.dp))
                    Text("Otro")
                }
                Spacer(modifier = Modifier.height(16.dp))
            }
            item {
                Box(modifier = Modifier.fillMaxWidth(), contentAlignment = Alignment.Center) {
                    Button(onClick = {}) {
                        Icon(Icons.Default.Check, contentDescription = "Check")
                        Spacer(modifier = Modifier.width(8.dp))
                        Text("Acceder")
                    }
                }
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun informacionScreenPreview() {
    Ec2_Felix_JhonTheme {
        informacionScreen()
    }
}
