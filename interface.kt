package com.dicoding.kotlin.oop

/**
 Interface disini adalah sebuah class mirip abstrak kelas dari tidak ada deklarasi or pass parameter
 digunakan untuk mengumpulkan fungsi,construc, dan property secara abstrak tanpa deklarasi
 kelas deklarasinya di deklar pada kelas yg di implementasikan, implementsnya sama aja methodenya kyk intheritence
 */

interface Ifly {//I disini sebagai penanda bahwa dia adalah interface class wkwkwk biar ga bingung aja oi
    //dalamannya harus di implementasikan pada kelas implemented(bird)
    fun fly()
    val no:Int
}
class Bird(override var no:Int):Ifly{
    override fun fly(){
        if (no>0){
            println("I CAN FLY WITH MY $no")
        }
        else{
            println("I cant FLY babay")
        }
        no=100

    }
}

fun main(){
    val objik = Bird(30)
    objik.fly()
    println(objik.no)
}
