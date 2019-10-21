package com.example.project1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import java.util.*

class MainActivity : AppCompatActivity() {
    lateinit var image1 : ImageView
    lateinit var image2 : ImageView
    lateinit var image3 : ImageView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val rollButton: Button = findViewById(R.id.roll_button)
        rollButton.setOnClickListener { rollDice() }
    }

    private fun rollDice() {
        val randomInt1 = Random().nextInt(6) + 1
        val randomInt2 = Random().nextInt(6) + 1
        val randomInt3 = Random().nextInt(6) + 1
        Toast.makeText(
            this, "Dice Rolled",
            Toast.LENGTH_SHORT
        ).show()

       // val result_text3: TextView = findViewById(R.id.result_text3)
        //val result_text1: TextView = findViewById(R.id.result_text1)
        //val result_text2: TextView = findViewById(R.id.result_text2)
       // result_text3.text = randomInt3.toString()
        //result_text1.text = randomInt1.toString()
        //result_text2.text = randomInt2.toString()
        image1 = findViewById(R.id.dice_image1)
        image2 = findViewById(R.id.dice_image2)
        image3 = findViewById(R.id.dice_image3)
        //val image1: ImageView = findViewById(R.id.dice_image1)
        //val image2: ImageView = findViewById(R.id.dice_image2)
        //val image3: ImageView = findViewById(R.id.dice_image3)
        val drawableResource1 = when (randomInt1) {
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6
        }
        val drawableResource2 = when (randomInt2) {
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6
        }
        val drawableResource3 = when (randomInt3) {
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6
        }
        image1.setImageResource(drawableResource1)
        image2.setImageResource(drawableResource2)
        image3.setImageResource(drawableResource3)
    }
}
