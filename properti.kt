package com.dicoding.kotlin.oop
class Animal{//penamaan class harus diawali dengan huruf besar
    var nama :String = "Ayam betok"
        //deklarasi set and get automatic
        get() {
            println("fungsi get terpanggil")
            return field
        }
        set(value) {
            println("fungsi set terpanggil")
            field = value

    }
}
fun main(){

    /**
     muttable properties properties yang secara default mengandung methode or fungsi setter and getter
     ->val , var . pada val ini just used to getter.
     */

    //properties acces

    //manual setter getter
    val objectt = Animal() //create objet karena modifernya default

    println("${objectt.nama}")//fungsi setter manual

    objectt.nama="Ayam berubah"//fungsi getter manual
    println("${objectt.nama}")

}