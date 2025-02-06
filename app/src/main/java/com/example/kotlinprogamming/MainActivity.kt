package com.example.kotlinprogamming

import android.os.Bundle
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.kotlinprogamming.allfunction.DataType
import com.example.kotlinprogamming.allfunction.listarray

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        //BirthGretting()
        var mylearning = MyLearning()
        var dataType = DataType()
        val list=listarray()


        var textView=findViewById<TextView>(R.id.text)
        var Bithaday:String =mylearning.LearnBirthGretting()
        textView.text=Bithaday;

        textView.setOnClickListener {


            val age:Int=5
            val name:String="Rover"
            var middlename:String?="ghosh"
            val doublevalie:Double=234234234.32
            var booleanvalue:Boolean=true
            val floatevalue:Float=234234234.32f
            var fullname:String=name+middlename
            var RealName:String="$name+$middlename"
            //mylearning.showToast(this,textView.text.toString())
            //  mylearning.withNamedarguments(context = this, message = "withNamedarguments")
            // mylearning.UsingDefaultArguments(this)
            // mylearning.UsingDefaultArguments(this,RealName)
           var  Position:String= dataType.ArrayList(1)
            textView.text=Position

            var fullarraylisy=dataType.FullArrayList()
            textView.text= fullarraylisy[1]

            var  ArrayList:String=list.arraylist(1)
            textView.text=ArrayList
            
            whenFunction("12")



        }









    }

    private fun whenFunction(s: String) {

         when(s){
             "1"-> println("1")
             "12"-> println("2")
             "3"-> println("3")
             else-> println("else")
         }

       // Combine
        when(s){
            "1","12","121","122"-> println("1")

            else-> println("else")
        }


    }

    fun  BirthGretting(){
       println("Happy Birthday, Rover!")
       println("You are now 5 years old!")
   }



}