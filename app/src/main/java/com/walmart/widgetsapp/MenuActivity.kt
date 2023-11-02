package com.walmart.widgetsapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast

class MenuActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu)
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {

        menuInflater.inflate(R.menu.menu_main, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {

        when (item.itemId) {
            R.id.addMenu ->
                Toast.makeText(this, "You selected: "+item.title.toString(),
                    Toast.LENGTH_LONG).show()

            R.id.editMenu -> Toast.makeText(this, "You selected: "+item.title.toString(),
                Toast.LENGTH_LONG).show()

            R.id.deleteMenu -> Toast.makeText(this, "You selected: "+item.title.toString(),
                Toast.LENGTH_LONG).show()

            R.id.settingsMenu -> Toast.makeText(this, "You selected: "+item.title.toString(),
                Toast.LENGTH_LONG).show()
        }
        return super.onOptionsItemSelected(item)
    }
}