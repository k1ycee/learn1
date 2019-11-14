package com.example.learn1

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.inputmethod.InputMethodManager
import android.widget.*
import androidx.core.content.getSystemService
import kotlin.random.Random

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        findViewById<Button>(R.id.gical).setOnClickListener{doit(it)}
        findViewById<TextView>(R.id.name_text).setOnClickListener{revdoit(it)}



    }

    private fun doit(view: View){
        val nam = findViewById<EditText>(R.id.chgnm)
        val cge = findViewById<TextView>(R.id.name_text)
        cge.text = nam.text
        view.visibility = View.GONE
        nam.visibility = View.GONE
        val inputMethodManager = getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
        inputMethodManager.hideSoftInputFromWindow(view.windowToken,0)
    }

    private fun revdoit (view: View){
        val gic = findViewById<Button>(R.id.gical)
        val nam = findViewById<EditText>(R.id.chgnm)
        val cge = findViewById<TextView>(R.id.name_text)
        cge.requestFocus()
        val hian = getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
        hian.hideSoftInputFromWindow(view.windowToken, 0)
        view.visibility = View.GONE
        gic.visibility = View.VISIBLE
        nam.visibility = View.VISIBLE


    }
}

