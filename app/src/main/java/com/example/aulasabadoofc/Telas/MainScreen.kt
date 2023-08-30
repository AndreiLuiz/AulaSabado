package com.example.aulasabadoofc.Telas

import android.util.Log
import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable

@Composable
fun MainScreen(){
    Column {
        Text(text = "asdfasdf")
        Text(text = "TextoDaMaisScreen")

        Button(onClick = {
            Log.i("### MainScreen(){...","Botao1 Clicado!")
        }) {
            Text("Bnt1")
        }
        Button(onClick = { /*TODO*/ }) {
            Text("Navegar para TaskScreen")
        }

    }
}