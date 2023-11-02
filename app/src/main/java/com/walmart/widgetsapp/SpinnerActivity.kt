package com.walmart.widgetsapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Adapter
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Spinner
import android.widget.Toast

class SpinnerActivity : AppCompatActivity() {

    //declare
    private lateinit var spinner: Spinner
    val fruits = arrayOf("Apple","Mango","Orange","Avocado","MuskMelon")
    private lateinit var adapter: ArrayAdapter<String>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_spinner)

        //Initialise
        adapter = ArrayAdapter(this,android.R.layout.simple_spinner_dropdown_item,fruits)
        spinner = findViewById(R.id.spinner)
        spinner.adapter = adapter

        //Attach onitemselected listener
       spinner.onItemSelectedListener = object : AdapterView.OnItemSelectedListener{
           override fun onItemSelected(
               parent: AdapterView<*>?,
               view: View?,
               position: Int,
               id: Long
           ) {
               Toast.makeText(this@SpinnerActivity,"You Selected ${fruits[position]} fruit",
                   Toast.LENGTH_LONG).show()
           }

           override fun onNothingSelected(parent: AdapterView<*>?) {
               TODO("Not yet implemented")
               Toast.makeText(this@SpinnerActivity,"Please select one fruit",
                   Toast.LENGTH_LONG).show()
           }

       }

    }
}