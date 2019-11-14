package com.example.learn1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import kotlin.random.Random

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val roll: Button = findViewById(R.id.roll)

        val rise: Button = findViewById(R.id.up)
        roll.setOnClickListener{rolldice()}
        rise.setOnClickListener{incr()}


    }

    private fun rolldice(){
        val die: TextView = findViewById(R.id.die)
        val randomInt = Random.nextInt(6) + 1
        die.text = randomInt.toString()
      //  Toast.makeText(this, "Rollers!", Toast.LENGTH_LONG).show()

    }
    private fun incr(){
        val die: TextView = findViewById(R.id.die)

        var up = die.text.toString().toInt()
        if (up < 6){
            up++

            die.text = up.toString()
        }

    }
}
