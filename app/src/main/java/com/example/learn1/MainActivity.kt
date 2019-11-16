package com.example.learn1

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.inputmethod.InputBinding
import android.view.inputmethod.InputMethodManager
import android.widget.*
import androidx.core.content.getSystemService
import androidx.databinding.DataBindingUtil
import com.example.learn1.databinding.ActivityMainBinding
import kotlin.random.Random

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private val nom: meNom = meNom("Anon")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        binding.meNom = nom
        binding.gical.setOnClickListener{doit(it)}
        binding.nameText.setOnClickListener{revdoit(it)}



    }

    private fun doit(view: View){
        val nam = binding.chgnm
        val cge = binding.nameText
        cge.text = nam.text
        view.visibility = View.GONE
        nam.visibility = View.GONE
        val inputMethodManager = getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
        inputMethodManager.hideSoftInputFromWindow(view.windowToken,0)
    }

    private fun revdoit (view: View){
        val gic = binding.gical
        val nam = binding.chgnm
        val cge = binding.nameText
        cge.requestFocus()
        val hian = getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
        hian.hideSoftInputFromWindow(view.windowToken, 0)
        view.visibility = View.GONE
        gic.visibility = View.VISIBLE
        nam.visibility = View.VISIBLE


    }
}

