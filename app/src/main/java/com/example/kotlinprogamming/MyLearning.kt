package com.example.kotlinprogamming

import android.content.Context
import android.util.Log
import android.widget.Toast

class MyLearning {


    fun  LearnBirthGretting():String{

       var BirthdayText:String="Happy Birthday, Rover!"
        return BirthdayText

    }


    fun showToast(context: Context, message: String) {
        Toast.makeText(context, message, Toast.LENGTH_SHORT).show()
    }

    fun withNamedarguments(context: Context, message: String) {
        Toast.makeText(context, message, Toast.LENGTH_SHORT).show()
    }

    fun UsingDefaultArguments(context: Context, message: String="UsingDefaultArguments") {
        Toast.makeText(context, message, Toast.LENGTH_SHORT).show()
    }



}