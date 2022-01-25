package com.dicoding.kotlin.oop

open class Hewan(val nama:String, val umur:Int, val berat:Float){
    //class ini bersifat final, tambahkan open untuk menghilangkan final
   open fun eat(){
        println("$nama Sedang Makan")
    }
    fun sleep(){
        println("$nama Sedang Tidur")
    }
}

class Burung(val pName:String, val pUmur:Int, val pBerat:Float):Hewan(pName,pUmur,pBerat){
    fun playingme(){
        println("$pName Main asikasik mantap")
    }
    //menggunakan function parrent atau property dll di child harus di ovveride
    override fun eat(){//kayak menumpuk data misal
        //a=10
        //a=20 gitu
        println("$nama WHY")
    }
}
fun main(){
    val objectt99 = Burung("Kintil",99,50.55F)
    objectt99.eat()//nama why
    objectt99.sleep()
    objectt99.playingme()
    objectt99.eat()//nama whyW
}