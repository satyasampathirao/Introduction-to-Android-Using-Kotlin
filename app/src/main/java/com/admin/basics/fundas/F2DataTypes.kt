package com.admin.basics.fundas


//val - immutable
//var - mutable


//different types  of variable assaignment
val m1 = 10;
val m2 : Int = 50;


//-----------Data Types--------------------------------


var m5 : Byte =1;
var m6 : Short =2;
var m7 : Int =3;
var m8 : Long = 4;
var m9 : Float = 3.3f;
var m10 : Double = 4.5;


var m11 : Boolean = true;

var m12 : Char = 'a';
var m13 : String = "satya";


var m14  : Array<Int> = arrayOf(1,2,3);
val m15 = arrayOf(1,2,3,4,5)
var m16 = m15[0]





//----------------Difference between var and val---------------------------


var m17 :Int= 10;
var m18 : Long = m17.toLong();



//----------------------------------------------------------------------------


fun main(array: Array<String>){
    var value1=10;
    var value2 : Long = value1.toLong();

    print(value2);
}


