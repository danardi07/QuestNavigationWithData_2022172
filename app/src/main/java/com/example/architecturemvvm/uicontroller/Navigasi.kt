package com.example.architecturemvvm.uicontroller


import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.architecturemvvm.view.FormIsian

enum class Navigasi {
    Formulir,
    Detail
}

@Composable
fun DataApp (
    navController: NavHostController = rememberNavController()
){
    Scaffold { isiRuang ->
        NavHost(
            navController = navController,
            startDestination = Navigasi.Formulir.name,

            modifier = Modifier.padding(isiRuang)) {
            composable(route = Navigasi.Formulir.name){

            }
            composable(route = Navigasi.Detail.name){

            }
        }
    }
}

private fun cancelAndBackToFormulir(
    navController: NavHostController
){
    navController.popBackStack(Navigasi.Formulir.name, inclusive = false)
}