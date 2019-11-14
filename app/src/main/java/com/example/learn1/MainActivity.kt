package com.example.learn1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import kotlin.random.Random

class MainActivity : AppCompatActivity() {

    lateinit var die: ImageView
    lateinit var die2: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val roll: Button = findViewById(R.id.roll)
        val reset: Button = findViewById(R.id.res)
        roll.setOnClickListener { roller() }
        reset.setOnClickListener{change()}
        die = findViewById(R.id.die)
        die2 = findViewById(R.id.die2)
        // rise.setOnClickListener{incr()}
    }

    private fun roller() {
        die.setImageResource(rolldice())
        die2.setImageResource(rolldice())
    }
    private fun change(){
        die.setImageResource(R.drawable.empty_dice)
        die2.setImageResource(R.drawable.empty_dice)
    }

    private fun rolldice(): Int {
        val randomInt = Random.nextInt(6) + 1
        return when (randomInt) {
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6

        }


    }
}

