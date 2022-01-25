package com.dicoding.kotlin.oop

fun main(){
    val o=animal("teguh", 12.22F,20,true)
    println("${o.nama}adalah namanya dengan berat ${o.berat} umur ${o.umur} gender pria?->${o.gender}")
    o.eat()
    o.sleep(10)
}
class animal(
    //properti
    val nama:String,
    val berat:Float,
    val umur:Int,
    val gender:Boolean
){
    //methode
    fun eat(){
        println("$nama lagi makan kamu")
    }

    fun sleep(lama:Int){
        println("$nama lagi tidur selama $lama jam")
    }
}


