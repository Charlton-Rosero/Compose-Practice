package com.example.composepractice.ui.theme

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*


import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Text

import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.ExperimentalComposeUiApi
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.composepractice.Button
import com.example.composepractice.CalculatorActions
import com.example.composepractice.CalculatorOperation
import com.example.composepractice.CalculatorState


@OptIn(ExperimentalComposeUiApi::class)
@Composable
fun  Calculator(
    state: CalculatorState,
    buttonSpacing: Dp = 8.dp,
    modifier: Modifier = Modifier,
    onAction:(CalculatorActions) -> Unit
){
    Box(modifier = modifier){
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .align(Alignment.BottomCenter),
        verticalArrangement = Arrangement.spacedBy(buttonSpacing)
        ) {
            Text(
                text = state.number1 + (state.operation?.symbol?:"") + state.number2,
                textAlign = TextAlign.End,
                modifier = Modifier.fillMaxWidth().padding(vertical = 32.dp),
                fontSize = 80.sp,
                color = Color.White,
                maxLines = 2,
            )
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement =  Arrangement.spacedBy(buttonSpacing)
            ){
                Button(symbol = "AC",
                    modifier =  Modifier
                        .background(LightGray)
                        .aspectRatio(2f)
                        .weight(2f),
                    onClick = {
                        onAction(CalculatorActions.Clear)
                    }
                )
                Button(symbol = "Del",
                    modifier =  Modifier
                        .background(LightGray)
                        .aspectRatio(1f)
                        .weight(1f),
                    onClick = {
                        onAction(CalculatorActions.Delete)
                    }
                )
                Button(symbol = "/",
                    modifier =  Modifier
                        .background(Orange)
                        .aspectRatio(1f)
                        .weight(1f),
                    onClick = {
                       onAction(CalculatorActions.Operation(CalculatorOperation.Divide))
                    }
                )


            }
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement =  Arrangement.spacedBy(buttonSpacing)
            ){
                Button(symbol = "7",
                    modifier =  Modifier
                        .background(Color.DarkGray)
                        .aspectRatio(1f)
                        .weight(1f),
                    onClick = {
                        onAction(CalculatorActions.Number(7))
                    }
                )
                Button(symbol = "8",
                    modifier =  Modifier
                        .background(Color.DarkGray)
                        .aspectRatio(1f)
                        .weight(1f),
                    onClick = {
                        onAction(CalculatorActions.Number(8))
                    }
                )
                Button(symbol = "9",
                    modifier =  Modifier
                        .background(Color.DarkGray)
                        .aspectRatio(1f)
                        .weight(1f),
                    onClick = {
                        onAction(CalculatorActions.Number(9))
                    }
                )
                Button(symbol = "*",
                    modifier =  Modifier
                        .background(Orange)
                        .aspectRatio(1f)
                        .weight(1f),
                    onClick = {
                        onAction(CalculatorActions.Operation(CalculatorOperation.Multiply))
                    }
                )


            }
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement =  Arrangement.spacedBy(buttonSpacing)
            ){
                Button(symbol = "4",
                    modifier =  Modifier
                        .background(Color.DarkGray)
                        .aspectRatio(1f)
                        .weight(1f),
                    onClick = {
                        onAction(CalculatorActions.Number(4))
                    }
                )
                Button(symbol = "5",
                    modifier =  Modifier
                        .background(Color.DarkGray)
                        .aspectRatio(1f)
                        .weight(1f),
                    onClick = {
                        onAction(CalculatorActions.Number(5))
                    }
                )
                Button(symbol = "6",
                    modifier =  Modifier
                        .background(Color.DarkGray)
                        .aspectRatio(1f)
                        .weight(1f),
                    onClick = {
                        onAction(CalculatorActions.Number(6))
                    }
                )
                Button(symbol = "-",
                    modifier =  Modifier
                        .background(Orange)
                        .aspectRatio(1f)
                        .weight(1f),
                    onClick = {
                        onAction(CalculatorActions.Operation(CalculatorOperation.Subtract))
                    }
                )
            }
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement =  Arrangement.spacedBy(buttonSpacing)
            ){
                Button(symbol = "1",
                    modifier =  Modifier
                        .background(Color.DarkGray)
                        .aspectRatio(1f)
                        .weight(1f),
                    onClick = {
                        onAction(CalculatorActions.Number(1))
                    }
                )
                Button(symbol = "2",
                    modifier =  Modifier
                        .background(Color.DarkGray)
                        .aspectRatio(1f)
                        .weight(1f),
                    onClick = {
                        onAction(CalculatorActions.Number(2))
                    }
                )
                Button(symbol = "3",
                    modifier =  Modifier
                        .background(Color.DarkGray)
                        .aspectRatio(1f)
                        .weight(1f),
                    onClick = {
                        onAction(CalculatorActions.Number(3))
                    }
                )
                Button(symbol = "+",
                    modifier =  Modifier
                        .background(Orange)
                        .aspectRatio(1f)
                        .weight(1f),
                    onClick = {
                        onAction(CalculatorActions.Operation(CalculatorOperation.Add))
                    }
                )


            }
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement =  Arrangement.spacedBy(buttonSpacing)
            ){
                Button(symbol = "0",
                    modifier =  Modifier
                        .background(Color.DarkGray)
                        .aspectRatio(2f)
                        .weight(2f),
                    onClick = {
                        onAction(CalculatorActions.Number(0))
                    }
                )
                Button(symbol = ".",
                    modifier =  Modifier
                        .background(Color.DarkGray)
                        .aspectRatio(1f)
                        .weight(1f),
                    onClick = {
                        onAction(CalculatorActions.Decimal)
                    }
                )
                Button(symbol = "=",
                    modifier =  Modifier
                        .background(Orange)
                        .aspectRatio(1f)
                        .weight(1f),
                    onClick = {
                        onAction(CalculatorActions.Calculate)
                    }
                )
            }
        }
    }
}

