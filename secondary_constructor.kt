package com.dicoding.kotlin.oop

class Identitas (nama : String, umur:Int){//initial argument
    //property
    val nama: String
    val umur: Int
    var isAnimal: Boolean=false
    //primary construct
    init {//initial property
        this.nama = nama
        this.umur = if(umur<0)0 else umur
    }
    //secondary construct
    //constructor return to class if use property
    constructor(nama: String, umur: Int, isAnimal: Boolean) : this(nama,umur){
        this.isAnimal = isAnimal
    }
}

fun main(){
    val dicod = Identitas("Teguh",10)
    println("${dicod.nama} ${dicod.umur}")

    val bacot = Identitas("Tegar",20,true)
    println("${bacot.nama} ${bacot.umur} ${bacot.isAnimal}")

    println("${dicod.isAnimal}")//berarti jika suatu class di pass saja berubah pada default property
    println("${bacot.isAnimal}")
}