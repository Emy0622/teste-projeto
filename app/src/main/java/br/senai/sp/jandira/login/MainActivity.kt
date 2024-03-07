package br.senai.sp.jandira.login

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Checkbox
import androidx.compose.material3.CheckboxDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import br.senai.sp.jandira.login.ui.theme.LoginTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            LoginTheme {
                // A surface container using the 'background' color from the theme
                //muda os temas e cores do app
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Greeting("Android")
                }
            }
        }
    }
}


@Composable
fun LoginScreen() {

    Surface(
        modifier = Modifier.fillMaxSize(),
        color = Color(0xFF4C376D)
    ) {
        Column(
            modifier = Modifier
                .padding(top = 38.dp, bottom = 18.dp),
            verticalArrangement = Arrangement.SpaceBetween,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(text = "Login",
                fontSize = 60.sp,
            fontWeight = FontWeight.Bold,
                color = Color.White,
                modifier = Modifier.padding(top = 16.dp)
            )
            Box (
                modifier = Modifier
                    .padding(horizontal = 24.dp)
                    .background(
                        color = Color(0xFF411F58),
                        shape = RoundedCornerShape(
                            topStart = 32.dp,
                            bottomEnd = 32.dp
                        )
                    )

            ){
                Column (
                    modifier = Modifier
                        .padding(horizontal = 24.dp)
                        .padding(24.dp)
                ){
                    Text(text = "E-mail",
                        color = Color.White)
                    TextField(
                        value = "",
                        onValueChange = {},
                        modifier = Modifier
                            .padding(bottom = 32.dp, top = 8.dp)
                            .fillMaxWidth()

                    )
                    Text(text = "Senha",color = Color.White)
                    TextField(
                        value = "",
                        onValueChange = {},
                        modifier = Modifier
                            .padding(top = 8.dp)
                            .fillMaxWidth()

                    )
                    Row (
                        verticalAlignment = Alignment.CenterVertically,
                        horizontalArrangement = Arrangement.End,
                        modifier = Modifier.fillMaxWidth()
                    ){
                        Checkbox(checked = true, onCheckedChange = {}, colors = CheckboxDefaults .colors(checkedColor = Color(
                            0xFF4B01C4
                        )
                        )

                        )
                        Text(text = "Lembrar",
                            color = Color.White)
                    }
                }

            }

            Button(
                onClick = { /*TODO*/ },
            modifier = Modifier
                .padding(horizontal = 24.dp)
                .fillMaxWidth()
                .height(58.dp),
                colors = ButtonDefaults
                    .buttonColors(
                        containerColor = Color(0xFF331747)
                    )

            ){

                Text(text = "Entrar",
                    fontSize = 22.sp
                )
            }
            Text(text = "Desenvolvido pela arty :)",
            color = Color.White,
                modifier = Modifier.padding(bottom = 8.dp))
        }
    }
}



@Preview(showSystemUi = true)
@Composable

fun LoginScreenPreview() {
    LoginTheme {
        LoginScreen()
    }

}

@Composable
fun Teste() {
    Surface(
        modifier = Modifier
            .padding(8.dp)
            //largura max no celular
            .fillMaxWidth()
            //.width(200.dp)
            .height(600.dp),
        color = Color.Cyan
    ) {
        Box(
            modifier = Modifier
                .padding(horizontal = 20.dp, vertical = 20.dp)
                .background(
                    color = Color(0x22000000)
                )
        ) {
            Column(
                modifier = Modifier
                    .background(
                        color = Color(0xFFFFFFFF),
                        shape = RoundedCornerShape(
                            topStart = 48.dp,
                            bottomEnd = 64.dp
                        )
                    )
                    .fillMaxSize(),
                verticalArrangement = Arrangement.SpaceEvenly
            ) {
                Text(
                    text = "elayne baeta",
                    //  modifier = Modifier.align(Alignment.Center)
                )
                Text(
                    text = "oxe baby",
                    //  modifier = Modifier.align(Alignment.BottomEnd)
                )
                Text(
                    text = "oxe baby",
                    //  modifier = Modifier.align(Alignment.BottomEnd)
                )
                Text(
                    text = "oxe baby",
                    //  modifier = Modifier.align(Alignment.BottomEnd)
                )
                Text(
                    text = "o amor nao é obvio",
                    //   modifier = Modifier.align(Alignment.TopEnd)
                )
            }
        }


//Box(
//  modifier = Modifier
        //    .offset(x = 50.dp, y = (-30).dp)
        //  .width(100.dp)
        //   .height(120.dp)
        //  .background(color = Color.Magenta)
        // .align(Alignment.BottomStart)

//)

    }

}


@Preview(showSystemUi = true)
@Composable
fun TestePreview() {
    Teste()

}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Column {
        Button(onClick = { /*TODO*/ }) {
            Text(text = "Botao ")
        }
        Row {
            Checkbox(checked = true,
                onCheckedChange = {}
            )
            Text(text = "A sua escolha")
        }
        Button(onClick = { /*TODO*/ }) {
            Text(text = "elay")

        }
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun GreetingPreview() {
    LoginTheme {
        Greeting("Android")
    }
}