package com.admin.basics.fundas


fun main(args : Array<String>){
    var student_1 = Student("Arjun")
    var teacher_1 = Teacher("Amit")

    println("\n\n About "+student_1.name)
    student_1.doAll()

    println("\n\n About "+teacher_1.name)
    teacher_1.doAll()
}



//parent class
open class  Person(var role: String = "Person", var name : String = "X"){

    fun eat(){
        println(name + " is eating")
    }

    fun sleep(){
        println(name + " is sleeping")
    }

}



//1st child class
class  Student(name: String): Person("Student", name){

    fun activity(){
        println("$name is a $role. $name is studying in school.")
    }

    fun doAll(){
        eat()
        sleep()
        activity()
    }



}



//2nd child class
class Teacher(name: String): Person("Teacher", name){

    fun profession(){
        println("$name is a $role. $name teaches at school.")
    }

    fun doAll(){
        eat()
        sleep()
        profession()
    }



}

//------------------------------------------------------------------------------------

    //interface
interface MyBooks{

    var y: String ;

    fun hello()

}

    //abstarct class
abstract class Vehicle{

    //initialized variable
    var name : String = "Not Specidied"

    //abstract variable
    abstract var medium : String

    // function with body
    fun runsWhere(){
        println("The vehicle, $name , runs on $medium")
    }

    //abstract function
    abstract fun howItRuns()


}


//concreate class implementing abstracting class
class YourBooks : Vehicle() {

    override var medium: String = "air"

    override fun howItRuns() {
       //To change body of created functions use File | Settings | File Templates.
    }

    fun bolo(){

    }

    var x: String ="name"
    //hello

}




//------------------------------------------------------------------------------------
