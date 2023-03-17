package com.example.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

            val rollButtonMainActivity: Button = findViewById(R.id.button)
            rollButtonMainActivity.setOnClickListener {
                rollDice()
                //val textViewMainActivity: TextView = findViewById(R.id.textViewVM)
                //textViewMainActivity.text = "4"
               // val toastMainActivity = Toast.makeText( this, "Dice Rolled", Toast.LENGTH_LONG)
               //tMainActivity.show()

            }
    }

    private fun rollDice() {
        //create a dice with 6 sides and roll it
        val dice = Dice(6)
        val diceRoll = dice.rollMA()

        //update the screen with dice roll
        val resultTextView: TextView = findViewById(R.id.textViewVM)
        resultTextView.text = diceRoll.toString()
    }


        class Dice( val numSides: Int) {
            fun rollMA(): Int {
                return (1..numSides).random()
            }
        }
}