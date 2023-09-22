package com.pandacorp.splashscreen.sample

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.pandacorp.splashscreen.R
import com.pandacorp.splashscreen.SplashScreen.Companion.installSplashScreen

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        installSplashScreen()
        super.onCreate(savedInstanceState)
        setTheme(R.style.BlueTheme)
        setContentView(R.layout.activity_main)
    }
}