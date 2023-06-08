package com.davito.resistapp.ui.splash

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.davito.resistapp.databinding.ActivitySplashBinding
import com.davito.resistapp.ui.main.MainActivity
import java.util.Timer
import kotlin.concurrent.timerTask

@SuppressLint("CustomSplashScreen")
class SplashActivity : AppCompatActivity() {

    private lateinit var binding: ActivitySplashBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySplashBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val timer = Timer()
        timer.schedule(
            timerTask {
                startActivity(Intent(this@SplashActivity,MainActivity::class.java))
            },2000
        )
    }
}