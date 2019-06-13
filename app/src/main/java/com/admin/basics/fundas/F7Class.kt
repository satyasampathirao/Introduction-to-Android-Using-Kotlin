package com.admin.basics.fundas


class Person1 constructor(var name: String, var age: Int){

    var profession : String = "Not Mentioned"

    constructor(name : String, age : Int, profession: String ): this(name, age){
        this.profession = profession
    }

    fun printPersonDetails(){
        println(

        );
    }


}