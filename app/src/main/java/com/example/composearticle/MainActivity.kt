package com.example.composearticle

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
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
import com.example.composearticle.ui.theme.ComposeArticleTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposeArticleTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    TutorialPage(
                        t1 = stringResource(R.string.image_title),
                        t2 = stringResource(R.string.image_description),
                        t3 = stringResource(R.string.Image_paragraph)
                    )
                }
            }
        }
    }
}

@Composable
fun TutorialPage(t1: String,t2: String,t3:String,
             modifier: Modifier = Modifier) {
    val image= painterResource(id = R.drawable.bg_compose_background)
    Column(
        modifier = Modifier.fillMaxSize(),
    ) {
        Box(
            modifier = Modifier.fillMaxWidth(),
        ) {
            Image(painter = image, contentDescription = null)
        }
        Text(
            text = t1,
            fontSize = 24.sp,
            modifier = modifier
                .padding(16.dp)
        )
        Text(
            text = t2,
            textAlign = TextAlign.Justify
            ,modifier = modifier
                .padding(16.dp)
        )
        Text(
            text = t3,
            textAlign = TextAlign.Justify,
            modifier = modifier
                .padding(all = 16.dp)
        )
    }
}

@Preview(showBackground = true)
@Composable
fun TutorialPagePreview() {
    ComposeArticleTheme {
        TutorialPage(
            t1 = stringResource(R.string.image_title),
            t2 = stringResource(R.string.image_description),
            t3 = stringResource(R.string.Image_paragraph)
        )
    }
}