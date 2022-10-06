package com.example.mysideproject

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        val flashcardQuestion = findViewById<TextView>(R.id.flashcard_question)
        val flashcardAnswer = findViewById<TextView>(R.id.flashcard_answer)
        val first_button = findViewById<Button>(R.id.button1)
        val second_button = findViewById<Button>(R.id.button2)
        val third_button = findViewById<Button>(R.id.button3)
        val previousbutton = findViewById<Button>(R.id.button4)
        val fifth_button = findViewById<Button>(R.id.button5)
        val sixth_button = findViewById<Button>(R.id.button6)
        val nextbutton = findViewById<Button>(R.id.button5)

        nextbutton.setOnClickListener{
            val Intent = Intent(this, MainActivity3::class.java)
            startActivity(Intent)
        }

        flashcardQuestion.setOnClickListener {
            flashcardQuestion.visibility = View.INVISIBLE
            flashcardAnswer.visibility = View.VISIBLE
        }
        flashcardAnswer.setOnClickListener{
            flashcardAnswer.visibility = View.INVISIBLE
            flashcardQuestion.visibility = View.VISIBLE
        }
        sixth_button.setOnClickListener{
            second_button.setBackgroundColor(getResources().getColor(R.color.white))
            third_button.setBackgroundColor(getResources().getColor(R.color.green))
            first_button.setBackgroundColor(getResources().getColor(R.color.white))

        }

        first_button.setOnClickListener{
            first_button.setBackgroundColor(getResources().getColor(R.color.red))
            second_button.setBackgroundColor(getResources().getColor(R.color.white))
            third_button.setBackgroundColor(getResources().getColor(R.color.white))

        }
        second_button.setOnClickListener{
            second_button.setBackgroundColor(getResources().getColor(R.color.red))
            first_button.setBackgroundColor(getResources().getColor(R.color.white))
            third_button.setBackgroundColor(getResources().getColor(R.color.white))

        }

        third_button.setOnClickListener {
            third_button.setBackgroundColor(getResources().getColor(R.color.green))
            first_button.setBackgroundColor(getResources().getColor(R.color.white))
            second_button.setBackgroundColor(getResources().getColor(R.color.white))

        }
        previousbutton.setOnClickListener{
            val Intent = Intent(this, MainActivity::class.java)
            startActivity(Intent)
        }
    }
}
