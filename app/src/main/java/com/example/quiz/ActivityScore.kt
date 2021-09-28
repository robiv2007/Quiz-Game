package com.example.quiz

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import android.content.Intent
import android.widget.Button


class ActivityScore : AppCompatActivity() {
    lateinit var showScore : TextView
    lateinit var message: TextView


    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_score)
        val intent = intent
        val score = intent.getIntExtra("score", 0)
        showScore = findViewById(R.id.textViewScore)
        message = findViewById(R.id.messageTextView)
        showScore.text = ("You got $score out of 10")

        if(score >= 6){
            message.text = "Good job"

        }
        if(score <= 5){
            message.text = "Keep trying"
        }

        val tryAgainButton = findViewById<Button>(R.id.tryAgainButton)
        tryAgainButton.setOnClickListener {
            val tryAgain = Intent(this, QuestionActivityMain::class.java)
            startActivity(tryAgain)
        }
    }
}