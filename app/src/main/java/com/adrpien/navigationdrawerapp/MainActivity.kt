package com.adrpien.navigationdrawerapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import android.widget.Toast
import com.adrpien.navigationdrawerapp.databinding.ActivityMainBinding
import com.google.android.material.navigation.NavigationView

/*
How to create Navigation Drawer:
1. Add depencies to build.gradle (module)
2. Create menu XML drawer_menu.xml
3. MainActivity.XML:
   - Change root of your MainActivity layout. Set DrawerLayout as root.
   - Add FrameLayout as container for your content
   - Add NavigationView
   - Change start position of Navigation View out of screen -
     to do this set layout_gravity atribbute as start
   - Add menu attribute to your navigation View
4. Add setNavigationItemSelectedListener
 */

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