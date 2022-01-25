package com.dicoding.kotlin.oop
//default construc digunakan jika class tidak dibuatkan constructor secara manual maka secara otomatis constructor tercipta pada
//class jika suatu object dibuat dari representasi kelas sebagai instancenya
class default_constructor {
    val nama :String="Dicoding kintil"
    val umur :Int = 10
    val berat :Float = 10.45F
    val isAnimal :Boolean= true
}
fun main(){
    val default_construc = default_constructor()
    println("${default_construc.nama} ${default_construc.umur} ${default_construc.berat} ${default_construc.isAnimal}")

}