package com.example.aulasabadoofc.Telas

import android.util.Log
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun TaskScreen(){

    //var vlrdoTextField = "vlrInicial"
    //recomposer
    var vlrdoTextField = remember {
        mutableStateOf("vlrInicial")
    }

    Column (modifier = Modifier.padding(20.dp)) {
        Text(text = "Titulo da Tarefa")
        TextField(
            value = vlrdoTextField.value,
            onValueChange = {
                //antes da tela ser redesenhada
                //roda esse trecho de codigo aquii...
                vlrdoTextField.value = it
                Log.i("### fun TaskScreen(){...", it)
            })
        Spacer(modifier = Modifier.width(20.dp))
        Text(vlrdoTextField.value)
        Button(onClick = { /*TODO*/ }) {
            Text(text = "Navegar para MainScreen")
        }
    }
}