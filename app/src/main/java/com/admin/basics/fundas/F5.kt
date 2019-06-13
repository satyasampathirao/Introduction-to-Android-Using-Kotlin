package com.admin.basics.fundas

 fun main(args: Array<String>){

     printName("Hello");
 }


fun printName(arg: String){
    System.out.println(arg)
}


data class User(val name: String, val age: Int);