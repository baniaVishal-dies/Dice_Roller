package com.example.diceroller

import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import java.util.*

class MainActivity : AppCompatActivity() {
    private lateinit var image : ImageView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val rollButton: Button= findViewById(R.id.Roll_Button)
        rollButton.text="Rolling now"
        val list= listOf("dice is a very old game"," ancient peeps loved to play and gamble"," kings lost empires and dynasties over  a game of dice","our epics will tell you all about it!","life  is a game of dice","our kings placed their wives on the line")
//        val dex=Random().nextInt(2)+1
        rollButton.setOnClickListener{
//            Toast.makeText(this,"Dice Rolled!",Toast.LENGTH_LONG).show()
            rollDice()

            val dex=Random().nextInt(6)+0
            Toast.makeText(this,list[dex],Toast.LENGTH_SHORT).show()
        }
        image=findViewById(R.id.Dice_Image)
    }

    private fun rollDice() {
//        val Image: ImageView=findViewById(R.id.Dice_Image) THIS CALLING IS VERY EXPENSIVE!

        val draw=when(Random().nextInt(6) +1)
        {
            1->R.drawable.dice_1
            2->R.drawable.dice_2
            3->R.drawable.dice_3
            4->R.drawable.dice_4
            5->R.drawable.dice_5
            else -> R.drawable.dice_6
        }
        image.setImageResource(draw)
    }

}