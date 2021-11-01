package com.example.quiz

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "question_table")
data class Question(
    @PrimaryKey(autoGenerate = true) val id : Int,
    @ColumnInfo(name = "question")val question : String,
    @ColumnInfo(name = "image")val image : Int,
    @ColumnInfo(name = "option1")val option1 :String,
    @ColumnInfo(name = "option2")val option2: String,
    @ColumnInfo(name = "option3")val option3 : String,
    @ColumnInfo(name = "correctOption")val correctOption : String) {

}
