package com.example.quiz

import android.annotation.SuppressLint
import android.content.Intent
import android.graphics.Color
import android.media.AudioManager
import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.ProgressBar
import android.widget.TextView
import java.io.IOException

class QuestionActivityMain : AppCompatActivity() {

    lateinit var questionTextView: TextView
    lateinit var optionOne: Button
    lateinit var optionTwo: Button
    lateinit var optionThree: Button
    lateinit var imageView: ImageView
    private var currentPosition: Int = 0
    var value : String = ""
    var myQuestionsList = QuestionsList.getQuestions()
    var status = false
    var score = 0




    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_question_main)

        questionTextView = findViewById(R.id.questionView)
        optionOne = findViewById(R.id.option1)
        optionTwo = findViewById(R.id.option2)
        optionThree = findViewById(R.id.option3)
        imageView = findViewById(R.id.quizImageView)



        setQuestion()

        optionOne.setOnClickListener {
            value = optionOne.text.toString()
            val correctAnswer  = checkAnswer(value)

              if (status){
                optionOne.setBackgroundColor(Color.parseColor("#CD2224B5"))
                currentPosition++
                status = false
                setQuestion()

            } else{
                  if(correctAnswer){
                      optionOne.setBackgroundColor(Color.GREEN)
                      optionOne.text = "Great!! Next question"
                      score++
                      status = true
                      optionTwo.isClickable = false
                      optionThree.isClickable = false
                  } else{
                      optionOne.setBackgroundColor(Color.RED)
                      optionOne.text = "Ouch!! Next question"
                      status = true
                      optionTwo.isClickable = false
                      optionThree.isClickable = false
                  }
             }
        }
        optionTwo.setOnClickListener() {
            value = optionTwo.text.toString()
            var correctAnswer = checkAnswer(value)

            if (status){
                optionTwo.setBackgroundColor(Color.parseColor("#CD2224B5"))
                currentPosition++
                status = false
                setQuestion()
            }else{
                if (correctAnswer){
                    optionTwo.setBackgroundColor(Color.GREEN)
                    optionTwo.text = "Great!! Next question "
                    score++
                    status = true
                    optionOne.isClickable = false
                    optionThree.isClickable = false
                }else{
                    optionTwo.setBackgroundColor(Color.RED)
                    optionTwo.text = "Ouch!! Next question"
                    status =  true
                    optionOne.isClickable =false
                    optionThree.isClickable = false
                }
            }
        }
        optionThree.setOnClickListener {
            value = optionThree.text.toString()
            var correctAnswer = checkAnswer(value)

            if (status){
                optionThree.setBackgroundColor(Color.parseColor("#CD2224B5"))
                currentPosition++
                status = false
                setQuestion()
            }else{

                if (correctAnswer){
                    optionThree.setBackgroundColor(Color.GREEN)
                    optionThree.text = "Great!! Next question"
                    score++
                    status =  true
                    optionTwo.isClickable = false
                    optionOne.isClickable = false
                }else{
                    optionThree.setBackgroundColor(Color.RED)
                    optionThree.text = "Ouch!! Next question"
                    status =  true
                    optionTwo.isClickable = false
                    optionOne.isClickable = false
                }
            }
        }
    }
    private fun setQuestion() {
        val progressBar = findViewById<ProgressBar>(R.id.progressBarTV)
        val textViewProgress = findViewById<TextView>(R.id.TextViewProgress)
        progressBar.progress = currentPosition
        textViewProgress.text = ("${currentPosition + 1} "  + "/" + progressBar.max)

        optionOne.isClickable = true
        optionTwo.isClickable = true
        optionThree.isClickable = true

        if (currentPosition < myQuestionsList.size) {
            questionTextView.text = myQuestionsList[currentPosition].question
            optionOne.text = myQuestionsList[currentPosition].option1
            optionTwo.text = myQuestionsList[currentPosition].option2
            optionThree.text = myQuestionsList[currentPosition].option3
            imageView.setImageResource(myQuestionsList[currentPosition].image)

        } else {
            val intent = Intent(this@QuestionActivityMain, ActivityScore::class.java)
            intent.putExtra("score", score)
            startActivity(intent)
        }
    }
    fun checkAnswer(value : String) : Boolean {
        return value == myQuestionsList[currentPosition].correctOption
    }






}




