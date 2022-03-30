package com.example.ejemplotoastconfragmentoskotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.appcompat.widget.Toolbar
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentTransaction

class MainActivity : AppCompatActivity() {

    var f1 : Perfil = Perfil()
    var f2 : Notifications = Notifications()
    var f3 : Mensajes = Mensajes()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var toolbar: Toolbar = findViewById(R.id.toolbar)
        setSupportActionBar(toolbar)

        cargarFragmento(f1)


    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu_items, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when(item.itemId){
            R.id.my_Mensajes -> cargarFragmento(f3)

            R.id.my_perfil -> cargarFragmento(f1)

            R.id.my_notificaciones -> cargarFragmento(f2)
        }
        return super.onOptionsItemSelected(item)
    }

    fun cargarFragmento(f:Fragment){
        val fragmentManager = supportFragmentManager
        val fragmentTransaction = fragmentManager.beginTransaction()
        fragmentTransaction.replace(R.id.myFrame, f)
        fragmentTransaction.commit()
    }
}