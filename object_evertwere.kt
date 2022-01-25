package com.dicoding.kotlin.oop
// tipe data pada kotlin merupakan sebuah object
fun main(){
    val kata:String = "teguh"//kata adalah object dari string sehingga kata dapat mengakses beberapa methode,constructor,atribut dari String
    //contoh bahwa kata adalah object dari kelas String
    println(kata.reversed())//mengakses methode reversed (membalikan string)
    println(kata.toUpperCase())

    //mengubah bentuk tipe data
    val kata2:String ="123"//string kan
    val kataInt=kata2.toInt()//rubah ke int
    println(kataInt is Int)


}
