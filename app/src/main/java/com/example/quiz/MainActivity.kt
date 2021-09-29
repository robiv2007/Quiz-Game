package com.example.quiz

import android.content.Intent
import android.media.AudioManager
import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast
import java.io.IOException

class MainActivity : AppCompatActivity() {

    var mediaPlayer : MediaPlayer? = null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val startButton = findViewById<Button>(R.id.startButton)
        startButton.setOnClickListener {
            val intent = Intent(this, QuestionActivityMain::class.java)
            startActivity(intent)

            finish()
        }
    }
    fun playSound (view: View){
        if(mediaPlayer == null){
            mediaPlayer = MediaPlayer.create(this,R.raw.ukulele)
            mediaPlayer!!.isLooping = true
            mediaPlayer!!.start()
        }else mediaPlayer!!.start()

    }
    fun pauseSound(view: View){
        if(mediaPlayer != null){
            mediaPlayer!!.stop()
            mediaPlayer!!.release()
            mediaPlayer = null

        }

    }




}