package com.example.learn1

import android.content.Context
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity(){

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        listener()
    }
// This is to choose the colors for the different texts
    private fun colored(view : View){
        when (view.id){
            R.id.textone -> view.setBackgroundColor(Color.BLACK)
            R.id.texttwo -> view.setBackgroundColor(Color.DKGRAY)
            R.id.textthree -> view.setBackgroundColor(Color.GREEN)
            R.id.textfour -> view.setBackgroundColor(Color.MAGENTA)
            R.id.textfive -> view.setBackgroundColor(Color.YELLOW)
            R.id.bluebtn -> view.setBackgroundColor(Color.BLUE)
            R.id.cyanbtn -> view.setBackgroundColor(Color.CYAN)
            R.id.greenbtn -> view.setBackgroundColor(Color.GREEN)
            else -> view.setBackgroundColor(Color.LTGRAY)

        }
    }
// This is to set the colors when the user selects a particular text view
    private fun listener(){
        val text1 = findViewById<TextView>(R.id.textone)
        val text2 = findViewById<TextView>(R.id.texttwo)
        val text3 = findViewById<TextView>(R.id.textthree)
        val text4 = findViewById<TextView>(R.id.textfour)
        val text5 = findViewById<TextView>(R.id.textfive)
        val root = findViewById<View>(R.id.constrain)
        val bck1 = findViewById<Button>(R.id.bluebtn)
        val bckgr = findViewById<Button>(R.id.greenbtn)
        val bck3 =  findViewById<Button>(R.id.cyanbtn)

        val clickable: List<View> =
            listOf(text1,text2,text3,text4,text5,root,bck1,bckgr,bck3)
        for (item in clickable){
            item.setOnClickListener { colored(it) }
        }
    }
}

