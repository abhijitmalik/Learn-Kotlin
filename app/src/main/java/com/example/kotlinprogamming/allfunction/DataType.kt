package com.example.kotlinprogamming.allfunction

import android.icu.text.Transliterator.Position

class DataType {

    fun ArrayList(position: Int):String{

        var ArrayList = arrayOf<String>("Rover1, Rover2, Rover3, Rover4, Rover5")

        return ArrayList[position]

    }

    fun  FullArrayList(): Array<String> {

        var ArrayList = arrayOf<String>("Rover1, Rover2, Rover3, Rover4, Rover5")

        return ArrayList
    }


}