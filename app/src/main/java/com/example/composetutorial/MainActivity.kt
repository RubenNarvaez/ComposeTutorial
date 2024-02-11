package com.example.composetutorial

import android.media.Image
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.composetutorial.ui.theme.ComposeTutorialTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposeTutorialTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    PrincipalView()
                }
            }
        }
    }
}

@Composable
fun PrincipalView() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)
    ) {
        SuperiorImage()
        TittleText()
        FirstParagraph()
        SecondParagraph()
    }
}

@Composable
fun SecondParagraph() {
    Text(
        text = stringResource(R.string.second_paragraph),
        textAlign = TextAlign.Justify,
        modifier = Modifier
            .padding(16.dp)
    )


}

@Composable
fun FirstParagraph() {
    Text(
        text = stringResource(R.string.first_paragraph),
        textAlign = TextAlign.Justify,
        modifier = Modifier
            .padding(16.dp)
    )
}

@Composable
fun TittleText() {
    Text(
        text = stringResource(R.string.Tittle),
        fontSize = 24.sp,
        modifier = Modifier
            .padding(16.dp)
    )
}


@Composable
fun SuperiorImage() {
    val backgroundImage = painterResource(id = R.drawable.bg_compose_background)
    Image(painter = backgroundImage, contentDescription = null)
}


@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    ComposeTutorialTheme {
        PrincipalView()
    }
}