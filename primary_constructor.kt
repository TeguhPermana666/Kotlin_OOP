package com.dicoding.kotlin.oop

class kelas1(val nama:String,val umur:Int)

class kelas2(var Nama:String, var Umur:Int,var Berat :Float){
    init {
        this.Berat= if(Berat<0)0.1F else Berat
        this.Nama =Nama
        this.Umur=if(Umur<17) 0 else Umur
    }
}


fun main(){
    val benda1 = kelas1("teguh",10)//primay constructor
    println("Nama ${benda1.nama} dengan umur ${benda1.umur}")


    val benda2 = kelas2("Tegar",30,0F)
    println("Nama adalah ${benda2.Nama} dengan umur ${benda2.Umur} Berat adalah ${benda2.Berat}")

}