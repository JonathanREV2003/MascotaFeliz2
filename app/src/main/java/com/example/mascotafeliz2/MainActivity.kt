package com.example.mascotafeliz2

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.mascotafeliz2.ui.theme.MascotaFeliz2Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MascotaFeliz2Theme (true) {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Elementos()

                }
            }
        }
    }
}

@Composable
fun Elementos(){

    val mContext = LocalContext.current

    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {

        Box(
            modifier = Modifier
                .clip(shape= MaterialTheme.shapes.small)
                .background(MaterialTheme.colorScheme.secondary)
                .border(4.dp, MaterialTheme.colorScheme.primary)
        ){
            Image(painter = painterResource(id = R.drawable.mascotita),
                contentDescription = "Mascotita",
                modifier = Modifier
                    .padding(15.dp))

        }

        Text("Mascotita Feliz 2.0",
            color= MaterialTheme.colorScheme.secondary,
            style = MaterialTheme.typography.bodyLarge
        )
        Text("Bienbenido, Usuario")

        Row(){
            OutlinedButton(onClick = { /*TODO*/ }) {
                Text("Tu mascota")
            }
            Spacer(modifier= Modifier.width(10.dp))
            OutlinedButton(onClick = {
            mContext.startActivity(Intent(mContext, ListActivity::class.java))
            }) {
                Text("Contenidos")
            }
        }
    }
}
@Preview(showBackground = true)
@Composable
fun ElementosPreview(){
    MascotaFeliz2Theme(true) {
        Elementos()
    }
}


