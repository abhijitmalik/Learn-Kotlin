package com.example.kotlinprogamming.allfunction

class listarray {
    fun arraylist(position: Int):String{
        var ArrayList = arrayOf<String>("Rover1, Rover2, Rover2, Rover4, Rover5")


        ArrayList.set(1,"test1")

        return ArrayList[position]

    }

  fun rangearray(){
      for ( num in 399.rangeTo(400) ) {
          println(num)
      }
      for (range in  1..4){
          println(range)
      }
      for (range in  10 downTo  4){
          println(range)
      }
      for (range in  10..20 step 2){
          println(range)
      }
      for (car in  'a'..'t' step 2){
          println(car)
      }
  }




}