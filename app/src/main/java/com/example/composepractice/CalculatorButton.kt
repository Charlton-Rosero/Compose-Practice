package com.example.composepractice

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.ExperimentalComposeUiApi
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.sp


@ExperimentalComposeUiApi
@Composable
fun Button(
    symbol: String,
    modifier : Modifier,
    onClick: () -> Unit
){
    Box(
        contentAlignment = Alignment.Center, // makes all content centered
        modifier = Modifier
            .clip(CircleShape)  // rounded corners
            .clickable { onClick() } // make clickable
            .then(modifier) //
    ){
        Text(
            text = symbol,
            fontSize = 36.sp,
            color = Color.White
        )
    }


}