package io.github.ivblinov.popkorn

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import dagger.hilt.android.AndroidEntryPoint
import io.github.ivblinov.popkorn.navigation.AppNavigation
import io.github.ivblinov.popkorn.ui.theme.PopkornTheme

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            PopkornTheme {
                AppNavigation()
            }
        }
    }
}