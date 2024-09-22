package com.example.shopverse.presentation.entry

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.lifecycleScope
import androidx.navigation.NavController
import androidx.navigation.fragment.NavHostFragment
import com.example.shopverse.R
import com.example.shopverse.data.local.user.UserDatabase
import com.example.shopverse.databinding.ActivityEnteryBinding
import com.example.shopverse.domain.repo.user.UserRepository
import com.example.shopverse.presentation.main.MainActivity
import com.example.shopverse.presentation.splash.SplashFragmentDirections
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

class EnteryActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_entery)
    }
}
