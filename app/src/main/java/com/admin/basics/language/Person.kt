package com.admin.basics.language

class Person constructor(var name: String, var age:Int){

    var profession: String="Not Mentioned"


    constructor(name: String, age: Int, profession: String): this(name,age){
        this.profession= profession
    }


    fun printPersonDetails(){
        println("$name whose profession is $profession, is $age years old. ")
    }










}





























