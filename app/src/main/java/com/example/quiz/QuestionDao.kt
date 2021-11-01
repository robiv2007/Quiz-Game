package com.example.quiz

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query

@Dao
interface QuestionDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertQuestion(list: ArrayList<Question>)

    @Query("SELECT * FROM question_table")
    fun getTheQuestions() : List<Question>
}