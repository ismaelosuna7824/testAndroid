package com.evaluation.banregio.ui.theme.main

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.evaluation.banregio.ui.theme.main.Style.borderModifier

@Composable
fun MainScreen(mainViewModel: MainViewModel) {
mainViewModel.fetchCreditCard()
    Column(modifier = Modifier.fillMaxWidth()) {
        CardInfo()
        Spacer(modifier = Modifier.size(24.dp))
        TransactionList()
    }

}

@Composable
fun CardInfo() {
    Card(modifier = Modifier
        .fillMaxWidth()
        .padding(8.dp)
        .clip(
            RoundedCornerShape(24.dp)
        ),
         backgroundColor = Color(0xFFF26430),
        contentColor = Color.White,
    ) {

        Column(modifier = Modifier
            .fillMaxWidth()
            .padding(16.dp)) {
            Row(modifier = Modifier
                .fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                Text(text = "Numero de la tarjeta")
                Text(text = "Banco")
            }

            Spacer(modifier = Modifier.size(8.dp))

            Row(modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                Text(modifier = borderModifier, text = "1234")
                Text(modifier = borderModifier, text = "1234")
                Text(modifier = borderModifier, text = "1234")
                Text(modifier = borderModifier, text = "1234")
            }

            Spacer(modifier = Modifier.size(16.dp))

            Text(text = "Titular de la tarjeta")

            Spacer(modifier = Modifier.size(8.dp))

            Text(modifier = borderModifier.fillMaxWidth(), text = "David Antonio Cuevas Leon")

            Spacer(modifier = Modifier.size(16.dp))

            Row(modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween) {
                Text(text = "Fecha de expiración")
                Text(text = "CVV")
            }

            Spacer(modifier = Modifier.size(8.dp))

            Row(modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                Text(modifier = borderModifier, text = "03/20")
                Text(modifier = borderModifier, text = "528")

            }

        }

    }
}

@Composable
fun TransactionList() {
    Box(modifier = Modifier
        .fillMaxSize()
        .background(Color(0xFFF2F2F2))
        .clip(
            RoundedCornerShape(8.dp)
        )
    )
    {
        ItemTransactionList()
    }
}


@Composable
fun ItemTransactionList() {
    Card(modifier = Modifier
        .fillMaxWidth()
        .padding(top = 32.dp, start = 16.dp, end = 16.dp)
        .clip(
            RoundedCornerShape(8.dp)
        )
    ) {
        Row(Modifier.fillMaxWidth().padding( top = 8.dp, bottom = 8.dp), horizontalArrangement = Arrangement.SpaceBetween) {
            Box(modifier = Modifier.fillMaxWidth().weight(2f), contentAlignment = Alignment.Center) {


                }
            Box(modifier = Modifier.fillMaxWidth().weight(5f), contentAlignment = Alignment.Center) {
                Column(Modifier.fillMaxWidth()) {
                    Text(text = "Concepto")
                    Text(text = "Fecha")

                }

            }
            Box(modifier = Modifier.fillMaxWidth().weight(2f)) {
                Text(text = "'$'total")
            }

        }

    }
}