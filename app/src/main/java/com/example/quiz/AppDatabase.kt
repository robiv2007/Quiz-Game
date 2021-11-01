package com.example.quiz

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase




@Database(entities = [Question::class],version = 1)
abstract class AppDatabase : RoomDatabase(){
    abstract  fun questionDao() : QuestionDao

    companion object {

        @Volatile
        var INSTANCE: AppDatabase? = null


        fun getInstance(context: Context) : AppDatabase?{
            var instance = INSTANCE
            if (instance == null){
                instance = Room.databaseBuilder(context.applicationContext,
                           AppDatabase::class.java,
                    "questionDB").
                        fallbackToDestructiveMigration()
                    .build()
            }
            return instance
        }
    }




}


