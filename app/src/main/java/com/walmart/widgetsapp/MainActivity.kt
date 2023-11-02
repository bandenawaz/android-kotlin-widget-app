package com.walmart.widgetsapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.AdapterView
import android.widget.ListView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    //TODO: Declare the listview widget here
    private lateinit var lv: ListView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //TODO: Initialize the widget here
        lv = findViewById(R.id.listCountries)

        //TODO: Attach the ItemClickListener here
        lv.setOnItemClickListener{ _, _, position: Int, _ ->
            when (position){
                0 -> Toast.makeText(this,"You selected India",Toast.LENGTH_LONG).show()
                1 -> Toast.makeText(this,"You selected USA",Toast.LENGTH_LONG).show()
                2 -> Toast.makeText(this,"You selected UK",Toast.LENGTH_LONG).show()
                3 -> Toast.makeText(this,"You selected FRANCE",Toast.LENGTH_LONG).show()
                4 -> Toast.makeText(this,"You selected GERMANY",Toast.LENGTH_LONG).show()
                else -> Toast.makeText(this,"Nothing selected ",Toast.LENGTH_LONG).show()
            }
        }

    }
}