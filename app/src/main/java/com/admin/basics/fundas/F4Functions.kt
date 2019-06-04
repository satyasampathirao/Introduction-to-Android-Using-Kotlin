package com.admin.basics.fundas



fun hello(){

}


fun  main(array: Array<String>){

}


//--------------method call-----------------------------------------


fun sum(){

    var x=10;
    var y=20;
    println(x+y);
    println("Hello")

}


fun callMe(){

    sum()
    println("Code after sum")

}




//-------------------------------------------------------


fun add2Num (number1 : Int, number2 : Int): Int{

    return number1+number2
}