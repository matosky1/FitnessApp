package com.example.fitnessapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.animation.*
import androidx.compose.animation.core.tween
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import kotlinx.coroutines.delay
import com.example.fitnessapp.data.fitnessChallenges
import com.example.fitnessapp.data.FitnessChallenge
import com.example.fitnessapp.ui.theme.FitnessAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            FitnessAppTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    FitnessList(modifier = Modifier.padding(innerPadding))
                }
            }
        }
    }
}

@Composable
fun FitnessList(modifier: Modifier = Modifier) {
    LazyColumn(
        modifier = modifier
            .fillMaxSize()
            .padding(16.dp),
        verticalArrangement = Arrangement.spacedBy(12.dp)
    ) {
        itemsIndexed(fitnessChallenges) { index, challenge ->
            val visible = remember { mutableStateOf(false) }

            LaunchedEffect(Unit) {
                delay(index * 200L)  // Staggered delay for smooth animation
                visible.value = true
            }

            AnimatedVisibility(
                visible = visible.value,
                enter = fadeIn(animationSpec = tween(800)) + slideInVertically(initialOffsetY = { it / 2 }),
                exit = fadeOut(animationSpec = tween(500)) + slideOutVertically(targetOffsetY = { it / 2 })
            ) {
                FitnessItem(challenge = challenge)
            }
        }
    }
}

@Composable
fun FitnessItem(challenge: FitnessChallenge, modifier: Modifier = Modifier) {
    Card(
        modifier = modifier
            .fillMaxWidth()
            .height(140.dp),
        shape = MaterialTheme.shapes.medium,
        elevation = CardDefaults.cardElevation(6.dp)
    ) {
        Row(
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier.padding(16.dp)
        ) {
            Image(
                painter = painterResource(id = challenge.imageResourceId),
                contentDescription = null,
                modifier = Modifier
                    .size(80.dp)
                    .padding(end = 16.dp),
                contentScale = ContentScale.Crop
            )
            Text(
                text = stringResource(id = challenge.description),
                style = MaterialTheme.typography.titleMedium
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun FitnessListPreview() {
    FitnessAppTheme {
        FitnessList()
    }
}
