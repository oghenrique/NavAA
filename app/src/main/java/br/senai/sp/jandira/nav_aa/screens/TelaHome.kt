package br.senai.sp.jandira.nav_aa.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Button
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController

@Composable
fun TelaHome(controleDeNavegacao: NavHostController) {
    Surface(
        modifier = Modifier.fillMaxSize(),
        color = Color(0xff673ab7)
    ) {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            Text(
                text = "Bem vindo a Tela Home",
                fontSize = 32.sp,
                fontWeight = FontWeight.Bold,
                color = Color.White
                )
            Spacer(modifier = Modifier.height(32.dp))
            Button(onClick = {
                controleDeNavegacao.navigate("login")
            }) {
                Text(text = "Voltar a tela de Login")
            }
        }
    }
}

@Preview(showSystemUi = true)
@Composable
fun TelaHomePreview() {
    //TelaHome(controleDeNavegacao)
}