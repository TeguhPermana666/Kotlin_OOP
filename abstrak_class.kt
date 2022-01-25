package com.dicoding.kotlin.oop
//abstrak kelas itu tidak bisa di instance atau di objectkan atau diturunkan cara akses?
//inheritence dari kelas lain
abstract  class kodomo(val nama:String,val Umur:Int){
    fun guguk(){
        println("$nama umur $Umur Tahun")
    }
}
class akses(val Pnama:String, val PUmur: Int):kodomo(Pnama,PUmur)

fun main(){
    val kadama = akses("Anjing", 10)
    kadama.guguk()
}