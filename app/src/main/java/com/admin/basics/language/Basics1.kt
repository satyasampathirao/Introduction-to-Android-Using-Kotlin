package com.admin.basics.language

class Basics1 {

    var i: Int = 1
    var j: String ="satya"


    fun main(args: Array<String>) {
        println("Hello World Satya")

        i=i+1;
        print(i)

    }

    fun hello(x:Int): Int {

        return x
    }

    fun loopfor(){

        for (i in 1..5){
            print(i)
        }

    }


    fun loopwhile(){

        var  x : Int =10

        while (true){
            x=x+1
            println(x)

            if (x>10){
                break
            }


        }


    }


    fun loopdowhile(){

        var j :Int =5

        do {
            j=j+1
            println(j)
        }while (j<10)


    }

    fun myrepeat(){


        repeat(5){
            println("Hello World")
        }


    }


    fun printWeekDay(n: Int){
        print(n)
    }

}