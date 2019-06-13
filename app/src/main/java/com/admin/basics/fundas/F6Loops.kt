package com.admin.basics.fundas


fun main(args: Array<String>){

    printMyName("Satya");

  //  printInWhileLoop();

  //  printInDoWhileLoop();

  //  printInRepeat();

    printUsingWhen(1);
}


//for loop
fun printMyName(name : String){

    for (i in 1..5){
        println(name)
    }
}


//while loop
fun printInWhileLoop(){

    var  i : Int = 10;

    while (i<15){
        println(i)
        i++
    }

}


//do while loop
fun printInDoWhileLoop(){

    var j : Int =21
    do {
        println(j)
        j++
    }while (j<=25)


}


//repeat function
fun printInRepeat(){

    repeat(5){
        println("Hotbet")
    }

}


//using when function
fun printUsingWhen(n : Int){


    when(n){
        1 -> {
            println("1 - Sunday")
        }

        2 -> {
            println("2 - Monday")
        }


    }


}