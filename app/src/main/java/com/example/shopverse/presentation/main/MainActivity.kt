package com.example.shopverse.presentation.main

import android.os.Bundle
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import com.example.shopverse.R
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.setupWithNavController
import com.example.shopverse.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private val viewModel: MainVM by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val navHostFragment =
            supportFragmentManager.findFragmentById(R.id.frag_container) as NavHostFragment
        val navController = navHostFragment.navController
        viewModel.setNavController(navController)
        binding.bottomNavigation.setupWithNavController(navController)
        navController.addOnDestinationChangedListener { _, destination, _ ->
            when (destination.id) {
                R.id.homeFragment -> binding.bottomNavigation.menu.findItem(R.id.home).isChecked = true
                R.id.searchFragment -> binding.bottomNavigation.menu.findItem(R.id.search).isChecked = true
                R.id.favoriteFragment -> binding.bottomNavigation.menu.findItem(R.id.fav).isChecked = true
                R.id.profileFragment -> binding.bottomNavigation.menu.findItem(R.id.profile).isChecked = true
            }
        }

        binding.bottomNavigation.setOnItemSelectedListener { item ->
            when (item.itemId) {
                R.id.home -> viewModel.navigateToHome()
                R.id.search -> viewModel.navigateToSearch()
                R.id.fav -> viewModel.navigateToFavorites()
                R.id.profile -> viewModel.navigateToProfile()
            }
            true
        }
    }
}
