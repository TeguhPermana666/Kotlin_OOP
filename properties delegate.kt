package com.dicoding.kotlin.oop
import kotlin.reflect.KProperty

    /**
     delegate adalah membuat class setter and getter jadi ga usah buat methode banyak 2 jadi boilercode
     */
    //mirip kayak encapsulation
class DelegateName{
    //private hanya bisa diakses di dalam satu class tidak bisa diakses di kelas yg berbeda maka diperlukan ecapsulation
        //dengan set dan getter
    private var value:Any ="Default"//tipe datanya umum bisa di change tergantung keperluan dari main
    operator fun getValue(classRef:Any?,property :KProperty<*>):Any{
        println("Fungsi ini sama seperti getter untuk properti ${property.name} pada class $classRef")
        return value
    }
    operator fun setValue(classRef: Any?,property: KProperty<*>,newvalue:Any){
        println("Nilai ${property.name} dari: $value akan berubah menjadi $newvalue")
        value=newvalue
    }

}

class Animall{
    //setiap properti punya delegate sendiri, by itu representasi dari delegate property
    //delegatr brti mendelegasikan =>penetapan
    var nama :Any by DelegateName()//value pada nama adalah KIMOCI
    var berat:Any by DelegateName()//value pada berat adalah 10.55
    var umur :Any by DelegateName()//value pada umur adalah 18
    //jadi tidak ke replace gitu karena setiap properti alamatnya beda
}

fun main(){
    val benda = Animall()
    benda.nama="KIMOCI"
    benda.berat=10.55
    benda.umur=18

    println("Nama : ${benda.nama}")
    println("Berat:${benda.berat}")
    println("Umur : ${benda.umur}")
}
