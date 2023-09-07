package com.example.edittextcomposablet5

import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember

import androidx.compose.ui.tooling.preview.Preview



class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            TextInput()
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Preview(showBackground = true, widthDp = 300, heightDp = 500)
@Composable
private fun PreviewFunction() {
   TextField(
       value = "prashant chauhan",
       onValueChange = {}, label = { Text(text = "Enter Messege") },
       placeholder = {}
   )

}
/**
 *composables are data driven if data changes UI updates by recomposition .
 * events:rather then updating UI we change data or state.*/

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun TextInput(){
    val state= remember{mutableStateOf("")}
    TextField(
        value = state.value,
        onValueChange = {
                        state.value=it
        }, label = { Text(text = "Enter Messege") },

    )
}