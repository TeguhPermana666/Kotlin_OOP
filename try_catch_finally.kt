package com.dicoding.kotlin.oop
fun main() {
    val variabel_excepto: String? = null//null safety
    lateinit var assigg_variabel: String
    try {
        assigg_variabel = variabel_excepto!!
    } catch (e: Exception) {
        println("Error : $e")
    } finally {
        println(assigg_variabel)
    }
}