package com.dicoding.kotlin.oop
class Animals(var nama :String, var berat :Float, var umur :Int, val isAnimal:Boolean)//nama class ga boleh sama
//akses properti dengan properti extension dari class animals karena extension properti dilakukan diluar kelas
var Animals.extension_property:String
    get() {
        return "Nama ${this.nama} Berat ${this.berat} umur ${this.umur} dengan jenis hewan ?=>${this.isAnimal}"
    }
    set(value){
        extension_property= value
    }
// dalam satu folder

fun main(){
    val bendaa = Animals("Teguh", 70.55F,20,true)
    println(bendaa.extension_property)

    bendaa.nama= "Anjing"
    bendaa.umur=30
    bendaa.berat= 10.55F
    println(bendaa.extension_property)
}