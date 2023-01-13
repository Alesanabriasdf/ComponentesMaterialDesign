package com.example.educacionitnavigationview

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {

    private val fragmentManager : FragmentManager by lazy {supportFragmentManager}

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        init()

        setupUI()

    }

    private fun init(){
        goToFragment(HomeFragment())
    }

    private fun goToFragment(fragment: Fragment){
        fragmentManager.beginTransaction()
            .replace(R.id.contenedor_de_fragments, fragment)
            .commit()
    }

    private fun setupUI() {

        val selectedNavigationView = findViewById<BottomNavigationView>(R.id.navigationView)

        selectedNavigationView.setOnNavigationItemSelectedListener {

            val seccion = it.title

            Toast.makeText(this, seccion, Toast.LENGTH_SHORT).show()

            when (seccion){

                "Inicio" -> {
                    goToFragment(HomeFragment())
                }

                "Favoritos" -> {
                    goToFragment(FavoritesFragment())
                }

                "Perfil"-> {
                    goToActivityPerfil()
                }
            }
            true
        }
    }

    private fun goToActivityPerfil() {
        val intent = Intent(this, MainActivity2::class.java)
        startActivity(intent)
    }
}