package com.adrpien.navigationdrawerapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import android.widget.Toast
import com.adrpien.navigationdrawerapp.databinding.ActivityMainBinding
import com.google.android.material.navigation.NavigationView

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.navigationView.setNavigationItemSelectedListener(object: NavigationView.OnNavigationItemSelectedListener{
            override fun onNavigationItemSelected(item: MenuItem): Boolean {
                when (item.itemId) {
                    R.id.item1 -> {
                    Toast.makeText(applicationContext, "Przycisk 1", Toast.LENGTH_SHORT).show()
                    }
                    R.id.item2 -> {
                        Toast.makeText(applicationContext, "Przycisk 2", Toast.LENGTH_SHORT).show()
                    }
                    R.id.item3 -> {
                        Toast.makeText(applicationContext, "Przycisk 3", Toast.LENGTH_SHORT).show()
                    }
                }
                return true
            }
        })
    }
}