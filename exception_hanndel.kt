package com.dicoding.kotlin.oop
    /*
    1.try catch
    2.try catch finally
    3.multiple catch
     */
fun main(){
    val variabel_excepto:String? = null//null safety
    lateinit var assig_variabel :String

    try{
        assig_variabel= variabel_excepto!!
        println(assig_variabel)
    }
    catch(e : Exception){
        println("Error : $e")
    }


}